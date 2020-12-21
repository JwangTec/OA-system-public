package git.jwang.oasys.model.dao.plandao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import git.jwang.oasys.model.entity.process.EvectionMoney;

import git.jwang.oasys.model.entity.process.Traffic;

public interface TrafficDao extends PagingAndSortingRepository<Traffic, Long>{

	List<Traffic> findByEvection(EvectionMoney money);
}
