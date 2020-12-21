package git.jwang.oasys.model.dao.discuss;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import git.jwang.oasys.model.entity.discuss.VoteTitleUser;
import git.jwang.oasys.model.entity.discuss.VoteTitles;
import git.jwang.oasys.model.entity.user.User;

public interface VoteTitlesUserDao extends JpaRepository<VoteTitleUser, Long>{
	
	//在用户投票的标题表中查找所有的同一标题的集合
	List<VoteTitleUser> findByVoteTitles(VoteTitles voteTitles);
	
	//在用户投票的标题表中查找所有的同一投票的集合
	List<VoteTitleUser> findByVoteId(Long voteId);
	
	VoteTitleUser findByVoteTitlesAndUser(VoteTitles voteTitles,User user);
	
	

}
