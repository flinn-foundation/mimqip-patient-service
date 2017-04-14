package org.flinnfoundation.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Diagnosis {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Patient patient;

    @Enumerated(EnumType.STRING)
    private DiagnosisType diagnosisType;

    @Lob
    private String secondaryDiagnosis;

    private int stage;

    //TODO: Change this to a Java8 Time (LocalDateTime, Offset, whatever) once SpringBoot 1.5.3 supports Hibernate 5.2.x
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTimestamp;
}
