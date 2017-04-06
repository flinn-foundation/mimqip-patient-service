package org.flinnfoundation.service;

import io.swagger.model.EvaluationDto;
import lombok.extern.slf4j.Slf4j;
import org.flinnfoundation.mapper.EvaluationMapper;
import org.flinnfoundation.model.Patient;
import org.flinnfoundation.model.evaluation.PsychiatricEvaluation;
import org.flinnfoundation.repository.EvaluationRepository;
import org.flinnfoundation.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EvaluationService {

    private EvaluationRepository evaluationRepository;
    private EvaluationMapper evaluationMapper;

    private PatientRepository patientRepository;

    @Autowired
    public EvaluationService(EvaluationRepository evaluationRepository, EvaluationMapper evaluationMapper, PatientRepository patientRepository) {
        this.evaluationRepository = evaluationRepository;
        this.evaluationMapper = evaluationMapper;
        this.patientRepository = patientRepository;
    }

    public PsychiatricEvaluation getEvaluation(long evaluationId) {
        return evaluationRepository.findOne(evaluationId);
    }

    public void savePsychiatricEvaluation(EvaluationDto evaluation) {

        Patient patient = patientRepository.findOne(evaluation.getPatientId());

        PsychiatricEvaluation psychiatricEvaluation = evaluationMapper.convertApiDtoToModel(evaluation);
        psychiatricEvaluation.setPatient(patient);
        log.info(psychiatricEvaluation.toString());
        evaluationRepository.save(psychiatricEvaluation);
    }
}
