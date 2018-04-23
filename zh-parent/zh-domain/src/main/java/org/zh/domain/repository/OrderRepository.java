package org.zh.domain.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.zh.domain.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{
	@Query(value="select o from Order o where o.createTime <?1")
	List<Order> findByCreateTimeLessThen(Date createTime);

}
