package flinn.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

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

}
