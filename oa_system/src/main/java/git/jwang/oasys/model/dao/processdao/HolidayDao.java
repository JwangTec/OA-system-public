package git.jwang.oasys.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import git.jwang.oasys.model.entity.process.Holiday;
import git.jwang.oasys.model.entity.process.ProcessList;

public interface HolidayDao extends PagingAndSortingRepository<Holiday, Long>{

	Holiday findByProId(ProcessList pro);

}
