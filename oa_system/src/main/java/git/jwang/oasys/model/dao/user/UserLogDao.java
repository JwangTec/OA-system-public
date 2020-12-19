package git.jwang.oasys.model.dao.user;

import git.jwang.oasys.model.entity.user.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLogDao extends JpaRepository<UserLog, Long> {

}
