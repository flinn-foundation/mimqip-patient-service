package org.flinnfoundation.repository;

import org.flinnfoundation.model.Diagnosis;
import org.flinnfoundation.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiagnosisRepository extends CrudRepository<Diagnosis, Long> {

    List<Diagnosis> findDiagnosesByPatientOrderByCreatedTimestampDesc(Patient patient);

    Diagnosis findTopByPatientOrderByCreatedTimestampDesc(Patient patient);

}
