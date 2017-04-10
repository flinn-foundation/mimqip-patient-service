package org.flinnfoundation.controller;

import io.swagger.api.EvaluationsApi;
import io.swagger.model.EvaluationDto;
import lombok.extern.slf4j.Slf4j;
import org.flinnfoundation.mapper.EvaluationMapper;
import org.flinnfoundation.model.evaluation.Evaluation;
import org.flinnfoundation.model.evaluation.EvaluationType;
import org.flinnfoundation.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class EvaluationController implements EvaluationsApi {

    private EvaluationService evaluationService;
    private EvaluationMapper evaluationMapper;

    @Autowired
    public EvaluationController(EvaluationService evaluationService, EvaluationMapper evaluationMapper) {
        this.evaluationService = evaluationService;
        this.evaluationMapper = evaluationMapper;
    }

    @Override
    public ResponseEntity<EvaluationDto> createPatientEvaluation(@RequestBody EvaluationDto evaluationDto) {
        Evaluation evaluation = evaluationMapper.convertApiDtoToModel(evaluationDto);
        evaluationService.saveEvaluation(evaluation);

        return null;
    }

    @Override
    public ResponseEntity<EvaluationDto> getBlankEvaluation(@PathVariable String evaluationType) {
        return ResponseEntity.ok(evaluationMapper.convertModelToApiDto(evaluationService.getBlankEvaluation(EvaluationType.valueOf(evaluationType))));
    }

    @Override
    public ResponseEntity<EvaluationDto> getEvaluationById(@RequestParam Long evaluationId) {
        return ResponseEntity.ok(evaluationMapper.convertModelToApiDto(evaluationService.getEvaluation(evaluationId)));
    }

    @Override
    public ResponseEntity<List<EvaluationDto>> getEvaluationsByPatientId(@RequestParam  Long patientId, @RequestParam String evaluationType) {
        List<Evaluation> evaluations = evaluationService.getEvaluationsByPatientIdAndEvaluationType(patientId, EvaluationType.valueOf(evaluationType));
        return ResponseEntity.ok(evaluationMapper.convertModelToApiDto(evaluations));
    }

}
