package org.zh.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zh.domain.entity.InventoryStatistics;

public interface InventoryStatisticsRepository extends JpaRepository<InventoryStatistics, Integer>{

	Iterable<InventoryStatistics> findByResidueGreaterThan(int i);

}
