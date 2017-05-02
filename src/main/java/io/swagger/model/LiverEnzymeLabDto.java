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
 * LiverEnzymeLabDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-02T14:26:31.877-04:00")

public class LiverEnzymeLabDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("patientId")
  private Long patientId = null;

  @JsonProperty("alt")
  private BigDecimal alt = null;

  @JsonProperty("ast")
  private BigDecimal ast = null;

  @JsonProperty("alp")
  private BigDecimal alp = null;

  @JsonProperty("ggt")
  private BigDecimal ggt = null;

  @JsonProperty("createdTimestamp")
  private OffsetDateTime createdTimestamp = null;

  public LiverEnzymeLabDto id(Long id) {
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

  public LiverEnzymeLabDto patientId(Long patientId) {
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

  public LiverEnzymeLabDto alt(BigDecimal alt) {
    this.alt = alt;
    return this;
  }

   /**
   * Get alt
   * @return alt
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAlt() {
    return alt;
  }

  public void setAlt(BigDecimal alt) {
    this.alt = alt;
  }

  public LiverEnzymeLabDto ast(BigDecimal ast) {
    this.ast = ast;
    return this;
  }

   /**
   * Get ast
   * @return ast
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAst() {
    return ast;
  }

  public void setAst(BigDecimal ast) {
    this.ast = ast;
  }

  public LiverEnzymeLabDto alp(BigDecimal alp) {
    this.alp = alp;
    return this;
  }

   /**
   * Get alp
   * @return alp
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAlp() {
    return alp;
  }

  public void setAlp(BigDecimal alp) {
    this.alp = alp;
  }

  public LiverEnzymeLabDto ggt(BigDecimal ggt) {
    this.ggt = ggt;
    return this;
  }

   /**
   * Get ggt
   * @return ggt
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getGgt() {
    return ggt;
  }

  public void setGgt(BigDecimal ggt) {
    this.ggt = ggt;
  }

  public LiverEnzymeLabDto createdTimestamp(OffsetDateTime createdTimestamp) {
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
    LiverEnzymeLabDto liverEnzymeLabDto = (LiverEnzymeLabDto) o;
    return Objects.equals(this.id, liverEnzymeLabDto.id) &&
        Objects.equals(this.patientId, liverEnzymeLabDto.patientId) &&
        Objects.equals(this.alt, liverEnzymeLabDto.alt) &&
        Objects.equals(this.ast, liverEnzymeLabDto.ast) &&
        Objects.equals(this.alp, liverEnzymeLabDto.alp) &&
        Objects.equals(this.ggt, liverEnzymeLabDto.ggt) &&
        Objects.equals(this.createdTimestamp, liverEnzymeLabDto.createdTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, patientId, alt, ast, alp, ggt, createdTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiverEnzymeLabDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    ast: ").append(toIndentedString(ast)).append("\n");
    sb.append("    alp: ").append(toIndentedString(alp)).append("\n");
    sb.append("    ggt: ").append(toIndentedString(ggt)).append("\n");
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

