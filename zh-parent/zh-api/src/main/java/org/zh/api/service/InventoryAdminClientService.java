/**
 * 
 */
package org.zh.api.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 库存
 * @author hudepin
 *
 */
@FeignClient(value="zh-admin-service")
@RequestMapping("inventory")
public interface InventoryAdminClientService {
	/**
	 * 库存商品总金额
	 * @return
	 */
	@GetMapping(value="total/amount")
	public double queryProductTotalAmount();

}
