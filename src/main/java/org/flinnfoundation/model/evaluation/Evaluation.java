package org.flinnfoundation.model.evaluation;

import lombok.Data;
import org.flinnfoundation.model.Patient;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Evaluation {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinTable(name = "PATIENT_EVALUATIONS")
    private Patient patient;

    @OneToMany(cascade = CascadeType.ALL)
    private List<EvaluationResponse> evaluationResponses;

    @Enumerated(EnumType.STRING)
    private EvaluationType evaluationType;

    //TODO: Change this to a Java8 Time (LocalDateTime, Offset, whatever) once Spring Boot supports Hibernate 5.2.x
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

}
