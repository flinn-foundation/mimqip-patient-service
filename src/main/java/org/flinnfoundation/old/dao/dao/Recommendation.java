package org.flinnfoundation.old.dao.dao;

import org.flinnfoundation.old.dao.beans.request.RequestContainerBean;
import org.flinnfoundation.old.dao.beans.request.RequestPatientBean;
import org.flinnfoundation.old.dao.beans.response.ResponseActionBean;
import org.flinnfoundation.old.dao.beans.response.ResponseContainerBean;
import org.flinnfoundation.old.dao.beans.response.ResponseRecommendationContainerBean;
import org.flinnfoundation.old.dao.beans.response.ResponseSessionContainerBean;
import org.flinnfoundation.old.dao.recommend.dao.DaoRecommendRequestManager;
import org.flinnfoundation.service.ServiceException;

import java.sql.Connection;

public class Recommendation extends AbstractBaseDao
{

	public ResponseContainerBean handleInitialStaging(RequestContainerBean input, ResponseSessionContainerBean session, Connection connection, boolean b)
	{
		return ((new DaoRecommendRequestManager()).handleInitialStaging(input, session, connection, b));
	}

	public ResponseContainerBean handleReason(RequestContainerBean input, ResponseSessionContainerBean session, Connection connection, boolean b)
	{
		return ((new DaoRecommendRequestManager()).handleReason(input, session, connection, b));
	}

	public boolean handleConsistencyCheck(int patientid) throws ServiceException {
		return ((new DaoRecommendRequestManager()).handleConsistencyCheck(patientid));
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
		return ((new DaoRecommendRequestManager()).requestRecommendation(patientreq));
	}


}
