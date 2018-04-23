package org.zh.domain.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.zh.domain.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{
	/**
	 * 查询最新的订单
	 * @param userId
	 * @return
	 */
	@Query("select a from Order a where a.userid = ?1 ")
	List<Order> findOrderByUserid(int userid);
	@Query(value="select o from Order o where o.createTime <?1")
	List<Order> findByCreateTimeLessThen(Date createTime);
}
