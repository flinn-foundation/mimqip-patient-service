package flinn.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Message {

    @Id
    @GeneratedValue
    private long id;

    private int priority;

    private String messageTag;

    private String text;

}
