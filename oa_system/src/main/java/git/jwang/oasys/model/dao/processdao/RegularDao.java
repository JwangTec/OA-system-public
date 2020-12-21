package git.jwang.oasys.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import git.jwang.oasys.model.entity.process.ProcessList;
import git.jwang.oasys.model.entity.process.Regular;

public interface RegularDao extends PagingAndSortingRepository<Regular, Long>{

	Regular findByProId(ProcessList pro);

}
