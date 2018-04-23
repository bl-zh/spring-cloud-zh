/**
 * 
 */
package org.zh.admin.service.web.service.impl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zh.admin.service.web.service.OrderService;
import org.zh.domain.entity.Inventory;
import org.zh.domain.entity.Order;
import org.zh.domain.repository.OrderRepository;

/**
 * @author hudepin
 *
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService{
	
	private final OrderRepository orderRepository;
	
	
	@Autowired
	public OrderServiceImpl(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public long countTotal() {
		// TODO Auto-generated method stub
		return orderRepository.count();
	}

	@Override
	public long yestodayOrderTotal() {
		Date createTime = new Date();
		List<Order>	list = orderRepository.findByCreateTimeLessThen(createTime);
		if(CollectionUtils.isEmpty(list)) return 0;
		return list.size();
	}

	@Override
	public double queryTotalOrderAmountIn() {
		Iterable<Order>	is = orderRepository.findAll();
		if(is==null) return 0;
		double total=0;
		for (Iterator iter = is.iterator(); iter.hasNext();) {
			total=total+((Order)iter.next()).getTotal();
		}
		return total;
	}

}
