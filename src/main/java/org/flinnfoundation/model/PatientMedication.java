package org.flinnfoundation.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Entity
public class PatientMedication {

    @Id
    @GeneratedValue
    public long id;

    public long rcopiaId;

    public boolean primaryFlag;

    public LocalDateTime lastModifiedDate;

    public boolean deletedFlag;

    @ManyToOne
    public Patient patient;
    public String providerId;
    public String preparerId;

    public String brandName;
    public String genericName;
    public String drugRoute;
    public String drugForm;
    public String drugStrength;
    public String action;
    public String doseAmount;
    public String doseUnit;
    public String doseRoute;
    public String doseTiming;
    public String doseOther;
    public String refills;
    public long duration;
    public double quantity;
    public String quantityUnit;

    public LocalDateTime startDate;
    public LocalDateTime stopDate;
}
