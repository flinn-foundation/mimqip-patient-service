package org.flinnfoundation.model.evaluation;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum EvaluationType {
    BBDSS(Arrays.asList()),
    PHQ9(Arrays.asList()),
    GLOBAL(Arrays.asList()),
    MENTAL_STATUS(Arrays.asList()),
    PSRS(Arrays.asList()),
    SUBSTANCE_ABUSE(Arrays.asList()),
    VITAL_SIGNS(Arrays.asList()),
    PSYCHIATRIC(Arrays.asList("Reasons for Evaluation","History of Present Illness","Past Psychiatric History","History of Alcohol and Other Substance Abuse","General Medical History","Developmental, Psychosocial and Sociocultural History","Occupational and Military History","Legal History","Family History","Review of Systems","Functional Assessment"));

    List<String> evaluationPrompts;
}
