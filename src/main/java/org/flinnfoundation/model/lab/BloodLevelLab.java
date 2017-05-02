package org.flinnfoundation.model.lab;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Data
@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
@EqualsAndHashCode(callSuper = true)
abstract public class BloodLevelLab extends Lab {

    private double bloodLevel;
}
