package sl.sol.eventplanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sl.sol.eventplanner.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}