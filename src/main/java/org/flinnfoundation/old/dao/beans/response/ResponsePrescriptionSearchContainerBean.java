package org.flinnfoundation.old.dao.beans.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;

@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)

public class ResponsePrescriptionSearchContainerBean extends ResponseContainerBean {
	@XmlElement(name = "prescriptions")
    protected HashMap<String, ResponsePrescriptionBean[]> prescriptions;

	public HashMap<String, ResponsePrescriptionBean[]> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(
			HashMap<String, ResponsePrescriptionBean[]> prescriptions) {
		this.prescriptions = prescriptions;
	}
}
