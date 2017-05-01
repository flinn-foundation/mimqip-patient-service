package org.flinnfoundation.service;

import lombok.extern.slf4j.Slf4j;
import org.flinnfoundation.model.Diagnosis;
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

    private EvaluationRepository evaluationRepository;
    private DiagnosisService diagnosisService;

    @Autowired
    public EvaluationService(EvaluationRepository evaluationRepository, DiagnosisService diagnosisService) {
        this.evaluationRepository = evaluationRepository;
        this.diagnosisService = diagnosisService;
    }

    public Evaluation getEvaluation(Patient patient, long evaluationId) {


        return evaluationRepository.findOne(evaluationId);
    }

    public List<Evaluation> getEvaluationsByPatientId(Patient patient) {

        return patient.getEvaluations();
    }

    public List<Evaluation> getEvaluationsByPatientIdAndEvaluationType(Patient patient, EvaluationType evaluationType) {

        return evaluationRepository.findEvaluationByPatientAndEvaluationType(patient, evaluationType);
    }

    public List<Evaluation> getEvaluationsForDiagnosis(Patient patient) {

        Diagnosis diagnosis = diagnosisService.getMostRecentDiagnosisByPatient(patient);

        return evaluationRepository.findEvaluationByPatientAndEvaluationType(patient, diagnosis.getDiagnosisType().getEvaluationType());
    }

    public Evaluation saveEvaluation(Evaluation evaluations) {
        return evaluationRepository.save(evaluations);
    }
}
