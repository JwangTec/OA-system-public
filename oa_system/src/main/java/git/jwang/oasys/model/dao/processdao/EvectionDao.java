package git.jwang.oasys.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import git.jwang.oasys.model.entity.process.Evection;
import git.jwang.oasys.model.entity.process.ProcessList;

public interface EvectionDao extends PagingAndSortingRepository<Evection, Long> {

	Evection findByProId(ProcessList process);

}
