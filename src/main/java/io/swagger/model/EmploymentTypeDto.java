package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets EmploymentTypeDto
 */
public enum EmploymentTypeDto {
  
  UNEMPLOYED("UNEMPLOYED"),
  
  FULL_TIME_SALARIED("FULL TIME_SALARIED"),
  
  PART_TIME_SALARIED("PART_TIME_SALARIED"),
  
  FULL_TIME_NON_SALARIED("FULL_TIME_NON_SALARIED"),
  
  PART_TIME_NON_SALARIED("PART_TIME_NON_SALARIED"),
  
  SELF_EMPLOYED("SELF_EMPLOYED");

  private String value;

  EmploymentTypeDto(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EmploymentTypeDto fromValue(String text) {
    for (EmploymentTypeDto b : EmploymentTypeDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

