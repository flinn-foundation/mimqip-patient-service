package flinn.repository;

import flinn.model.RuleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RulesRepository extends CrudRepository<RuleEntity, Long> {


}
