/**
 * 
 */
package org.zh.api.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hudepin
 *
 */
@FeignClient(value="zh-admin-service")
@RequestMapping("order")
public interface OrderAminClientService {
	/**
	 * 总的订单数量
	 * @return
	 */
	@GetMapping(value="count/total")
	public long countTotal();
	/**
	 * 昨天订单总数量
	 * @return
	 */
	@GetMapping(value="count/yestoday/total")
	public long yestodayOrderTotal();
	/**
	 * 查询订单总收入
	 * @return
	 */
	@GetMapping(value="count/total/amount")
	public double queryTotalOrderAmountIn();

}
