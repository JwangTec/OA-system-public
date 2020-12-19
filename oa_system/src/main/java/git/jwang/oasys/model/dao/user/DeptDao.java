package git.jwang.oasys.model.dao.user;

import git.jwang.oasys.model.entity.user.Dept;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DeptDao extends PagingAndSortingRepository<Dept, Long> {

}
