package org.flinnfoundation.service;

import lombok.extern.slf4j.Slf4j;
import org.flinnfoundation.model.Patient;
import org.flinnfoundation.model.evaluation.Evaluation;
import org.flinnfoundation.model.evaluation.EvaluationType;
import org.flinnfoundation.repository.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EvaluationService {

    private PatientService patientService;
    private EvaluationRepository evaluationRepository;

    @Autowired
    public EvaluationService(PatientService patientService, EvaluationRepository evaluationRepository) {
        this.patientService = patientService;
        this.evaluationRepository = evaluationRepository;
    }

    public Evaluation getEvaluation(long patientId, long evaluationId) {
        patientService.getPatient(patientId);

        return evaluationRepository.findOne(evaluationId);
    }

    public List<Evaluation> getEvaluationsByPatientId(long patientId) {

        Patient patient = patientService.getPatient(patientId);
        return patient.getEvaluations();
    }

    public List<Evaluation> getEvaluationsByPatientIdAndEvaluationType(long patientId, EvaluationType evaluationType) {

        Patient patient = patientService.getPatient(patientId);
        return evaluationRepository.findEvaluationByPatientAndEvaluationType(patient, evaluationType);
    }

    public void saveEvaluation(Evaluation evaluation) {

        evaluationRepository.save(evaluation);
    }
}
