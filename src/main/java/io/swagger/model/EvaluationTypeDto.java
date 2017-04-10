package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets EvaluationTypeDto
 */
public enum EvaluationTypeDto {
  
  PSYCHIATRIC("PSYCHIATRIC"),
  
  OTHER_VALUE("OTHER_VALUE");

  private String value;

  EvaluationTypeDto(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EvaluationTypeDto fromValue(String text) {
    for (EvaluationTypeDto b : EvaluationTypeDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

