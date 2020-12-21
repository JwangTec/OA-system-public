package git.jwang.oasys.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import git.jwang.oasys.model.entity.process.ProcessList;
import git.jwang.oasys.model.entity.process.Resign;

public interface ResignDao extends PagingAndSortingRepository<Resign, Long>{

	Resign findByProId(ProcessList process);

}
