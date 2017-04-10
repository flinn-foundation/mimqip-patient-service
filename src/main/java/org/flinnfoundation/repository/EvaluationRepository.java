package org.flinnfoundation.repository;

import org.flinnfoundation.model.Patient;
import org.flinnfoundation.model.evaluation.Evaluation;
import org.flinnfoundation.model.evaluation.EvaluationType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvaluationRepository extends CrudRepository<Evaluation, Long> {

    List<Evaluation> findEvaluationByPatient(Patient patient);

    List<Evaluation> findEvaluationByPatientAndEvaluationType(Patient patient, EvaluationType evaluationType);



}
