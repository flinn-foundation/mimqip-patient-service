package flinn.model;

import flinn.old.dao.recommend.beans.RecommendDiagnosisBean;
import flinn.old.dao.recommend.beans.RecommendMessageBean;
import flinn.old.dao.recommend.beans.RecommendRuleCriteriaBean;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class RuleEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private RuleType type;

    private int priority;

    private Boolean valid;

    @Transient
    private List<RecommendRuleCriteriaBean> criteria;

    @Transient
    private List<RecommendMessageBean> messages;

    @Transient
    private List<RecommendDiagnosisBean> diagnoses;


}
