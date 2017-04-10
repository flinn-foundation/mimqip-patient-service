package org.flinnfoundation.service;

import lombok.extern.slf4j.Slf4j;
import org.flinnfoundation.model.Patient;
import org.flinnfoundation.model.evaluation.*;
import org.flinnfoundation.repository.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public Evaluation getEvaluation(long evaluationId) {
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

    public Evaluation getBlankEvaluation(EvaluationType evaluationType) {
        Evaluation evaluation = new Evaluation();
        List<Question> questions = new ArrayList<>();

        for(String prompt : evaluationType.getEvaluationPrompts()) {
            Question question = new Question();
            question.setPrompt(prompt);

            questions.add(question);
        }
        evaluation.setQuestions(questions);
        evaluation.setEvaluationType(evaluationType);

        return evaluation;
    }

    public void saveEvaluation(Evaluation evaluation) {

        evaluationRepository.save(evaluation);
    }
}
