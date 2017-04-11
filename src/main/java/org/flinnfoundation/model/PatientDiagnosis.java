package org.flinnfoundation.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class PatientDiagnosis {

    private Diagnosis primaryDiagnosis;

    private Diagnosis secondaryDiagnosis;

}
