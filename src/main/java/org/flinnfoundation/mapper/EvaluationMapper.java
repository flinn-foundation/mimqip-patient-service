package org.flinnfoundation.mapper;

import io.swagger.model.EvaluationDto;
import org.flinnfoundation.model.evaluation.Evaluation;
import org.springframework.stereotype.Component;


@Component
public class EvaluationMapper extends OrikaMapper<Evaluation, EvaluationDto> {

    protected EvaluationMapper() {
        super(Evaluation.class, EvaluationDto.class);
    }
}
