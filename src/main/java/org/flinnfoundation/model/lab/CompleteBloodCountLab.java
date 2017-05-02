package org.flinnfoundation.model.lab;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class CompleteBloodCountLab extends Lab {

    private int rbc;

    private int wbc;

    private int platelets;

    private double hemoglobin;

    private double hematocrit;

}
