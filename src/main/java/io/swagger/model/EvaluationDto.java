package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.QuestionDto;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * EvaluationDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-09T20:56:30.452-04:00")

public class EvaluationDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("patientId")
  private Long patientId = null;

  @JsonProperty("questions")
  private List<QuestionDto> questions = new ArrayList<QuestionDto>();

  @JsonProperty("evaluation")
  private String evaluation = null;

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

  public EvaluationDto questions(List<QuestionDto> questions) {
    this.questions = questions;
    return this;
  }

  public EvaluationDto addQuestionsItem(QuestionDto questionsItem) {
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  @ApiModelProperty(value = "")
  public List<QuestionDto> getQuestions() {
    return questions;
  }

  public void setQuestions(List<QuestionDto> questions) {
    this.questions = questions;
  }

  public EvaluationDto evaluation(String evaluation) {
    this.evaluation = evaluation;
    return this;
  }

   /**
   * Get evaluation
   * @return evaluation
  **/
  @ApiModelProperty(value = "")
  public String getEvaluation() {
    return evaluation;
  }

  public void setEvaluation(String evaluation) {
    this.evaluation = evaluation;
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
        Objects.equals(this.questions, evaluationDto.questions) &&
        Objects.equals(this.evaluation, evaluationDto.evaluation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, patientId, questions, evaluation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationDto {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    evaluation: ").append(toIndentedString(evaluation)).append("\n");
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

