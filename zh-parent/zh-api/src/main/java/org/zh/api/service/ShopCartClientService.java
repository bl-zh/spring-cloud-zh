/**
 * 
 */
package org.zh.api.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.zh.api.domain.ShopCartDTO;

/**
 * @author HDP23
 *
 */
@FeignClient(value = "zh-front-service") 
public interface ShopCartClientService {
	@PostMapping(value = "/shopcart/save")
	public boolean save(@RequestBody ShopCartDTO shopCart);

}
