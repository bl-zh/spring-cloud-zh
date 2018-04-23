package org.zh.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.zh.domain.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

}
