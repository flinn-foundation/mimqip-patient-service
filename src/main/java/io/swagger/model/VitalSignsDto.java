package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * VitalSignsDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-01T10:08:32.341-04:00")

public class VitalSignsDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("patientId")
  private Long patientId = null;

  @JsonProperty("height")
  private Integer height = null;

  @JsonProperty("weight")
  private Integer weight = null;

  @JsonProperty("bloodPressure")
  private Object bloodPressure = null;

  @JsonProperty("heartRate")
  private Integer heartRate = null;

  public VitalSignsDto id(Long id) {
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

  public VitalSignsDto patientId(Long patientId) {
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

  public VitalSignsDto height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height in inches
   * @return height
  **/
  @ApiModelProperty(value = "Height in inches")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public VitalSignsDto weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Weight in pounds
   * @return weight
  **/
  @ApiModelProperty(value = "Weight in pounds")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public VitalSignsDto bloodPressure(Object bloodPressure) {
    this.bloodPressure = bloodPressure;
    return this;
  }

   /**
   * Get bloodPressure
   * @return bloodPressure
  **/
  @ApiModelProperty(value = "")
  public Object getBloodPressure() {
    return bloodPressure;
  }

  public void setBloodPressure(Object bloodPressure) {
    this.bloodPressure = bloodPressure;
  }

  public VitalSignsDto heartRate(Integer heartRate) {
    this.heartRate = heartRate;
    return this;
  }

   /**
   * Get heartRate
   * @return heartRate
  **/
  @ApiModelProperty(value = "")
  public Integer getHeartRate() {
    return heartRate;
  }

  public void setHeartRate(Integer heartRate) {
    this.heartRate = heartRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VitalSignsDto vitalSignsDto = (VitalSignsDto) o;
    return Objects.equals(this.id, vitalSignsDto.id) &&
        Objects.equals(this.patientId, vitalSignsDto.patientId) &&
        Objects.equals(this.height, vitalSignsDto.height) &&
        Objects.equals(this.weight, vitalSignsDto.weight) &&
        Objects.equals(this.bloodPressure, vitalSignsDto.bloodPressure) &&
        Objects.equals(this.heartRate, vitalSignsDto.heartRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, patientId, height, weight, bloodPressure, heartRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VitalSignsDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    bloodPressure: ").append(toIndentedString(bloodPressure)).append("\n");
    sb.append("    heartRate: ").append(toIndentedString(heartRate)).append("\n");
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

