package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * PatientMedicationDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-01T10:08:32.341-04:00")

public class PatientMedicationDto   {
  @JsonProperty("genericName")
  private String genericName = null;

  public PatientMedicationDto genericName(String genericName) {
    this.genericName = genericName;
    return this;
  }

   /**
   * Get genericName
   * @return genericName
  **/
  @ApiModelProperty(value = "")
  public String getGenericName() {
    return genericName;
  }

  public void setGenericName(String genericName) {
    this.genericName = genericName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientMedicationDto patientMedicationDto = (PatientMedicationDto) o;
    return Objects.equals(this.genericName, patientMedicationDto.genericName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genericName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientMedicationDto {\n");
    
    sb.append("    genericName: ").append(toIndentedString(genericName)).append("\n");
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

