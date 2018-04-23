package org.zh.admin.service.web.service;

public interface OrderService {

	long countTotal();

	long yestodayOrderTotal();

	double queryTotalOrderAmountIn();

}
