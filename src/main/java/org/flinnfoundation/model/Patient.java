package org.flinnfoundation.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Patient {

    @Id
    private long id;

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private PatientSex sex;

    private LocalDate dateOfBirth;

    private int facilityId;

    private boolean valid;

    private LocalDateTime startDate;

    private LocalDateTime rcopiaLastUpdatedDate;

    @Embedded
    private PatientDetails patientDetails;

    public enum PatientSex {
        MALE, FEMALE
    }

}
