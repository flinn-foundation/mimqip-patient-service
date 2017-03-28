package flinn.old.dao.rcopia.service;

import flinn.old.dao.beans.response.ResponsePatientBean;
import flinn.old.dao.model.Medication;
import flinn.old.dao.rcopia.model.*;
import flinn.service.*;
import flinn.old.dao.util.DateString;
import org.apache.log4j.Logger;

import java.util.*;

public class RcopiaService extends BaseService
{

	private static final Logger LOG = Logger.getLogger(RcopiaService.class);

	private final RcopiaTransformationService transform = new RcopiaTransformationService();
	private final RcopiaSenderService sender = new RcopiaSenderService();

	private final PrescriptionEventService prescriptionEventService = new PrescriptionEventService();
	private final MedicationService medicationService = new MedicationService();
	private final OldPatientService oldPatientService = new OldPatientService();

	public RcExtResponseType updateMedications(Date lastUpdatedDate) throws RcopiaTransformationException, RcopiaSenderException, RcopiaServiceException, ServiceException
	{
		LOG.debug("lastUpdatedDate=" + lastUpdatedDate);

		RcExtRequestType rcRequest = transform.createUpdateMedicationRequest(lastUpdatedDate);
		LOG.debug("Created Rcopia request for update_medication");

		RcExtResponseType rcResponse = callWebService(rcRequest);
		validateRcopiaResponse(rcResponse);
		processRcResponseForUpdateMedication(rcResponse);
		return rcResponse;
	}

	public RcExtResponseType updateMedications(int patientId) throws ServiceException, RcopiaTransformationException, RcopiaSenderException, RcopiaServiceException
	{
		ResponsePatientBean patientBean = oldPatientService.getPatientResponseBean(patientId);
		return updateMedications(patientBean);
	}

	public RcExtResponseType updateMedications(ResponsePatientBean patientBean) throws RcopiaTransformationException, RcopiaSenderException, RcopiaServiceException, ServiceException
	{
		Date lastUpdatedDate = null;
		if (patientBean.getRcopiaLastUpdatedDate() == null)
		{
			// Create patient.  Not in RCopia.
			createPatient(patientBean);
			lastUpdatedDate = DateString.parseRcopiaDate("01/01/1979 00:00:00", "MM/dd/yyyy HH:mm:ss");
		}
		else
		{
			lastUpdatedDate = patientBean.getRcopiaLastUpdatedDate();
		}

		RcExtRequestType rcRequest = transform.createUpdateMedicationRequest(lastUpdatedDate, patientBean.getPatientid());
		LOG.debug("Created Rcopia request for update_medication");

		RcExtResponseType rcResponse = callWebService(rcRequest);
		validateRcopiaResponse(rcResponse);
		processRcResponseForUpdateMedication(rcResponse);
		oldPatientService.updateRcopiaDate(patientBean.getPatientid(), new Date());
		return rcResponse;
	}

	public Map<String, Integer> getNotificationCount(String userId) throws ServiceException, RcopiaTransformationException, RcopiaSenderException, RcopiaServiceException
	{
		return getNotificationCount(userId, "all");
	}

	public Map<String, Integer> getNotificationCount(String userId, String notificationType) throws ServiceException, RcopiaTransformationException, RcopiaSenderException, RcopiaServiceException
	{
		if (!notificationType.matches("all|(refill|note|error|share|request_share|rx_pending|rx_need_signing)"))
		{
			throw new IllegalArgumentException("Invalid Notification Type.  Must be one of \"all|refill|note|error|share|request_share|rx_pending|rx_need_signing\"");
		}
		RcExtRequestType rcRequest = transform.createGetNotificationCountRequest(userId, notificationType);
		LOG.debug("Created Rcopia request for get_notification_count");

		RcExtResponseType rcResponse = callWebService(rcRequest);
		validateRcopiaResponse(rcResponse);

		return processRcResponseForGetNotificationCount(rcResponse);
	}

