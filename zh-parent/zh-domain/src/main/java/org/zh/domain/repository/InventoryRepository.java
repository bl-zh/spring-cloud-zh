package org.zh.domain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.zh.domain.entity.Inventory;

public interface InventoryRepository extends CrudRepository<Inventory, Integer>{

	List<Inventory> findByProductCodeAndBatchCodeAndInventoryType(String productCode, String batchCode,int inventoryType);

}
