package flinn.old.dao.dao;

import java.sql.Connection;

import flinn.old.dao.beans.request.RequestContainerBean;
import flinn.old.dao.beans.request.RequestPatientBean;
import flinn.old.dao.beans.response.ResponseActionBean;
import flinn.old.dao.beans.response.ResponseContainerBean;
import flinn.old.dao.beans.response.ResponseRecommendationContainerBean;
import flinn.old.dao.beans.response.ResponseSessionContainerBean;
import flinn.service.ServiceException;

public class Recommendation extends AbstractBaseDao
{

	public ResponseContainerBean handleInitialStaging(RequestContainerBean input, ResponseSessionContainerBean session, Connection connection, boolean b)
	{
		return ((new flinn.old.dao.recommend.dao.DaoRecommendRequestManager()).handleInitialStaging(input, session, connection, b));
	}

	public ResponseContainerBean handleReason(RequestContainerBean input, ResponseSessionContainerBean session, Connection connection, boolean b)
	{
		return ((new flinn.old.dao.recommend.dao.DaoRecommendRequestManager()).handleReason(input, session, connection, b));
	}

	public boolean handleConsistencyCheck(int patientid) throws ServiceException {
		return ((new flinn.old.dao.recommend.dao.DaoRecommendRequestManager()).handleConsistencyCheck(patientid));
	}

	public ResponseContainerBean handleRequest(RequestContainerBean input, ResponseSessionContainerBean session, Connection connection, boolean b)
	{
		if (input.getPatient() == null) {
			return DaoRequestManager.generateErrorBean(input.getAction(), "Inappropriate arguments (no patient submitted)", 101);
		}
		if (input.getPatient().getPatientid() <= 0)
		{
			return DaoRequestManager.generateErrorBean(input.getAction(), "Inappropriate arguments (inappropriate patientid)", 101);
		}
		// if (input.getPatient().getFacilityid() != session.getFacility().getFacilityid()) {
		//	return DaoRequestManager.generateErrorBean(input.getAction(), "Inappropriate arguments (inappropriate facilityid, number)", 101);
		// }

		ResponseRecommendationContainerBean rcb = requestRecommendation(input.getPatient());
		if (rcb == null) {
			return DaoRequestManager.generateErrorBean(input.getAction(), "Inappropriate arguments (no patient submitted)", 101);
		}
		rcb.setAction(new ResponseActionBean(input.getAction()));
		return rcb;
	}

	public ResponseRecommendationContainerBean requestRecommendation(RequestPatientBean patientreq)
	{
		return ((new flinn.old.dao.recommend.dao.DaoRecommendRequestManager()).requestRecommendation(patientreq));
	}


}
