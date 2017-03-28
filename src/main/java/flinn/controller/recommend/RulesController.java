package flinn.controller.recommend;

import flinn.service.RulesService;
import io.swagger.annotations.ApiParam;
import io.swagger.api.RulesApi;
import io.swagger.model.Rule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class RulesController implements RulesApi {

    private RulesService rulesService;

    @Autowired
    public RulesController(RulesService rulesService) {
        this.rulesService = rulesService;
    }

//    @ApiResponses({
//            @ApiResponse(code = 200, message = "Array of rules", response = Rule.class)})
//    public ResponseEntity<List<Rule>> rulesGet() {
//
//        return new ResponseEntity<>(rulesService.getAllRules(), HttpStatus.OK);
//    }

    @Override
    public ResponseEntity<List<Rule>> rulesGet() {
        return new ResponseEntity<>(rulesService.getAllRules(), HttpStatus.OK);
    }

    public ResponseEntity<Rule> rulesIdGet(@ApiParam(value = "ID of rule to fetch",required=true ) @PathVariable("id") Long id) {

        return new ResponseEntity<>(rulesService.getRule(id), HttpStatus.OK);
    }

//    @GetMapping
//    public String getRules() {
//
//        boolean first = true;
//        String criteria = "false";
//        String authcode = flinn.old.dao.util.CookieHandler.getCookie("authcode", request);
//
//
//
//        List<ResponseRuleBean> ruleList = null;
//        flinn.old.dao.recommend.dao.DaoRecommendManager dm = new flinn.old.dao.recommend.dao.DaoRecommendManager();
//        flinn.old.dao.beans.request.RequestContainerBean input = new flinn.old.dao.beans.request.RequestContainerBean();
//        ResponseSessionContainerBean userSession = dm.getSession(authcode, request);
//        int lastactivity = -1;
//        Boolean isSuperAdmin = false;
//        if (flinn.old.dao.util.AdminRole.isAdmin(userSession)) isSuperAdmin = true;
//
//        try {
//            ruleList = dm.findAllRules(input, userSession, orderby); //function call to get rules
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
//            dm.LOG.debug("Unable to open connection for findAllRules");
//        } finally {
//            dm.disposeConnection("findAllRules");
//        }
//
//        if (ruleList != null) {
//            for (int i = 0; i < ruleList.size(); i++) {
//                if (!first) {
//                    return "recommend/rule";
//                }
//            }
//        }
//
//        return "";
//    }

//    @GetMapping("/{id}")
//    public void getRuleById() {
//
//        int adminid = -1;
//        String serverName = request.getServerName();
//        Boolean isAdmin = false, isSuperAdmin = false;
//        Boolean editable = false;
//        Boolean postType = false;
//        Boolean hasEdit = false;
//        String jspSelf = request.getRequestURI().toString();
//
//        int rid = -1;
//        int ruleid = -1;
//        int priority = -1;
//        int truemessageid = -1, falsemessageid = -1;
//        String ruleType = "", ruleName = "";
//        int lastactivity = -1;
//        RecommendDiagnosisBean[] rulediagnoses = null;
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
//            ruleid = Integer.parseInt(request.getParameter("id"));
//        }
//
//        if (request.getParameter("Priority") != null) {
//            priority = Integer.parseInt(request.getParameter("Priority"));
//        }
//
//        if (request.getParameter("TrueMessage") != null) {
//            truemessageid = Integer.parseInt(request.getParameter("TrueMessage"));
//        }
//
//        if (request.getParameter("FalseMessage") != null) {
//            falsemessageid = Integer.parseInt(request.getParameter("FalseMessage"));
//        }
//
//        if (request.getParameter("RuleType") != null) {
//            ruleType = request.getParameter("RuleType");
//        }
//
//        if (request.getParameter("RuleName") != null) {
//            ruleName = request.getParameter("RuleName");
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
//            flinn.old.dao.beans.request.RequestContainerBean rqcont = new flinn.old.dao.beans.request.RequestContainerBean();
//            flinn.old.dao.recommend.beans.request.RequestRuleBean input = new flinn.old.dao.recommend.beans.request.RequestRuleBean();
//
//            input.setRuleId(ruleid);
//            input.setPriority(priority);
//            input.setRuleType(ruleType);
//            input.setRuleName(ruleName);
//            input.setDiagnoses(flinn.old.dao.util.AdminFunctions.getDiagnosisFromForm(request));
//
//            ArrayList<RecommendMessageBean> mb = new ArrayList<RecommendMessageBean>();
//            mb.add(dm.findMessage(truemessageid).getRecommendMessageBean());
//            if (falsemessageid > 0) {
//                mb.add(dm.findMessage(falsemessageid).getRecommendMessageBean());
//            }
//            input.setMessages(mb.toArray(new RecommendMessageBean[mb.size()]));
//
//            Boolean isValid = false;
//            if (request.getParameter("Valid") != null) {
//                if (request.getParameter("Valid").equals("1")) {
//                    isValid = true;
//                }
//            }
//            input.setValid(isValid);
//
//
//            // input.setMessages();
//
//            if (ruleid > 0) {
//                // Update rule
//                rqcont.setRule(input);
//                flinn.old.dao.recommend.beans.response.ResponseRuleContainerBean rspBean = new flinn.old.dao.recommend.beans.response.ResponseRuleContainerBean();
//
//                try {
//                    rspBean = (flinn.old.dao.recommend.beans.response.ResponseRuleContainerBean) dm.updateRule(rqcont, userSession);
//                    rid = rspBean.getRule().getRuleid();
//                } catch (Exception e) {
//                    dm.rollbackConnection("updateRule");
//                    dm.LOG.debug("Unable to commit changes to updateRule");
//                }
//            } else {
//                // Create rule
//                try {
//                    rqcont.setRule(input);
//                    rid = dm.createRule(rqcont, userSession);
//                } catch (Exception e) {
//                    dm.rollbackConnection("createRule");
//                    dm.LOG.debug("Unable to commit changes to createRule");
//                }
//            }
//
//            // generate the response rule
//            if (rid > 0) {
//                if (ruleid > 0) {
//                    response.sendRedirect("/recommend/rule_detail.jsp?id=" + rid + "&reason=rule+changes+saved");
//                } else {
//                    response.sendRedirect("/recommend/rule_detail.jsp?id=" + rid + "&reason=rule+created");
//                }
//            } else {
//                response.sendRedirect("/admin/error.jsp?reason=" + rid);
//            }
//
//            ruleid = rid;
//
//        }
//
//
//        flinn.old.dao.recommend.beans.response.ResponseRuleBean adminRule = new flinn.old.dao.recommend.beans.response.ResponseRuleBean();
//        if (ruleid > 0) {
//
//            try {
//                adminRule = dm.findRule(ruleid);
//                ruleid = adminRule.getRuleid();
//                priority = adminRule.getPriority();
//                ruleName = adminRule.getRulename();
//                ruleType = adminRule.getRuletype();
//                rulediagnoses = adminRule.getDiagnoses();
//                rulecriterion = adminRule.getCriteria();
//                truemessageid = adminRule.getMessages()[0].getMessageid();
//                falsemessageid = adminRule.getMessages()[1].getMessageid();
//
//
//            } catch (Exception e) {
//                dm.LOG.debug("Unable to open connection findRule");
//            }
//
//
//        }
//
//        editable = false;   // Whether or not this is to edit the information
//        if (isAdmin && hasEdit) {
//            editable = true;
//        }
//
//    }
//
//    public void logicFromJSP() {
//        flinn.old.dao.recommend.beans.RecommendDiagnosisBean[] ar = dm.findAllDiagnoses();
//
//        //Pull user role
//        //flinn.old.dao.beans.AppUserRoleBean[] urar = adminUser.getUser().getRoles();
//
//        for (int i = 0; i < ar.length; i++) { //Loop thru all diagnoses
//            if (!isSuperAdmin && i == 0) {
//                i++;
//            } //Skip Admin if user isn't a superadmin
//            RecommendDiagnosisBean diagnoses = (RecommendDiagnosisBean) ar[i];
//
//
//            //
//            List<ResponseMessageBean> lma = dm.findAllMessages(null, userSession, null);
//            ResponseMessageBean[] ar = lma.toArray(new ResponseMessageBean[lma.size()]);
//        }
//    }



}
