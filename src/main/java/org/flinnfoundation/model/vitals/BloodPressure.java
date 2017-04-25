package org.flinnfoundation.model.vitals;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class BloodPressure {

    //mmHg
    private int systolic;
    private int diastolic;
}
