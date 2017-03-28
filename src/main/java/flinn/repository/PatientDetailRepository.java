package flinn.repository;

import flinn.model.PatientDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDetailRepository extends CrudRepository<PatientDetail, Long> {
}
