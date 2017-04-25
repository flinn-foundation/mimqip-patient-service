package org.flinnfoundation.controller;

import io.swagger.api.EvaluationApi;
import io.swagger.model.EvaluationDto;
import io.swagger.model.VitalSignsDto;
import lombok.extern.slf4j.Slf4j;
import org.flinnfoundation.mapper.EvaluationMapper;
import org.flinnfoundation.mapper.VitalSignsMapper;
import org.flinnfoundation.model.Patient;
import org.flinnfoundation.model.evaluation.Evaluation;
import org.flinnfoundation.model.evaluation.EvaluationType;
import org.flinnfoundation.model.vitals.VitalSigns;
import org.flinnfoundation.service.EvaluationService;
import org.flinnfoundation.service.PatientService;
import org.flinnfoundation.service.VitalSignsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Slf4j
@RestController
public class EvaluationController implements EvaluationApi {

    private PatientService patientService;
    private EvaluationService evaluationService;
    private EvaluationMapper evaluationMapper;
    private VitalSignsService vitalSignsService;
    private VitalSignsMapper vitalSignsMapper;


    @Autowired
    public EvaluationController(PatientService patientService, EvaluationService evaluationService, EvaluationMapper evaluationMapper, VitalSignsService vitalSignsService, VitalSignsMapper vitalSignsMapper) {
        this.patientService = patientService;
        this.evaluationService = evaluationService;
        this.evaluationMapper = evaluationMapper;
        this.vitalSignsService = vitalSignsService;
        this.vitalSignsMapper = vitalSignsMapper;
    }

    @Override
    public ResponseEntity<List<VitalSignsDto>> getVitalSignEvaluations(@PathVariable Long patientId) {
        return ResponseEntity.ok(vitalSignsMapper.convertModelToApiDto(vitalSignsService.getVitalsList(patientService.getPatient(patientId))));
    }

    @Override
    public ResponseEntity<String> createNewVitalSignEvaluation(@PathVariable Long patientId, @RequestBody VitalSignsDto vitalSignsEvaluation) {

        vitalSignsEvaluation.setPatientId(patientId);
        VitalSigns vitalSigns = vitalSignsService.saveVitals(vitalSignsMapper.convertApiDtoToModel(vitalSignsEvaluation));

        try {
            return ResponseEntity.created(new URI(Long.toString(vitalSigns.getId()))).build();
        } catch (URISyntaxException e) {
            throw new RuntimeException("Unable to build response", e);
        }
    }

    @Override
    public ResponseEntity<String> createPatientEvaluation(@PathVariable Long patientId, @RequestBody EvaluationDto evaluationDto) {
        Patient patient = patientService.getPatient(patientId);
        Evaluation evaluation = evaluationMapper.convertApiDtoToModel(evaluationDto);
        evaluation.setPatient(patient);

        Evaluation savedEvaluation = evaluationService.saveEvaluation(evaluation);


        return ResponseEntity.ok(Long.toString(savedEvaluation.getId()));
    }

    @Override
    public ResponseEntity<EvaluationDto> getEvaluationById(@PathVariable Long patientId, @PathVariable Long evaluationId) {
        Patient patient = patientService.getPatient(patientId);
        return ResponseEntity.ok(evaluationMapper.convertModelToApiDto(evaluationService.getEvaluation(patient, evaluationId)));
    }

    @Override
    public ResponseEntity<List<EvaluationDto>> getEvaluationsByPatientId(@PathVariable Long patientId, @RequestParam(required = false) String evaluationType) {
        Patient patient = patientService.getPatient(patientId);

        List<Evaluation> evaluations;
        if (evaluationType == null) {
            evaluations = evaluationService.getEvaluationsByPatientId(patient);
        } else {
            EvaluationType evaluation = EvaluationType.valueOf(evaluationType);
            evaluations = evaluationService.getEvaluationsByPatientIdAndEvaluationType(patient, evaluation);
        }

        return ResponseEntity.ok(evaluationMapper.convertModelToApiDto(evaluations));
    }

    public ResponseEntity<List<EvaluationDto>> getEvaluationsForDiagnosis(@PathVariable Long patientId) {
        Patient patient = patientService.getPatient(patientId);

        return ResponseEntity.ok(evaluationMapper.convertModelToApiDto(evaluationService.getEvaluationsForDiagnosis(patient)));
    }


}
