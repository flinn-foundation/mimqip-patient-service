package flinn.controller.recommend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diagnosis")
public class DiagnosisController {

//    @GetMapping
//    public String getDiagnosis() {
//
//        boolean first = true;
//        String criteria = "false";
//
//        flinn.old.dao.recommend.beans.RecommendDiagnosisBean[] diagnosisList = null;
//        flinn.old.dao.recommend.dao.DaoRecommendManager dm = new flinn.old.dao.recommend.dao.DaoRecommendManager();
//        ResponseSessionContainerBean userSession = dm.getSession(authcode, request);
//
//        try {
//            diagnosisList = dm.findAllDiagnoses(); //function call to get diagnosis
//
//            try {
//                //function call to update user's last activity
//                lastactivity = dm.updateLastActivity(userSession);
//                dm.commitConnection("updateLastActivity");
//            } catch (Exception e) {
//                dm.rollbackConnection("updateLastActivity");
//                dm.LOG.debug("Unable to commit changes to updateLastActivity");
//            }
//        } catch (Exception e) {
//            dm.LOG.debug("Unable to open connection for findAllDiagnoses");
//        } finally {
//            dm.disposeConnection("findAllDiagnoses");
//        }
//
//        if (diagnosisList != null) {
//            for (int i = 0; i < diagnosisList.length; i++) {
//                if (!first) {
//                }
//            }
//        }
//
//        return "SOMETHING";
//    }
//
//    @GetMapping("/{id}")
//    public void getDiagnosisById(@PathVariable("id") String id) {
//        int adminid = -1;
//        String serverName = request.getServerName();
//        Boolean isAdmin = false, isSuperAdmin = false;
//        Boolean editable = false;
//        Boolean postType = false;
//        Boolean hasEdit = false;
//        String jspSelf = request.getRequestURI().toString();
//
//        int did = -1;
//        int diagnosisid = -1;
//        String diagnosisName = "", stage = "", notes = "";
//        int lastactivity = -1;
//        RecommendDiagnosisBean diagnosis = null;
//        RecommendTreatmentGuidelineBean[] treatments = null;
//        RecommendRuleCriteriaBean[] rulecriterion = null;
//
//        String authcode = flinn.old.dao.util.CookieHandler.getCookie("authcode", request);
//        flinn.old.dao.recommend.dao.DaoRecommendManager dm = new flinn.old.dao.recommend.dao.DaoRecommendManager();
//        flinn.old.dao.beans.response.ResponseSessionContainerBean userSession = dm.getSession(authcode, request);
//        try {
//            //function call to update user's last activity
//            lastactivity = dm.updateLastActivity(userSession);
//            dm.commitConnection("updateLastActivity");
//        } catch (Exception e) {
//            dm.rollbackConnection("updateLastActivity");
//            dm.LOG.debug("Unable to commit changes to updateLastActivity");
//        }
//
//        adminid = userSession.getUser().getAppuserid();
//
//        if (request.getParameter("id") != null) {
//            diagnosisid = Integer.parseInt(request.getParameter("id"));
//        }
//
//        if (request.getParameter("Diagnosis") != null) {
//            diagnosisName = request.getParameter("Diagnosis");
//        }
//
//        if (request.getParameter("Stage") != null) {
//            stage = request.getParameter("Stage");
//        }
//
//        if (request.getParameter("Notes") != null) {
//            stage = request.getParameter("Notes");
//        }
//
//        if (flinn.old.dao.util.AdminRole.isRecommendAdmin(userSession)) {
//            isAdmin = true;
//        }
//        if (flinn.old.dao.util.AdminRole.isAdmin(userSession)) {
//            isSuperAdmin = true;
//        }
//
//        if (request.getMethod() != null) {
//            if (request.getMethod().equals("POST")) {
//                postType = true;
//            }
//        }
//
//        if (request.getParameter("edit") != null) {
//            if (request.getParameter("edit").equals("y")) {
//                hasEdit = true;
//            }
//        }
//
//
//        if (isAdmin && postType) {
//        }
//
//
//        try {
//
//            if (diagnosisid > 0) {
//
//                flinn.old.dao.recommend.beans.RecommendDiagnosisBean input = new flinn.old.dao.recommend.beans.RecommendDiagnosisBean();
//                flinn.old.dao.recommend.beans.RecommendDiagnosisBean[] diagnosisList = null;
//                diagnosisList = dm.findAllDiagnoses(); //function call to get diagnosis
//                if (diagnosisList != null) {
//                    for (int i = 0; i < diagnosisList.length; i++) {
//                        if (diagnosisList[i].getDiagnosisid() == diagnosisid) {
//                            diagnosis = diagnosisList[i];
//                            treatments = diagnosis.getTreatments();
//                            break;
//                        }
//                    }
//                }
//
//                if (diagnosis != null) {
//                    diagnosisName = diagnosis.getDiagnosis();
//                    stage = diagnosis.getStage();
//                    notes = diagnosis.getNotes();
//                }
//            }
//        } catch (Exception e) {
//            dm.LOG.debug("Unable to open connection findAllDiagnoses");
//        }
//
//
//        editable = false;   // Whether or not this is to edit the information
//        if (isAdmin && hasEdit) {
//            editable = true;
//        }
//    }

}
