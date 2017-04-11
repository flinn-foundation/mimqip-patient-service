package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets LivingTypeDto
 */
public enum LivingTypeDto {
  
  ALONE("ALONE"),
  
  WITH_ROOMMATES("WITH_ROOMMATES"),
  
  WITH_SPOUSE("WITH_SPOUSE"),
  
  WITH_SPOUSE_AND_CHILDREN("WITH_SPOUSE_AND_CHILDREN"),
  
  WITH_PARENTS("WITH_PARENTS"),
  
  GROUP_HOME("GROUP_HOME");

  private String value;

  LivingTypeDto(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LivingTypeDto fromValue(String text) {
    for (LivingTypeDto b : LivingTypeDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

