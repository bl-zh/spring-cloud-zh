package org.zh.domain.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.zh.domain.entity.OrderItem;

public interface OrderItemRepository extends CrudRepository<OrderItem, Integer>{
	
	/**
	 * 查询订单
	 * @param userId
	 * @return
	 */
	@Query("select id,order_id,order_no,product_id,sale_price,quantity,create_time,amount,batch_code,product_code from order_item  where order_id = ?1 ")
	Iterable<OrderItem> findOrderItemByUserIdNew(int orderId);
	/**
	 * 查询所有的
	 * @param userId
	 * @return
	 */
	@Query("select a.id,a.order_id,a.order_no,a.product_id,a.sale_price,a.quantity,a.create_time,a.amount,a.batch_code,a.product_code from order_item a,order b where a.order_id = b.id and b.userid = ?1")
	Iterable<OrderItem> findOrderItemByUserId(int userId);
	
}
