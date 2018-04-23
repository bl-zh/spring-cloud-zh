/**
 * 
 */
package org.zh.admin.service.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.zh.admin.service.web.service.OrderService;
import org.zh.api.service.OrderAminClientService;

/**
 * @author hudepin
 *
 */
@RestController
public class OrderController implements OrderAminClientService{
	private final OrderService orderService;
	
	@Autowired
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public long countTotal() {
		// TODO Auto-generated method stub
		return orderService.countTotal();
	}

	@Override
	public long yestodayOrderTotal() {
		// TODO Auto-generated method stub
		return orderService.yestodayOrderTotal();
	}

	@Override
	public double queryTotalOrderAmountIn() {
		// TODO Auto-generated method stub
		return orderService.queryTotalOrderAmountIn();
	}

}
