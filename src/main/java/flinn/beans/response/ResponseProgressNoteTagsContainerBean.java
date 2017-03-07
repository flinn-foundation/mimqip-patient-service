package flinn.beans.response;

import flinn.beans.ProgressNoteTagBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)

public class ResponseProgressNoteTagsContainerBean extends ResponseContainerBean {

	@XmlElement(name = "tags")
	protected ProgressNoteTagBean[] tags;

	public ProgressNoteTagBean[] getTags() {
		return tags;
	}
	public void setTags(ProgressNoteTagBean[] tags) {
		this.tags = tags;
	}
}
