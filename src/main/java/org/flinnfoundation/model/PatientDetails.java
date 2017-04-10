package org.flinnfoundation.model;

import lombok.Data;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Embeddable
public class PatientDetails {

    private String physicianName;

    private String physicianEmail;

    private String zipCode;

    @ElementCollection
    private List<String> race;

    private String ethnicity;

    private String marital;

    private String employment;

    private String living;

    private String patientIdentifier;

    private LocalDateTime entryDate;

}
