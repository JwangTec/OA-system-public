package git.jwang.oasys.model.dao.notedao;

import org.springframework.data.repository.PagingAndSortingRepository;

import git.jwang.oasys.model.entity.note.Director;
import git.jwang.oasys.model.entity.note.Note;

public interface DirectorDao  extends PagingAndSortingRepository<Director, Long>{

}
