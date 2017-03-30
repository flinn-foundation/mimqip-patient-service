package flinn.model;

import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class PatientNew {

    @Id
    private long id;

    private int facilityId;

    private boolean valid;

    private LocalDateTime startDate;

    private LocalDateTime rcopiaLastUpdatedDate;

    @Embedded
    private PatientDetailNew patientDetailNew;

}
