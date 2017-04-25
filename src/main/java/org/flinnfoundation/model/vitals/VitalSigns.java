package org.flinnfoundation.model.vitals;

import lombok.Data;
import org.flinnfoundation.model.Patient;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class VitalSigns {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Patient patient;

    //Weight in lbs
    private int weight;

    //Height in inches
    private int height;

    private BloodPressure bloodPressure;

    //In BPM
    private int heartRate;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTimestamp;
}
