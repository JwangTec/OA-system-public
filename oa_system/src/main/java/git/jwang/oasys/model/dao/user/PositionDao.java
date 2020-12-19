package git.jwang.oasys.model.dao.user;

import git.jwang.oasys.model.entity.user.Position;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PositionDao extends PagingAndSortingRepository<Position, Long> {
}
