package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets RaceTypeDto
 */
public enum RaceTypeDto {
  
  WHITE("WHITE"),
  
  BLACK("BLACK"),
  
  INDIAN_AMERICAN("INDIAN_AMERICAN"),
  
  ASIAN("ASIAN"),
  
  PACIFIC_ISLANDER("PACIFIC_ISLANDER"),
  
  NO_RESPONSE("NO_RESPONSE");

  private String value;

  RaceTypeDto(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RaceTypeDto fromValue(String text) {
    for (RaceTypeDto b : RaceTypeDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

