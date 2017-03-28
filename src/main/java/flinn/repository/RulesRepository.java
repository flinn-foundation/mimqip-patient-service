package flinn.repository;

import flinn.model.Rule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RulesRepository extends CrudRepository<Rule, Long> {

}
