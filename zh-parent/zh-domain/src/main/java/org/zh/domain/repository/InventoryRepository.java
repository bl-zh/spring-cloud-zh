package org.zh.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.zh.domain.entity.Inventory;

public interface InventoryRepository extends CrudRepository<Inventory, Integer>{

}
