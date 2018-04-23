package org.zh.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.zh.domain.entity.Inventory;

public interface OrderItemRepository extends CrudRepository<Inventory, Integer>{

}