	public RcExtResponseType createPatient(int patientId) throws ServiceException, RcopiaServiceException, RcopiaTransformationException, RcopiaSenderException
	{
		ResponsePatientBean patientBean = oldPatientService.getPatientResponseBean(patientId);
		return createPatient(patientBean);
	}

	public RcExtResponseType createPatient(ResponsePatientBean patientBean) throws RcopiaServiceException, RcopiaTransformationException, RcopiaSenderException, ServiceException
	{
		RcExtRequestType rcRequest = transform.createSendPatientRequest(patientBean);
		LOG.debug("Created Rcopia request for send_patient");

		RcExtResponseType rcResponse = callWebService(rcRequest);
		validateRcopiaResponse(rcResponse);

		oldPatientService.updateRcopiaDate(patientBean.getPatientid(), new Date());
		return rcResponse;
	}

	private void processRcResponseForUpdateMedication(RcExtResponseType rcResponse) throws RcopiaServiceException, ServiceException
	{
		ResponseType response = rcResponse.getResponse();
		MedicationListType medicationListType = response.getMedicationList();
		List<MedicationType> medicationTypeList = medicationListType.getMedication();

		/*
		 * Process medications from DrFirst and put in a medication list
		 */
		List<Medication> medications = new ArrayList<Medication>();
		LOG.debug("Building medication list from flinn.old.dao.rcopia response");
		for (Iterator<MedicationType> iter = medicationTypeList.iterator(); iter.hasNext();)
		{
			MedicationType medicationType = iter.next();
			Medication medication = new Medication(medicationType);
			medications.add(medication);
		}

		/*
		 * Update the database with medications
		 * Note: This uses the flinn.service to keep in it's own transaction
		 */
		LOG.debug("Updating medication list in database");
		List<Medication> modifiedMedications = medicationService.mergeMedications(medications);

		LOG.debug("Updating PrescriptionEvent table");
		prescriptionEventService.updatePrescriptionEvents(modifiedMedications);
	}

	private Map<String, Integer> processRcResponseForGetNotificationCount(RcExtResponseType rcResponse) throws RcopiaServiceException, ServiceException
	{
		Map<String, Integer> userNotifications = new HashMap<String, Integer>();
		ResponseType response = rcResponse.getResponse();
		List<NotificationCountType> notifications = response.getNotificationCountList().getNotificationCount();
		for (Iterator<NotificationCountType> iter=notifications.iterator(); iter.hasNext(); )
		{
			NotificationCountType notificationCountType = iter.next();
			String notificationType = notificationCountType.getType();
			int notificationCount = notificationCountType.getNumber().intValue();
			userNotifications.put(notificationType, new Integer(notificationCount));
		}
		return userNotifications;
	}

	private RcExtResponseType callWebService(RcExtRequestType rcRequest) throws RcopiaTransformationException, RcopiaSenderException
	{
		String requestXml = transform.convertRcopiaRequestToXml(rcRequest);
		LOG.debug("Converted Rcopia request object to XML: " + requestXml);

		String responseXml = sender.sendMessage(requestXml);
		LOG.debug("Received Rcopia response object as XML: " + responseXml);

		RcExtResponseType rcResponse = transform.convertXmlToRcopiaResponse(responseXml);

		return rcResponse;
	}

	private void validateRcopiaResponse(RcExtResponseType rcResponse) throws RcopiaSenderException
	{
		if (rcResponse.getResponse().getStatus() != null && rcResponse.getResponse().getStatus().equalsIgnoreCase("ok"))
		{
			LOG.debug("Converted response XML to Rcopia response object.  Status: " + rcResponse.getResponse().getStatus());
		}
		else
		{
			LOG.error("Error received from DrFirst.  Status:" + rcResponse.getResponse().getStatus() + "  Error Code=" + rcResponse.getResponse().getError().getCode() + "  Error Text="
			    + rcResponse.getResponse().getError().getText());
			throw new RcopiaSenderException("Error creating patient in DrFirst.  Error Code: " + rcResponse.getResponse().getError().getCode() + "  Error Text: "
			    + rcResponse.getResponse().getError().getText());
		}
	}

}
