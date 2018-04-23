package org.zh.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zh.domain.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Integer>{

}
