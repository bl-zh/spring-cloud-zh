/**
 * 
 */
package org.zh.front.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zh.api.domain.ShopCartDTO;
import org.zh.api.service.ShopCartClientService;

/**
 * @author HDP23
 *
 */
@RestController
public class ShopCartController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ShopCartController.class);
	@Autowired
	private ShopCartClientService shopCartClientService;

	@PostMapping("/shopcart/save")
	public boolean save(@RequestBody ShopCartDTO shopCart) {
		LOGGER.info("save start"+shopCart);
		return shopCartClientService.save(shopCart);
	}

}
