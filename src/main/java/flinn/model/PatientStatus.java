package flinn.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.LocalDateTime;

@Data
@Entity
public class PatientStatus {

    @Id
    @GeneratedValue
    private long id;

    private long patientId;

    private String key;

    @Lob
    private String value;

    private LocalDateTime entryDate;

}
