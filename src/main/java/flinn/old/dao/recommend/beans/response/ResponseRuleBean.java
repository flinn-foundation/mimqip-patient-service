package flinn.old.dao.recommend.beans.response;

import flinn.old.dao.beans.AbstractDataBean;
import flinn.old.dao.recommend.beans.RecommendDiagnosisBean;
import flinn.old.dao.recommend.beans.RecommendMessageBean;
import flinn.old.dao.recommend.beans.RecommendRuleCriteriaBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "recommendmessage")
@XmlAccessorType(XmlAccessType.FIELD)

public class ResponseRuleBean extends AbstractDataBean{
	@XmlElement(name = "ruleId")
	protected int ruleid;
	@XmlElement(name = "priority")
	protected int priority;
	@XmlElement(name = "valid")
	protected Boolean valid;
	@XmlElement(name = "ruleType")
	protected String ruletype;
	@XmlElement(name = "ruleName")
	protected String rulename;
	@XmlElement(name = "criteria")
	protected RecommendRuleCriteriaBean[] criteria;
	@XmlElement(name = "messages")
	protected RecommendMessageBean[] messages;
	@XmlElement(name = "diagnoses")
	protected RecommendDiagnosisBean[] diagnoses;

	public ResponseRuleBean() {
		super();
	}

	public ResponseRuleBean (ResponseRuleBean reqRule) {
	}

	public int getRuleid() {
		return ruleid;
	}

	public void setRuleid(int ruleid) {
		this.ruleid = ruleid;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public String getRuletype() {
		return ruletype;
	}

	public void setRuletype(String ruletype) {
		this.ruletype = ruletype;
	}

	public String getRulename() {
		return rulename;
	}

	public void setRulename(String rulename) {
		this.rulename = rulename;
	}

	public RecommendRuleCriteriaBean[] getCriteria() {
		return criteria;
	}

	public void setCriteria(RecommendRuleCriteriaBean[] criteria) {
		this.criteria = criteria;
	}

	public RecommendMessageBean[] getMessages() {
		return messages;
	}

	public void setMessages(RecommendMessageBean[] messages) {
		this.messages = messages;
	}

	public RecommendDiagnosisBean[] getDiagnoses() {
		return diagnoses;
	}

	public void setDiagnoses(RecommendDiagnosisBean[] diagnoses) {
		this.diagnoses = diagnoses;
	}

}
