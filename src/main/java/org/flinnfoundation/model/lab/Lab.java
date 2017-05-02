package org.flinnfoundation.model.lab;

import lombok.Data;
import org.flinnfoundation.model.Patient;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
abstract public class Lab {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    @ManyToOne
    private Patient patient;

    //TODO: Change this to a Java8 Time (LocalDateTime, Offset, whatever) once Spring Boot supports Hibernate 5.2.x
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTimestamp;
}
