package flinn.repository;

import flinn.model.RuleCriterion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuleCriterionRepository extends CrudRepository<RuleCriterion, Long> {

}
