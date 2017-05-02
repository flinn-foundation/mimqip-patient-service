package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import javax.validation.constraints.*;
/**
 * LipidPanelLabDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-02T14:26:31.877-04:00")

public class LipidPanelLabDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("patientId")
  private Long patientId = null;

  @JsonProperty("cholesterol")
  private BigDecimal cholesterol = null;

  @JsonProperty("hdl")
  private BigDecimal hdl = null;

  @JsonProperty("ldl")
  private BigDecimal ldl = null;

  @JsonProperty("triglycerides")
  private BigDecimal triglycerides = null;

  @JsonProperty("createdTimestamp")
  private OffsetDateTime createdTimestamp = null;

  public LipidPanelLabDto id(Long id) {
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

  public LipidPanelLabDto patientId(Long patientId) {
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

  public LipidPanelLabDto cholesterol(BigDecimal cholesterol) {
    this.cholesterol = cholesterol;
    return this;
  }

   /**
   * Get cholesterol
   * @return cholesterol
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCholesterol() {
    return cholesterol;
  }

  public void setCholesterol(BigDecimal cholesterol) {
    this.cholesterol = cholesterol;
  }

  public LipidPanelLabDto hdl(BigDecimal hdl) {
    this.hdl = hdl;
    return this;
  }

   /**
   * Get hdl
   * @return hdl
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getHdl() {
    return hdl;
  }

  public void setHdl(BigDecimal hdl) {
    this.hdl = hdl;
  }

  public LipidPanelLabDto ldl(BigDecimal ldl) {
    this.ldl = ldl;
    return this;
  }

   /**
   * Get ldl
   * @return ldl
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLdl() {
    return ldl;
  }

  public void setLdl(BigDecimal ldl) {
    this.ldl = ldl;
  }

  public LipidPanelLabDto triglycerides(BigDecimal triglycerides) {
    this.triglycerides = triglycerides;
    return this;
  }

   /**
   * Get triglycerides
   * @return triglycerides
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTriglycerides() {
    return triglycerides;
  }

  public void setTriglycerides(BigDecimal triglycerides) {
    this.triglycerides = triglycerides;
  }

  public LipidPanelLabDto createdTimestamp(OffsetDateTime createdTimestamp) {
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
    LipidPanelLabDto lipidPanelLabDto = (LipidPanelLabDto) o;
    return Objects.equals(this.id, lipidPanelLabDto.id) &&
        Objects.equals(this.patientId, lipidPanelLabDto.patientId) &&
        Objects.equals(this.cholesterol, lipidPanelLabDto.cholesterol) &&
        Objects.equals(this.hdl, lipidPanelLabDto.hdl) &&
        Objects.equals(this.ldl, lipidPanelLabDto.ldl) &&
        Objects.equals(this.triglycerides, lipidPanelLabDto.triglycerides) &&
        Objects.equals(this.createdTimestamp, lipidPanelLabDto.createdTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, patientId, cholesterol, hdl, ldl, triglycerides, createdTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LipidPanelLabDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    cholesterol: ").append(toIndentedString(cholesterol)).append("\n");
    sb.append("    hdl: ").append(toIndentedString(hdl)).append("\n");
    sb.append("    ldl: ").append(toIndentedString(ldl)).append("\n");
    sb.append("    triglycerides: ").append(toIndentedString(triglycerides)).append("\n");
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

