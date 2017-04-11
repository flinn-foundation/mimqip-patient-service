package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets EthnicityTypeDto
 */
public enum EthnicityTypeDto {
  
  HISPANIC("HISPANIC"),
  
  NON_HISPANIC("NON_HISPANIC"),
  
  NO_RESPONSE("NO_RESPONSE");

  private String value;

  EthnicityTypeDto(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EthnicityTypeDto fromValue(String text) {
    for (EthnicityTypeDto b : EthnicityTypeDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

