package flinn.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Patient {

    @Id
    private Long id;

    private int facilityId;

    private boolean valid;

    private LocalDateTime startDate;

    private LocalDateTime rcopiaLastUpdatedDate;

}
