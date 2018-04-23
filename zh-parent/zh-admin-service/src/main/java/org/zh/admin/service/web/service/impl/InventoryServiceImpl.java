package org.zh.admin.service.web.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zh.admin.service.web.service.InventoryService;
import org.zh.api.domain.InventoryDTO;
import org.zh.domain.entity.Inventory;
import org.zh.domain.entity.InventoryStatistics;
import org.zh.domain.repository.InventoryRepository;
import org.zh.domain.repository.InventoryStatisticsRepository;

@Service
@Transactional
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;
	
	@Autowired
	private InventoryStatisticsRepository inventoryStatisticsRepository;
	
	@Override
	public boolean save(InventoryDTO invDTO){
		Inventory inventory = new Inventory();
		BeanUtils.copyProperties(invDTO, inventory);
		Inventory save = inventoryRepository.save(inventory);
		if(save == null){
			return false;
		}
		InventoryStatistics statistics = new InventoryStatistics();
		statistics.setBatchCode(invDTO.getBatchCode());
		statistics.setProductCode(invDTO.getProductCode());
		statistics.setResidue(invDTO.getQuantity());
		statistics.setVersion(0);
		
		return inventoryStatisticsRepository.save(statistics)!=null;
	}
}