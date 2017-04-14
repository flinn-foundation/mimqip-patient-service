package org.flinnfoundation.repository;

import org.flinnfoundation.model.Patient;
import org.flinnfoundation.model.PatientMedication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientMedicationRepository extends CrudRepository<PatientMedication, Long> {

    List<PatientMedication> findPatientMedicationByPatient(Patient patient);
}
