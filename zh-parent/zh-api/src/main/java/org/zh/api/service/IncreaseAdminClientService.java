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
@RequestMapping("increase")
public interface IncreaseAdminClientService {
	@GetMapping(value="profit/total")
	public double profitTotal();
	
	@GetMapping(value="profit/yestoday/total")
	public double yesTodayProfitTotal();

}
