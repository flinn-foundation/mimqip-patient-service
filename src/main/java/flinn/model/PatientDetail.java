package flinn.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class PatientDetail {

    @Id
    @GeneratedValue
    private long id;

    private String key;

    private String value;

    private LocalDateTime entryDate;

}
