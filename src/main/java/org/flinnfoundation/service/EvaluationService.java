package org.flinnfoundation.service;

import io.swagger.model.EvaluationDto;
import lombok.extern.slf4j.Slf4j;
import org.flinnfoundation.mapper.EvaluationMapper;
import org.flinnfoundation.model.Patient;
import org.flinnfoundation.model.evaluation.PsychiatricEvaluation;
import org.flinnfoundation.model.evaluation.PsychiatricEvaluationPrompts;
import org.flinnfoundation.model.evaluation.Question;
import org.flinnfoundation.repository.EvaluationRepository;
import org.flinnfoundation.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class EvaluationService {

    private EvaluationRepository evaluationRepository;
    private PatientRepository patientRepository;

    private EvaluationMapper evaluationMapper;

    @Autowired
    public EvaluationService(EvaluationRepository evaluationRepository, PatientRepository patientRepository, EvaluationMapper evaluationMapper) {
        this.evaluationRepository = evaluationRepository;
        this.patientRepository = patientRepository;
        this.evaluationMapper = evaluationMapper;
    }

    public PsychiatricEvaluation getEvaluation(long evaluationId) {
        return evaluationRepository.findOne(evaluationId);
    }

    public EvaluationDto getBlankPsychiatricEvaluation() {
        PsychiatricEvaluation psychiatricEvaluation = new PsychiatricEvaluation();
        List<Question> questions = new ArrayList<>();

        log.info("Printing questions");
        for(PsychiatricEvaluationPrompts prompt : PsychiatricEvaluationPrompts.values()) {
            log.info(prompt.toString());
            Question question = new Question();
            question.setPrompt(prompt);

            questions.add(question);
        }
        psychiatricEvaluation.setQuestions(questions);

        return evaluationMapper.convertModelToApiDto(psychiatricEvaluation);
    }

    public void savePsychiatricEvaluation(EvaluationDto evaluation) {

        Patient patient = patientRepository.findOne(evaluation.getPatientId());

        PsychiatricEvaluation psychiatricEvaluation = evaluationMapper.convertApiDtoToModel(evaluation);
        psychiatricEvaluation.setPatient(patient);
        log.info(psychiatricEvaluation.toString());
        evaluationRepository.save(psychiatricEvaluation);
    }

    public List<EvaluationDto> getEvaluations(long patientId) {
        List<PsychiatricEvaluation> evaluations = new ArrayList<>();

        evaluationRepository.findAll().forEach(evaluation -> {
            if(evaluation.getPatient().getId() == patientId) {
                evaluations.add(evaluation);
            }
        });

        return evaluationMapper.convertModelToApiDto(evaluations);
    }
}
