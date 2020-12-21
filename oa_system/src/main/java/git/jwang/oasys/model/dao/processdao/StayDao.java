package git.jwang.oasys.model.dao.processdao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import git.jwang.oasys.model.entity.process.EvectionMoney;
import git.jwang.oasys.model.entity.process.Stay;

public interface StayDao extends PagingAndSortingRepository<Stay, Long>{
 
	List<Stay> findByEvemoney(EvectionMoney money);
}
