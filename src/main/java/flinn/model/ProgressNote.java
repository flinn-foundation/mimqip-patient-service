package flinn.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.LocalDateTime;

@Data
@Entity
public class ProgressNote {

    @Id
    @GeneratedValue
    private long id;

    private long patientId;

    private long appUserId;

    private LocalDateTime entryDate;

    private String doctorName;

    @Lob
    private String noteText;
}
