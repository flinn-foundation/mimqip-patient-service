package org.flinnfoundation.model.evaluation;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue
    private long id;


    @Enumerated
    private PsychiatricEvaluationPrompts prompt;

    @Lob
    private String response;
}
