package org.flinnfoundation.repository.lab;

import org.flinnfoundation.model.lab.Lab;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface LabBaseRepository<T extends Lab>  extends CrudRepository<T, Long> {

}
