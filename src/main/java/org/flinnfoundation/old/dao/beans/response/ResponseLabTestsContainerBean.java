package org.flinnfoundation.old.dao.beans.response;

import org.flinnfoundation.old.dao.beans.LabTestBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)

public class ResponseLabTestsContainerBean extends ResponseContainerBean {

	@XmlElement(name = "labtests")
	protected LabTestBean[] labtests;

	public LabTestBean[] getLabtests() {
		return labtests;
	}
	public void setLabtests(LabTestBean[] labtests) {
		this.labtests = labtests;
	}

}
