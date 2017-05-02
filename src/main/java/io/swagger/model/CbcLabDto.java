package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import javax.validation.constraints.*;
/**
 * CbcLabDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-02T16:51:59.735-04:00")

public class CbcLabDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("patientId")
  private Long patientId = null;

  @JsonProperty("testDate")
  private LocalDate testDate = null;

  @JsonProperty("rbc")
  private Integer rbc = null;

  @JsonProperty("wbc")
  private Integer wbc = null;

  @JsonProperty("hemoglobin")
  private BigDecimal hemoglobin = null;

  @JsonProperty("hematocrit")
  private BigDecimal hematocrit = null;

  @JsonProperty("platelets")
  private Integer platelets = null;

  @JsonProperty("createdTimestamp")
  private OffsetDateTime createdTimestamp = null;

  public CbcLabDto id(Long id) {
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

  public CbcLabDto patientId(Long patientId) {
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

  public CbcLabDto testDate(LocalDate testDate) {
    this.testDate = testDate;
    return this;
  }

   /**
   * Get testDate
   * @return testDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getTestDate() {
    return testDate;
  }

  public void setTestDate(LocalDate testDate) {
    this.testDate = testDate;
  }

  public CbcLabDto rbc(Integer rbc) {
    this.rbc = rbc;
    return this;
  }

   /**
   * Get rbc
   * @return rbc
  **/
  @ApiModelProperty(value = "")
  public Integer getRbc() {
    return rbc;
  }

  public void setRbc(Integer rbc) {
    this.rbc = rbc;
  }

  public CbcLabDto wbc(Integer wbc) {
    this.wbc = wbc;
    return this;
  }

   /**
   * Get wbc
   * @return wbc
  **/
  @ApiModelProperty(value = "")
  public Integer getWbc() {
    return wbc;
  }

  public void setWbc(Integer wbc) {
    this.wbc = wbc;
  }

  public CbcLabDto hemoglobin(BigDecimal hemoglobin) {
    this.hemoglobin = hemoglobin;
    return this;
  }

   /**
   * Get hemoglobin
   * @return hemoglobin
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getHemoglobin() {
    return hemoglobin;
  }

  public void setHemoglobin(BigDecimal hemoglobin) {
    this.hemoglobin = hemoglobin;
  }

  public CbcLabDto hematocrit(BigDecimal hematocrit) {
    this.hematocrit = hematocrit;
    return this;
  }

   /**
   * Get hematocrit
   * @return hematocrit
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getHematocrit() {
    return hematocrit;
  }

  public void setHematocrit(BigDecimal hematocrit) {
    this.hematocrit = hematocrit;
  }

  public CbcLabDto platelets(Integer platelets) {
    this.platelets = platelets;
    return this;
  }

   /**
   * Get platelets
   * @return platelets
  **/
  @ApiModelProperty(value = "")
  public Integer getPlatelets() {
    return platelets;
  }

  public void setPlatelets(Integer platelets) {
    this.platelets = platelets;
  }

  public CbcLabDto createdTimestamp(OffsetDateTime createdTimestamp) {
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
    CbcLabDto cbcLabDto = (CbcLabDto) o;
    return Objects.equals(this.id, cbcLabDto.id) &&
        Objects.equals(this.patientId, cbcLabDto.patientId) &&
        Objects.equals(this.testDate, cbcLabDto.testDate) &&
        Objects.equals(this.rbc, cbcLabDto.rbc) &&
        Objects.equals(this.wbc, cbcLabDto.wbc) &&
        Objects.equals(this.hemoglobin, cbcLabDto.hemoglobin) &&
        Objects.equals(this.hematocrit, cbcLabDto.hematocrit) &&
        Objects.equals(this.platelets, cbcLabDto.platelets) &&
        Objects.equals(this.createdTimestamp, cbcLabDto.createdTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, patientId, testDate, rbc, wbc, hemoglobin, hematocrit, platelets, createdTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CbcLabDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    testDate: ").append(toIndentedString(testDate)).append("\n");
    sb.append("    rbc: ").append(toIndentedString(rbc)).append("\n");
    sb.append("    wbc: ").append(toIndentedString(wbc)).append("\n");
    sb.append("    hemoglobin: ").append(toIndentedString(hemoglobin)).append("\n");
    sb.append("    hematocrit: ").append(toIndentedString(hematocrit)).append("\n");
    sb.append("    platelets: ").append(toIndentedString(platelets)).append("\n");
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

