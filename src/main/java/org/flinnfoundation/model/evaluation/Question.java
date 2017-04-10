package org.flinnfoundation.model.evaluation;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue
    private long id;

    private String prompt;

    @Lob
    private String response;
}
