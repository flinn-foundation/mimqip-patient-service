package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * ProgressNoteDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-02T14:26:31.877-04:00")

public class ProgressNoteDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("patientId")
  private Long patientId = null;

  /**
   * Gets or Sets progressNoteTagTypes
   */
  public enum ProgressNoteTagTypesEnum {
    GENERAL("GENERAL"),
    
    MEDICATIONS("MEDICATIONS"),
    
    DIAGNOSIS("DIAGNOSIS"),
    
    LABS("LABS"),
    
    EVALUATIONS("EVALUATIONS");

    private String value;

    ProgressNoteTagTypesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProgressNoteTagTypesEnum fromValue(String text) {
      for (ProgressNoteTagTypesEnum b : ProgressNoteTagTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("progressNoteTagTypes")
  private List<ProgressNoteTagTypesEnum> progressNoteTagTypes = new ArrayList<ProgressNoteTagTypesEnum>();

  @JsonProperty("noteText")
  private String noteText = null;

  @JsonProperty("createdTimestamp")
  private OffsetDateTime createdTimestamp = null;

  public ProgressNoteDto id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProgressNoteDto patientId(Long patientId) {
    this.patientId = patientId;
    return this;
  }

   /**
   * Get patientId
   * @return patientId
  **/
  @ApiModelProperty(value = "")
  public Long getPatientId() {
    return patientId;
  }

  public void setPatientId(Long patientId) {
    this.patientId = patientId;
  }

  public ProgressNoteDto progressNoteTagTypes(List<ProgressNoteTagTypesEnum> progressNoteTagTypes) {
    this.progressNoteTagTypes = progressNoteTagTypes;
    return this;
  }

  public ProgressNoteDto addProgressNoteTagTypesItem(ProgressNoteTagTypesEnum progressNoteTagTypesItem) {
    this.progressNoteTagTypes.add(progressNoteTagTypesItem);
    return this;
  }

   /**
   * Get progressNoteTagTypes
   * @return progressNoteTagTypes
  **/
  @ApiModelProperty(value = "")
  public List<ProgressNoteTagTypesEnum> getProgressNoteTagTypes() {
    return progressNoteTagTypes;
  }

  public void setProgressNoteTagTypes(List<ProgressNoteTagTypesEnum> progressNoteTagTypes) {
    this.progressNoteTagTypes = progressNoteTagTypes;
  }

  public ProgressNoteDto noteText(String noteText) {
    this.noteText = noteText;
    return this;
  }

   /**
   * Get noteText
   * @return noteText
  **/
  @ApiModelProperty(value = "")
  public String getNoteText() {
    return noteText;
  }

  public void setNoteText(String noteText) {
    this.noteText = noteText;
  }

  public ProgressNoteDto createdTimestamp(OffsetDateTime createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Get createdTimestamp
   * @return createdTimestamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(OffsetDateTime createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgressNoteDto progressNoteDto = (ProgressNoteDto) o;
    return Objects.equals(this.id, progressNoteDto.id) &&
        Objects.equals(this.patientId, progressNoteDto.patientId) &&
        Objects.equals(this.progressNoteTagTypes, progressNoteDto.progressNoteTagTypes) &&
        Objects.equals(this.noteText, progressNoteDto.noteText) &&
        Objects.equals(this.createdTimestamp, progressNoteDto.createdTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, patientId, progressNoteTagTypes, noteText, createdTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgressNoteDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    progressNoteTagTypes: ").append(toIndentedString(progressNoteTagTypes)).append("\n");
    sb.append("    noteText: ").append(toIndentedString(noteText)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

