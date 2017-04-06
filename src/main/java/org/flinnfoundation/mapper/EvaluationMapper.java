package org.flinnfoundation.mapper;

import io.swagger.model.EvaluationDto;
import org.flinnfoundation.model.evaluation.PsychiatricEvaluation;
import org.springframework.stereotype.Component;


@Component
public class EvaluationMapper extends OrikaMapper<PsychiatricEvaluation, EvaluationDto> {

    protected EvaluationMapper() {
        super(PsychiatricEvaluation.class, EvaluationDto.class);
    }
}
