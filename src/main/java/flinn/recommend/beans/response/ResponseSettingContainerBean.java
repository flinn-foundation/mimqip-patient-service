package flinn.recommend.beans.response;

import flinn.beans.response.ResponseContainerBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseSettingContainerBean extends ResponseContainerBean {
	@XmlElement(name = "setting")
	protected ResponseSettingBean setting;

	public ResponseSettingBean getSetting() {
		return setting;
	}

	public void setSetting(ResponseSettingBean bean) {
		this.setting = bean;
	}
}
