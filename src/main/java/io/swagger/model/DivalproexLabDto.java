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
 * DivalproexLabDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-02T14:26:31.877-04:00")

public class DivalproexLabDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("patientId")
  private Long patientId = null;

  @JsonProperty("bloodLevel")
  private BigDecimal bloodLevel = null;

  @JsonProperty("createdTimestamp")
  private OffsetDateTime createdTimestamp = null;

  public DivalproexLabDto id(Long id) {
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

  public DivalproexLabDto patientId(Long patientId) {
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

  public DivalproexLabDto bloodLevel(BigDecimal bloodLevel) {
    this.bloodLevel = bloodLevel;
    return this;
  }

   /**
   * Get bloodLevel
   * @return bloodLevel
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getBloodLevel() {
    return bloodLevel;
  }

  public void setBloodLevel(BigDecimal bloodLevel) {
    this.bloodLevel = bloodLevel;
  }

  public DivalproexLabDto createdTimestamp(OffsetDateTime createdTimestamp) {
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
    DivalproexLabDto divalproexLabDto = (DivalproexLabDto) o;
    return Objects.equals(this.id, divalproexLabDto.id) &&
        Objects.equals(this.patientId, divalproexLabDto.patientId) &&
        Objects.equals(this.bloodLevel, divalproexLabDto.bloodLevel) &&
        Objects.equals(this.createdTimestamp, divalproexLabDto.createdTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, patientId, bloodLevel, createdTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DivalproexLabDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    bloodLevel: ").append(toIndentedString(bloodLevel)).append("\n");
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

