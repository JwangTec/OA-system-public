package git.jwang.oasys.model.dao.discuss;

import org.springframework.data.jpa.repository.JpaRepository;

import git.jwang.oasys.model.entity.discuss.VoteList;

public interface VoteListDao extends JpaRepository<VoteList, Long>{

}
