package org.flinnfoundation.model;

import lombok.Data;
import lombok.ToString;
import org.flinnfoundation.model.evaluation.Evaluation;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@ToString(exclude = "evaluations")
public class Patient {

    @Id
    @GeneratedValue
    private long id;

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private PatientSex sex;

    private LocalDate dateOfBirth;

    private boolean valid;

    private LocalDateTime startDate = LocalDateTime.now();

    private LocalDateTime rcopiaLastUpdatedDate;

    @Enumerated(EnumType.STRING)
    private DiagnosisType diagnosisType;

    @Embedded
    private PatientDetails patientDetails;

    public enum PatientSex {
        MALE, FEMALE
    }

    @OneToMany(mappedBy = "patient")
    private List<Evaluation> evaluations;

    @OneToMany(mappedBy = "patient")
    private List<PatientMedication> patientMedications;

}
