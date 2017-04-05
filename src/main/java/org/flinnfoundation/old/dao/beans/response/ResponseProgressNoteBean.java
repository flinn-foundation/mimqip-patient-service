package org.flinnfoundation.old.dao.beans.response;

import org.flinnfoundation.old.dao.beans.AbstractDataBean;
import org.flinnfoundation.old.dao.beans.ProgressNoteTagBean;
import org.flinnfoundation.old.dao.beans.request.RequestProgressNoteBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "progressnote")
@XmlAccessorType(XmlAccessType.FIELD)


public class ResponseProgressNoteBean extends AbstractDataBean {
	@XmlElement(name = "progressnoteid")
	protected int progressnoteid;
	@XmlElement(name = "patientid")
	protected int patientid;
	@XmlElement(name = "notetext")
	protected String notetext;
	@XmlElement(name = "doctorname")
	protected String doctorname;
	@XmlElement(name = "authorid")
	protected String authorid;
	@XmlElement(name = "tags")
	protected ProgressNoteTagBean[] tags;
	@XmlElement(name = "entrydate")
	protected String entrydate;

	public ResponseProgressNoteBean() {
		super();
	}

	public ResponseProgressNoteBean (RequestProgressNoteBean reqProgressNote) {
		setPatientid(reqProgressNote.getPatientid());
		setNotetext(reqProgressNote.getNotetext());
		setDoctorname(reqProgressNote.getNotetext());
		setAuthorid(reqProgressNote.getNotetext());
		setTags(reqProgressNote.getTags());
		setEntrydate(reqProgressNote.getEntrydate());
	}

	public int getProgressnoteid() {
		return progressnoteid;
	}
	public void setProgressnoteid(int progressnoteid) {
		this.progressnoteid = progressnoteid;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getNotetext() {
		return notetext;
	}
	public void setNotetext(String notetext) {
		this.notetext = notetext;
	}
	public ProgressNoteTagBean[] getTags() {
		return tags;
	}
	public void setTags(ProgressNoteTagBean[] tags) {
		this.tags = tags;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getAuthorid() {
		return authorid;
	}
	public void setAuthorid(String authorid) {
		this.authorid = authorid;
	}
	public String getEntrydate() {
		return entrydate;
	}
	public void setEntrydate(String entrydate) {
		this.entrydate = entrydate;
	}
}
