package org.flinnfoundation.model.evaluation;

import lombok.Data;
import org.flinnfoundation.model.Patient;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class PsychiatricEvaluation {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinTable(name = "PATIENT_EVALUATION")
    private Patient patient;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Question> questions;

}
