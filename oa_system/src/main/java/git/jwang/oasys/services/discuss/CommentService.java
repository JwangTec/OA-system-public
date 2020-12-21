package git.jwang.oasys.services.discuss;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import git.jwang.oasys.model.dao.discuss.CommentDao;
import git.jwang.oasys.model.entity.discuss.Comment;

@Service
@Transactional
public class CommentService {
	@Autowired
	private CommentDao commentDao;
	
	//保存
	public Comment save(Comment comment){
		return commentDao.save(comment);
	}
	
	public void deleteComment(Long comment){
		commentDao.delete(comment);
	}

}
