package org.flinnfoundation.controller;

import io.swagger.api.EvaluationsApi;
import io.swagger.model.EvaluationDto;
import lombok.extern.slf4j.Slf4j;
import org.flinnfoundation.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class EvaluationController implements EvaluationsApi {

    private EvaluationService evaluationService;

    @Autowired
    public EvaluationController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    @Override
    public ResponseEntity<EvaluationDto> getBlankPsychEvaluation() {
        return ResponseEntity.ok(evaluationService.getBlankPsychiatricEvaluation());
    }

    @Override
    public ResponseEntity<List<EvaluationDto>> getEvaluationsByPatientId(@RequestParam("patientId") Long patientId) {
        return ResponseEntity.ok(evaluationService.getEvaluations(patientId));
    }

    @Override
    public ResponseEntity<List<EvaluationDto>> getPsychEvaluationsByPatientId(@RequestParam("patientId") Long patientId) {
        return null;
    }

    @Override
    public ResponseEntity<EvaluationDto> createPatientPsychEvaluation(@RequestBody EvaluationDto evaluation) {
        evaluationService.savePsychiatricEvaluation(evaluation);

        return null;
    }

    @Override
    public ResponseEntity<EvaluationDto> getPsychEvaluationById(@RequestParam Long evaluationId) {
        return null;
    }
}
