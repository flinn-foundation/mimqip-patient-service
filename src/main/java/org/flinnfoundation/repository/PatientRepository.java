package org.flinnfoundation.repository;

import org.flinnfoundation.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;

@Repository
@PreAuthorize("hasRole('ROLE_USER')")
public interface PatientRepository extends CrudRepository<Patient, Long> {
}
