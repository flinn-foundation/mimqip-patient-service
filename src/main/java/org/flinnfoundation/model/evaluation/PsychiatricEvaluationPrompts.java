package org.flinnfoundation.model.evaluation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PsychiatricEvaluationPrompts {
    ROE("Reasons for Evaluation"),
    HOPI("History of Present Illness"),
    PPH("Past Psychiatric History"),
    HASA("History of Alcohol and Other Substance Abuse"),
    GMH("General Medical history"),
    DPSH("Developmental, Psychosocial and Sociocultural History"),
    OMH("Occupational and Military History"),
    LH("Legal History"),
    FH("Family History"),
    RS("Review of Systems"),
    FA("Functional Assessment");

    private String promptText;
}
