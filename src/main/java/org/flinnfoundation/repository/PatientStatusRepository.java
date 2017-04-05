package org.flinnfoundation.repository;

import org.flinnfoundation.model.PatientStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientStatusRepository extends CrudRepository<PatientStatus, Long> {
}
