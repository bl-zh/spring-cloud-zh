package org.zh.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zh.domain.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Integer>{

	List<Inventory> findByProductCodeAndBatchCodeAndInventoryType(String productCode, String batchCode,int inventoryType);

}
