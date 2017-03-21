package flinn.recommend.beans.request;

import flinn.beans.AbstractDataBean;
import flinn.recommend.beans.RecommendDiagnosisBean;
import flinn.recommend.beans.RecommendMessageBean;
import flinn.recommend.beans.RecommendRuleCriteriaBean;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "recommendmessage")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@EqualsAndHashCode(callSuper=false)
public class RequestRuleBean  extends AbstractDataBean {
    @XmlElement(name = "ruleId")
    protected int ruleId;
    @XmlElement(name = "priority")
    protected int priority;
    @XmlElement(name = "valid")
    protected Boolean valid;
    @XmlElement(name = "ruleType")
    protected String ruleType;
    @XmlElement(name = "ruleName")
    protected String ruleName;
    @XmlElement(name = "criteria")
    protected RecommendRuleCriteriaBean[] criteria;
    @XmlElement(name = "messages")
    protected RecommendMessageBean[] messages;
    @XmlElement(name = "diagnoses")
    protected RecommendDiagnosisBean[] diagnoses;
}
