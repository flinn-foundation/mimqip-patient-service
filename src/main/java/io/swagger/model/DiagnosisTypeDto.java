package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DiagnosisTypeDto
 */
public enum DiagnosisTypeDto {

  SCHIZOPHRENIC_P("SCHIZOPHRENIC_P"),

  SCHIZOPHRENIC_D("SCHIZOPHRENIC_D"),

  SCHIZOPHRENIC_C("SCHIZOPHRENIC_C"),

  SCHIZOPHRENIC_U("SCHIZOPHRENIC_U"),

  SCHIZOPHRENIC_R("SCHIZOPHRENIC_R"),

  BIPOLAR_SM1("BIPOLAR_SM1"),

  BIPOLAR_SM2("BIPOLAR_SM2"),

  BIPOLAR_SM3("BIPOLAR_SM3"),

  BIPOLAR_SM4("BIPOLAR_SM4"),

  BIPOLAR_MRMH("BIPOLAR_MRMH"),

  BIPOLAR_MRM1("BIPOLAR_MRM1"),

  BIPOLAR_MRM2("BIPOLAR_MRM2"),

  BIPOLAR_MRM3("BIPOLAR_MRM3"),

  BIPOLAR_MRM4("BIPOLAR_MRM4"),

  BIPOLAR_MRD1("BIPOLAR_MRD1"),

  BIPOLAR_MRD2("BIPOLAR_MRD2"),

  BIPOLAR_MRD3("BIPOLAR_MRD3"),

  BIPOLAR_MRD4("BIPOLAR_MRD4"),

  MDD_S1("MDD_S1"),

  MDD_S2("MDD_S2"),

  MDD_S3("MDD_S3"),

  MDD_S4("MDD_S4"),

  MDD_R1("MDD_R1"),

  MDD_R2("MDD_R2"),

  MDD_R3("MDD_R3"),

  MDD_R4("MDD_R4");

  private String value;

  DiagnosisTypeDto(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DiagnosisTypeDto fromValue(String text) {
    for (DiagnosisTypeDto b : DiagnosisTypeDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

