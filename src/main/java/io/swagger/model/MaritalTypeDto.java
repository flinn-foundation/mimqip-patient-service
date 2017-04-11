package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets MaritalTypeDto
 */
public enum MaritalTypeDto {
  
  MARRIED("MARRIED"),
  
  SINGLE("SINGLE"),
  
  SEPARATED("SEPARATED"),
  
  DIVORCED("DIVORCED"),
  
  WIDOWED("WIDOWED");

  private String value;

  MaritalTypeDto(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MaritalTypeDto fromValue(String text) {
    for (MaritalTypeDto b : MaritalTypeDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

