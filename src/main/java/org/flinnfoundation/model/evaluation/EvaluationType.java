package org.flinnfoundation.model.evaluation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EvaluationType {
    BBDSS,
    PHQ9,
    GLOBAL,
    MENTAL_STATUS,
    PSRS,
    SUBSTANCE_ABUSE,
    VITAL_SIGNS,
    PSYCHIATRIC
}
