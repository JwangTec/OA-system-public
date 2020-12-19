package git.jwang.oasys.model.dao.role;

import git.jwang.oasys.model.entity.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface RoleDao extends JpaRepository<Role, Long> {
}
