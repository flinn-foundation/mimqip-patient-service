package flinn.controller.recommend;

import flinn.beans.request.RequestContainerBean;
import flinn.recommend.beans.RecommendRuleCriteriaBean;
import flinn.recommend.beans.request.RequestRuleBean;
import flinn.recommend.beans.response.ResponseRuleBean;
import flinn.recommend.dao.DaoRecommendManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/criteria/details")
public class CriteriaDetailsController {

    @DeleteMapping
    public void deleteCriteriaDetails(@RequestParam("ruleId") int ruleId,
                                      @RequestParam("criterionId") int criterionId) {

        DaoRecommendManager dm = new DaoRecommendManager();

        ResponseRuleBean rule;
        RecommendRuleCriteriaBean[] ruleCriteria = new RecommendRuleCriteriaBean[0];

        try {
            rule = dm.findRule(ruleId);

            if (rule != null) {
                ruleCriteria = rule.getCriteria();
                if (criterionId > 0 && ruleCriteria != null) {

                    // convert array to arraylist and back again to delete an element
                    List<RecommendRuleCriteriaBean> critList = new ArrayList<>();
                    for (RecommendRuleCriteriaBean ruleCriterion : ruleCriteria) {
                        if (ruleCriterion.getCriteriaid() != criterionId) {
                            critList.add(ruleCriterion);
                        }
                    }

                    RecommendRuleCriteriaBean[] ar = new RecommendRuleCriteriaBean[ruleCriteria.length - 1];
                    ruleCriteria = critList.toArray(ar);

                }
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        RequestRuleBean input = new RequestRuleBean();
        RequestContainerBean rqcont = new RequestContainerBean();
        input.setRuleId(ruleId);
        input.setCriteria(ruleCriteria);
        rqcont.setRule(input);

        try {
            dm.updateRule(rqcont, null);
        } catch (Exception e) {
            dm.rollbackConnection("updateRule");
            log.debug("Unable to commit changes to updateRule");
        }
    }

    @PutMapping
    public void updateCriterionDetails() {

    }

    @PostMapping
    public void addCriterionDetails(@RequestBody RecommendRuleCriteriaBean recommendRuleCriteriaBean) {

        DaoRecommendManager dm = new DaoRecommendManager();
        // convert array to arraylist and back again to add another element
        List<RecommendRuleCriteriaBean> critList = new ArrayList<>();
        int critLength = 0;

        critList.add(recommendRuleCriteriaBean);
        RecommendRuleCriteriaBean[] ar = new RecommendRuleCriteriaBean[critLength + 1];
        RecommendRuleCriteriaBean[] rulecriterion = critList.toArray(ar);



        RequestRuleBean input = new RequestRuleBean();
        RequestContainerBean rqcont = new RequestContainerBean();
        input.setRuleId(recommendRuleCriteriaBean.getRuleid());
        input.setCriteria(rulecriterion);
        rqcont.setRule(input);

        try {
            dm.updateRule(rqcont, null);
        } catch (Exception e) {
            dm.rollbackConnection("updateRule");
            log.debug("Unable to commit changes to updateRule");
        }

    }

    @GetMapping
    public String criteriaDetails(Map<String, Object> model,
                                  @RequestParam("ruleId") int ruleId,
                                  @RequestParam("criterionId") int criterionId) {

        model.put("editable", true);

        DaoRecommendManager dm = new DaoRecommendManager();
        if (ruleId > 0) {
            RecommendRuleCriteriaBean adminCriteria = null;
            ResponseRuleBean rule = new ResponseRuleBean();
            try {
                rule = dm.findRule(ruleId);
            } catch (Exception e) {
                log.debug("Unable to open connection findRule (2)", e);
            }
            if (rule != null) {
                RecommendRuleCriteriaBean[] rulecriterion = rule.getCriteria();
                if (rulecriterion != null) {
                    for (int i = 0; i < rulecriterion.length; i++) {
                        if (rulecriterion[i].getCriteriaid() == criterionId) {
                            // populate the criteria object
                            adminCriteria = rulecriterion[i];
                            model.put("adminCriteria", adminCriteria);
                        }
                    }
                }
            }
        }

        return "recommend/criteria_detail";
    }
}
