package org.flinnfoundation.model.evaluation;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue
    private long id;

    @Lob
    private String prompt;

    @Lob
    private String response;
}
