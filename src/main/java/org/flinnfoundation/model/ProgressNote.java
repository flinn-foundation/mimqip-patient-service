package org.flinnfoundation.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class ProgressNote {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Patient patient;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<ProgressNoteTagType> progressNoteTagTypes;

    @Lob
    private String noteText;

    //TODO: Change this to a Java8 Time (LocalDateTime, Offset, whatever) once SpringBoot 1.5.3 supports Hibernate 5.2.x
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTimestamp;
}
