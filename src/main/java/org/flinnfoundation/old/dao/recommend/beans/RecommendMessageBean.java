package org.flinnfoundation.old.dao.recommend.beans;

import org.flinnfoundation.old.dao.beans.AbstractDataBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "message")
@XmlAccessorType(XmlAccessType.FIELD)

public class RecommendMessageBean extends AbstractDataBean {
	@XmlElement(name = "messageid")
	protected int messageid;
	@XmlElement(name = "priority")
	protected int priority;
	@XmlElement(name = "message")
	protected String message;
	@XmlElement(name = "messagetag")
	protected String messagetag;

	public RecommendMessageBean() {
		super();
	}

	public int getMessageid() {
		return messageid;
	}

	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessagetag() {
		return messagetag;
	}

	public void setMessagetag(String messagetag) {
		this.messagetag = messagetag;
	}

}
