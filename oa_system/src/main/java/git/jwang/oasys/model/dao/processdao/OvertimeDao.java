package git.jwang.oasys.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import git.jwang.oasys.model.entity.process.Overtime;
import git.jwang.oasys.model.entity.process.ProcessList;

public interface OvertimeDao extends PagingAndSortingRepository<Overtime, Long>{

	Overtime findByProId(ProcessList pro);

}
