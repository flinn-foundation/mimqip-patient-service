package org.flinnfoundation.model.lab;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class DivalproexLab extends BloodLevelLab {
}
