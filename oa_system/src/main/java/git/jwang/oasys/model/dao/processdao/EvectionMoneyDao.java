package git.jwang.oasys.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import git.jwang.oasys.model.entity.process.EvectionMoney;
import git.jwang.oasys.model.entity.process.ProcessList;

public interface EvectionMoneyDao extends PagingAndSortingRepository<EvectionMoney, Long>{

	EvectionMoney findByProId(ProcessList pro);
}
