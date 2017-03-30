package flinn.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Patient {

    @Id
    @GeneratedValue
    private long id;

    private int facilityId;

    private boolean valid;

    private LocalDateTime startDate;

    private LocalDateTime rcopiaLastUpdatedDate;

    @OneToMany
    private List<PatientDetail> patientDetails;

}
