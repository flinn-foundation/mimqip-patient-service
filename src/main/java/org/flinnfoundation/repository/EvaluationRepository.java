package org.flinnfoundation.repository;

import org.flinnfoundation.model.evaluation.PsychiatricEvaluation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationRepository extends CrudRepository<PsychiatricEvaluation, Long> {
}
