package git.jwang.oasys.services.system;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import git.jwang.oasys.model.dao.system.StatusDao;
import git.jwang.oasys.model.entity.system.SystemStatusList;

@Service
@Transactional
public class StatusService {
	
	@Autowired
	private StatusDao statusDao;
	
	/**
	 * 新增和更新方法
	 * @param status
	 * @return
	 */
	public SystemStatusList save(SystemStatusList status){
		return statusDao.save(status);
	}
	
	/**
	 * 删除方法
	 */
	public void deleteStatus(Long statusId){
		statusDao.delete(statusId);
	}

}
