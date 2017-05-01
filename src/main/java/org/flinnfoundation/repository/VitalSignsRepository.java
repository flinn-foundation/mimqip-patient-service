package org.flinnfoundation.repository;

import org.flinnfoundation.model.vitals.VitalSigns;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VitalSignsRepository extends CrudRepository<VitalSigns, Long> {

}
