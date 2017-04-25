package org.flinnfoundation.model;

import lombok.Data;
import lombok.ToString;
import org.flinnfoundation.model.evaluation.Evaluation;
import org.flinnfoundation.model.vitals.VitalSigns;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
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

    //TODO: Change this to a Java8 Time (LocalDateTime, Offset, whatever) once Spring Boot supports Hibernate 5.2.x
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    private LocalDateTime rcopiaLastUpdatedDate;

    @Embedded
    private PatientDetails patientDetails;

    @OneToMany(mappedBy = "patient")
    private List<Diagnosis> diagnoses;

    @OneToMany(mappedBy = "patient")
    private List<Evaluation> evaluations;

    @OneToMany(mappedBy = "patient")
    private List<PatientMedication> patientMedications;

    @OneToMany(mappedBy = "patient")
    private List<ProgressNote> progressNotes;

    @OneToMany(mappedBy = "patient")
    private List<VitalSigns> vitalSignsList;

    public enum PatientSex {
        MALE, FEMALE
    }

}
