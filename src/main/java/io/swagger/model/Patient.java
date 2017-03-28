package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.constraints.*;
/**
 * Patient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-27T14:18:48.125-04:00")

public class Patient   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("facilityId")
  private Long facilityId = null;

  @JsonProperty("valid")
  private Boolean valid = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("rcopiaLastUpdatedDate")
  private OffsetDateTime rcopiaLastUpdatedDate = null;

  public Patient id(Long id) {
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

  public Patient facilityId(Long facilityId) {
    this.facilityId = facilityId;
    return this;
  }

   /**
   * Get facilityId
   * @return facilityId
  **/
  @ApiModelProperty(value = "")
  public Long getFacilityId() {
    return facilityId;
  }

  public void setFacilityId(Long facilityId) {
    this.facilityId = facilityId;
  }

  public Patient valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @ApiModelProperty(value = "")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Patient startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Patient rcopiaLastUpdatedDate(OffsetDateTime rcopiaLastUpdatedDate) {
    this.rcopiaLastUpdatedDate = rcopiaLastUpdatedDate;
    return this;
  }

   /**
   * Get rcopiaLastUpdatedDate
   * @return rcopiaLastUpdatedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRcopiaLastUpdatedDate() {
    return rcopiaLastUpdatedDate;
  }

  public void setRcopiaLastUpdatedDate(OffsetDateTime rcopiaLastUpdatedDate) {
    this.rcopiaLastUpdatedDate = rcopiaLastUpdatedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Patient patient = (Patient) o;
    return Objects.equals(this.id, patient.id) &&
        Objects.equals(this.facilityId, patient.facilityId) &&
        Objects.equals(this.valid, patient.valid) &&
        Objects.equals(this.startDate, patient.startDate) &&
        Objects.equals(this.rcopiaLastUpdatedDate, patient.rcopiaLastUpdatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, facilityId, valid, startDate, rcopiaLastUpdatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Patient {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    facilityId: ").append(toIndentedString(facilityId)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    rcopiaLastUpdatedDate: ").append(toIndentedString(rcopiaLastUpdatedDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

