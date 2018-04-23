package org.zh.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.zh.domain.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{
	
	/**
	 * 查询订单
	 * @param userId
	 * @return
	 */
	@Query("select * from OrderItem  where order_id = ?1 ")
	Iterable<OrderItem> findOrderItemByUserIdNew(int orderId);
	/**
	 * 查询所有的
	 * @param userId
	 * @return
	 */
	@Query("select a from OrderItem a,Order b where a.order_id = b.id and b.userid = ?1")
	Iterable<OrderItem> findOrderItemByUserId(int userId);
	
}
