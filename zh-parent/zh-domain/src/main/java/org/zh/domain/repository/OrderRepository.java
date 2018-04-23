package org.zh.domain.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.zh.domain.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{
	/**
	 * 查询最新的订单
	 * @param userId
	 * @return
	 */
	@Query("select id,order_no,userid,create_time,total from order where userid = ?1 order by CREATE_time desc limit 1 ")
	Order findOrderLast(int userid);
}
