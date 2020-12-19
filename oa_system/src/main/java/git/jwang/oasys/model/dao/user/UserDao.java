package git.jwang.oasys.model.dao.user;

import git.jwang.oasys.model.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User, Long> {

    /**
     * 用户管理--查询可用用户
     * @param isLock
     * @param pa
     * @return
     */
    Page<User> findByIsLock(Integer isLock, Pageable pa);


    @Query("from User u where u.dept.deptName like %?1% or u.userName " +
            "like %?1% or u.realName like %?1% or u.userTel " +
            "like %?1% or u.role.roleName like %?1%")
    Page<User> findNameLike(String name, Pageable pa);
}
