package git.jwang.oasys.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import git.jwang.oasys.model.entity.process.Bursement;
import git.jwang.oasys.model.entity.process.ProcessList;

public interface BursementDao extends PagingAndSortingRepository<Bursement, Long>{

	Bursement findByProId(ProcessList process);
	
	

}
