package org.flinnfoundation.old.dao.beans.response;

import org.flinnfoundation.old.dao.beans.AbstractDataBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseContainerBean extends AbstractDataBean {
	@XmlElement(name = "action")
	protected ResponseActionBean action;

	public ResponseActionBean getAction() {
		return action;
	}
	public void setAction(ResponseActionBean action) {
		this.action = action;
	}

}
