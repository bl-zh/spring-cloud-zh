package org.zh.admin.service.web.service;


import java.util.List;

import org.zh.api.domain.InventoryDTO;
import org.zh.domain.entity.Inventory;
import org.zh.domain.entity.InventoryStatistics;

public interface InventoryService {

	boolean save(InventoryDTO inve);

	public Iterable<InventoryStatistics> findInventoryStatisticsByResidue();

	List<Inventory> findInventoryByStatistics(InventoryStatistics inventoryStatistics); 

	
}
