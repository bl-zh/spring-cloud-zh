package org.zh.domain.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.zh.domain.entity.OrderItem;

public interface OrderItemRepository extends CrudRepository<OrderItem, Integer>{
	
	@Query("select a.* from order_item a,order b where a.order_id = b.id and b.user_id = ?1")
	Iterable<OrderItem> findOrderItemByUserId(Integer userId);
	
}
