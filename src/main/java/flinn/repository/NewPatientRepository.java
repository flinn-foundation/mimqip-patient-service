package flinn.repository;

import flinn.model.PatientNew;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewPatientRepository extends CrudRepository<PatientNew, Long> {
}
