package org.flinnfoundation.controller;

import io.swagger.api.EvaluationApi;
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
public class EvaluationController implements EvaluationApi {

    private EvaluationService evaluationService;
    private EvaluationMapper evaluationMapper;

    @Autowired
    public EvaluationController(EvaluationService evaluationService, EvaluationMapper evaluationMapper) {
        this.evaluationService = evaluationService;
        this.evaluationMapper = evaluationMapper;
    }

    @Override
    public ResponseEntity<EvaluationDto> createPatientEvaluation(@PathVariable Long patientId, @RequestBody EvaluationDto evaluationDto) {
        evaluationDto.setPatientId(patientId);
        Evaluation evaluation = evaluationMapper.convertApiDtoToModel(evaluationDto);
        evaluationService.saveEvaluation(evaluation);

        return null;
    }

    @Override
    public ResponseEntity<EvaluationDto> getEvaluationById(@PathVariable Long patientId, @PathVariable Long evaluationId) {
        return ResponseEntity.ok(evaluationMapper.convertModelToApiDto(evaluationService.getEvaluation(patientId, evaluationId)));
    }

    @Override
    public ResponseEntity<List<EvaluationDto>> getEvaluationsByPatientId(@PathVariable Long patientId, @RequestParam(required = false) String evaluationType) {
        List<Evaluation> evaluations;
        if (evaluationType == null) {
            evaluations = evaluationService.getEvaluationsByPatientId(patientId);
        } else {
            EvaluationType evaluation = EvaluationType.valueOf(evaluationType);
            evaluations = evaluationService.getEvaluationsByPatientIdAndEvaluationType(patientId, evaluation);
        }

        return ResponseEntity.ok(evaluationMapper.convertModelToApiDto(evaluations));
    }

}
