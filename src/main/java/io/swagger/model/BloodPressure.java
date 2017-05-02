package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * BloodPressure
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-02T16:51:59.735-04:00")

public class BloodPressure   {
  @JsonProperty("systolic")
  private Integer systolic = null;

  @JsonProperty("diastolic")
  private Integer diastolic = null;

  public BloodPressure systolic(Integer systolic) {
    this.systolic = systolic;
    return this;
  }

   /**
   * Get systolic
   * @return systolic
  **/
  @ApiModelProperty(value = "")
  public Integer getSystolic() {
    return systolic;
  }

  public void setSystolic(Integer systolic) {
    this.systolic = systolic;
  }

  public BloodPressure diastolic(Integer diastolic) {
    this.diastolic = diastolic;
    return this;
  }

   /**
   * Get diastolic
   * @return diastolic
  **/
  @ApiModelProperty(value = "")
  public Integer getDiastolic() {
    return diastolic;
  }

  public void setDiastolic(Integer diastolic) {
    this.diastolic = diastolic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BloodPressure bloodPressure = (BloodPressure) o;
    return Objects.equals(this.systolic, bloodPressure.systolic) &&
        Objects.equals(this.diastolic, bloodPressure.diastolic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systolic, diastolic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BloodPressure {\n");
    
    sb.append("    systolic: ").append(toIndentedString(systolic)).append("\n");
    sb.append("    diastolic: ").append(toIndentedString(diastolic)).append("\n");
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

