package flinn.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Treatment {

    @Id
    private long id;

    private long groupId;

    private String name;

    private String abbreviation;

    private boolean valid;

    private String genericName;

}
