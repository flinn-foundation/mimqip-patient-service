package org.flinnfoundation.model.lab;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class LipidPanelLab extends Lab {

    private double cholesterol;

    private double hdl;

    private double ldl;

    private double triglycerides;

}
