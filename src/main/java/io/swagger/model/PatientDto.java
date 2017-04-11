package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * PatientDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-10T23:13:15.691-04:00")

public class PatientDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("sex")
  private String sex = null;

  @JsonProperty("dateOfBirth")
  @JsonSerialize(using = LocalDateSerializer.class)
  @JsonDeserialize(using = LocalDateDeserializer.class)
  private LocalDate dateOfBirth = null;

  @JsonProperty("valid")
  private Boolean valid = null;

  @JsonProperty("diagnosis")
  private String diagnosis = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("race")
  private List<RaceTypeDto> race = new ArrayList<RaceTypeDto>();

  @JsonProperty("ethnicity")
  private String ethnicity = null;

  @JsonProperty("marital")
  private String marital = null;

  @JsonProperty("living")
  private String living = null;

  @JsonProperty("employment")
  private String employment = null;

  @JsonProperty("primaryCarePhysicianName")
  private String primaryCarePhysicianName = null;

  @JsonProperty("primaryCarePhysicianEmail")
  private String primaryCarePhysicianEmail = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  public PatientDto id(Long id) {
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

  public PatientDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PatientDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PatientDto sex(String sex) {
    this.sex = sex;
    return this;
  }

   /**
   * Get sex
   * @return sex
  **/
  @ApiModelProperty(value = "")
  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public PatientDto dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public PatientDto valid(Boolean valid) {
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

  public PatientDto diagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
    return this;
  }

   /**
   * Get diagnosis
   * @return diagnosis
  **/
  @ApiModelProperty(value = "")
  public String getDiagnosis() {
    return diagnosis;
  }

  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }

  public PatientDto zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @ApiModelProperty(value = "")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public PatientDto race(List<RaceTypeDto> race) {
    this.race = race;
    return this;
  }

  public PatientDto addRaceItem(RaceTypeDto raceItem) {
    this.race.add(raceItem);
    return this;
  }

   /**
   * Get race
   * @return race
  **/
  @ApiModelProperty(value = "")
  public List<RaceTypeDto> getRace() {
    return race;
  }

  public void setRace(List<RaceTypeDto> race) {
    this.race = race;
  }

  public PatientDto ethnicity(String ethnicity) {
    this.ethnicity = ethnicity;
    return this;
  }

   /**
   * Get ethnicity
   * @return ethnicity
  **/
  @ApiModelProperty(value = "")
  public String getEthnicity() {
    return ethnicity;
  }

  public void setEthnicity(String ethnicity) {
    this.ethnicity = ethnicity;
  }

  public PatientDto marital(String marital) {
    this.marital = marital;
    return this;
  }

   /**
   * Get marital
   * @return marital
  **/
  @ApiModelProperty(value = "")
  public String getMarital() {
    return marital;
  }

  public void setMarital(String marital) {
    this.marital = marital;
  }

  public PatientDto living(String living) {
    this.living = living;
    return this;
  }

   /**
   * Get living
   * @return living
  **/
  @ApiModelProperty(value = "")
  public String getLiving() {
    return living;
  }

  public void setLiving(String living) {
    this.living = living;
  }

  public PatientDto employment(String employment) {
    this.employment = employment;
    return this;
  }

   /**
   * Get employment
   * @return employment
  **/
  @ApiModelProperty(value = "")
  public String getEmployment() {
    return employment;
  }

  public void setEmployment(String employment) {
    this.employment = employment;
  }

  public PatientDto primaryCarePhysicianName(String primaryCarePhysicianName) {
    this.primaryCarePhysicianName = primaryCarePhysicianName;
    return this;
  }

   /**
   * Get primaryCarePhysicianName
   * @return primaryCarePhysicianName
  **/
  @ApiModelProperty(value = "")
  public String getPrimaryCarePhysicianName() {
    return primaryCarePhysicianName;
  }

  public void setPrimaryCarePhysicianName(String primaryCarePhysicianName) {
    this.primaryCarePhysicianName = primaryCarePhysicianName;
  }

  public PatientDto primaryCarePhysicianEmail(String primaryCarePhysicianEmail) {
    this.primaryCarePhysicianEmail = primaryCarePhysicianEmail;
    return this;
  }

   /**
   * Get primaryCarePhysicianEmail
   * @return primaryCarePhysicianEmail
  **/
  @ApiModelProperty(value = "")
  public String getPrimaryCarePhysicianEmail() {
    return primaryCarePhysicianEmail;
  }

  public void setPrimaryCarePhysicianEmail(String primaryCarePhysicianEmail) {
    this.primaryCarePhysicianEmail = primaryCarePhysicianEmail;
  }

  public PatientDto startDate(OffsetDateTime startDate) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientDto patientDto = (PatientDto) o;
    return Objects.equals(this.id, patientDto.id) &&
        Objects.equals(this.firstName, patientDto.firstName) &&
        Objects.equals(this.lastName, patientDto.lastName) &&
        Objects.equals(this.sex, patientDto.sex) &&
        Objects.equals(this.dateOfBirth, patientDto.dateOfBirth) &&
        Objects.equals(this.valid, patientDto.valid) &&
        Objects.equals(this.diagnosis, patientDto.diagnosis) &&
        Objects.equals(this.zipCode, patientDto.zipCode) &&
        Objects.equals(this.race, patientDto.race) &&
        Objects.equals(this.ethnicity, patientDto.ethnicity) &&
        Objects.equals(this.marital, patientDto.marital) &&
        Objects.equals(this.living, patientDto.living) &&
        Objects.equals(this.employment, patientDto.employment) &&
        Objects.equals(this.primaryCarePhysicianName, patientDto.primaryCarePhysicianName) &&
        Objects.equals(this.primaryCarePhysicianEmail, patientDto.primaryCarePhysicianEmail) &&
        Objects.equals(this.startDate, patientDto.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, sex, dateOfBirth, valid, diagnosis, zipCode, race, ethnicity, marital, living, employment, primaryCarePhysicianName, primaryCarePhysicianEmail, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientDto {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    diagnosis: ").append(toIndentedString(diagnosis)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    ethnicity: ").append(toIndentedString(ethnicity)).append("\n");
    sb.append("    marital: ").append(toIndentedString(marital)).append("\n");
    sb.append("    living: ").append(toIndentedString(living)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    primaryCarePhysicianName: ").append(toIndentedString(primaryCarePhysicianName)).append("\n");
    sb.append("    primaryCarePhysicianEmail: ").append(toIndentedString(primaryCarePhysicianEmail)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

