package git.jwang.oasys.model.dao.user;


import git.jwang.oasys.model.entity.user.LoginRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserLogRecordDao extends JpaRepository<LoginRecord, Long> {

    @Query(nativeQuery=true, value="SELECT COUNT(*) FROM aoa_user_login_record WHERE " +
            "DATE_FORMAT(aoa_user_login_record.login_time,'%Y-%m-%d')=?1")
    Integer countlog(String date);
}
