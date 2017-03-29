package flinn.repository;

import flinn.model.Treatment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentDetailRepository extends CrudRepository<Treatment, Long> {

}
