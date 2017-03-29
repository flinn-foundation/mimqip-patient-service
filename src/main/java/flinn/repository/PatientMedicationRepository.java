package flinn.repository;

import flinn.model.PatientMedication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientMedicationRepository extends CrudRepository<PatientMedication, Long> {
}
