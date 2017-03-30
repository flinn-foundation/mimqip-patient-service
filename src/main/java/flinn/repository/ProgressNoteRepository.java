package flinn.repository;

import flinn.model.ProgressNote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressNoteRepository extends CrudRepository<ProgressNote, Long> {
}
