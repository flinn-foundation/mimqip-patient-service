package org.flinnfoundation.model;

import lombok.Data;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Data
@Embeddable
public class PatientDetails {

    private String physicianName;

    private String physicianEmail;

    private String zipCode;

    private String race;

    private String ethnicity;

    private String marital;

    private String employment;

    private String living;

    private String patientIdentifier;

    private LocalDateTime entryDate;

}
