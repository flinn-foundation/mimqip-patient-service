package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EvaluationResponseDto;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * EvaluationDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-24T22:30:53.710-04:00")

public class EvaluationDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("patientId")
  private Long patientId = null;

  @JsonProperty("evaluationResponses")
  private List<EvaluationResponseDto> evaluationResponses = new ArrayList<EvaluationResponseDto>();

  @JsonProperty("created")
  private OffsetDateTime created = null;

  /**
   * Gets or Sets evaluationType
   */
  public enum EvaluationTypeEnum {
    BBDSS("BBDSS"),
    
    PHQ9("PHQ9"),
    
    GLOBAL("GLOBAL"),
    
    MENTAL_STATUS("MENTAL_STATUS"),
    
    PSRS("PSRS"),
    
    SUBSTANCE_ABUSE("SUBSTANCE_ABUSE"),
    
    VITAL_SIGNS("VITAL_SIGNS"),
    
    PSYCHIATRIC("PSYCHIATRIC");

    private String value;

    EvaluationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EvaluationTypeEnum fromValue(String text) {
      for (EvaluationTypeEnum b : EvaluationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("evaluationType")
  private EvaluationTypeEnum evaluationType = null;

  public EvaluationDto id(Long id) {
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

  public EvaluationDto patientId(Long patientId) {
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

  public EvaluationDto evaluationResponses(List<EvaluationResponseDto> evaluationResponses) {
    this.evaluationResponses = evaluationResponses;
    return this;
  }

  public EvaluationDto addEvaluationResponsesItem(EvaluationResponseDto evaluationResponsesItem) {
    this.evaluationResponses.add(evaluationResponsesItem);
    return this;
  }

   /**
   * Get evaluationResponses
   * @return evaluationResponses
  **/
  @ApiModelProperty(value = "")
  public List<EvaluationResponseDto> getEvaluationResponses() {
    return evaluationResponses;
  }

  public void setEvaluationResponses(List<EvaluationResponseDto> evaluationResponses) {
    this.evaluationResponses = evaluationResponses;
  }

  public EvaluationDto created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public EvaluationDto evaluationType(EvaluationTypeEnum evaluationType) {
    this.evaluationType = evaluationType;
    return this;
  }

   /**
   * Get evaluationType
   * @return evaluationType
  **/
  @ApiModelProperty(value = "")
  public EvaluationTypeEnum getEvaluationType() {
    return evaluationType;
  }

  public void setEvaluationType(EvaluationTypeEnum evaluationType) {
    this.evaluationType = evaluationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationDto evaluationDto = (EvaluationDto) o;
    return Objects.equals(this.id, evaluationDto.id) &&
        Objects.equals(this.patientId, evaluationDto.patientId) &&
        Objects.equals(this.evaluationResponses, evaluationDto.evaluationResponses) &&
        Objects.equals(this.created, evaluationDto.created) &&
        Objects.equals(this.evaluationType, evaluationDto.evaluationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, patientId, evaluationResponses, created, evaluationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    evaluationResponses: ").append(toIndentedString(evaluationResponses)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    evaluationType: ").append(toIndentedString(evaluationType)).append("\n");
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

