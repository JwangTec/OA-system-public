package git.jwang.oasys.model.dao.discuss;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import git.jwang.oasys.model.entity.discuss.VoteList;
import git.jwang.oasys.model.entity.discuss.VoteTitles;

public interface VoteTitleListDao extends JpaRepository<VoteTitles, Long>{
	
	//根据投票id来找所有投票标题的集合
	List<VoteTitles> findByVoteList(VoteList voteList);
}
