package org.flinnfoundation.model.lab;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class LiverEnzymesLab extends Lab {

    private double alt;

    private double ast;

    private double alp;

    private double ggt;

}
