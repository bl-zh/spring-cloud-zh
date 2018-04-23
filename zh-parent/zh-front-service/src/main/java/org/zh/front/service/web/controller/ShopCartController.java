/**
 * 
 */
package org.zh.front.service.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zh.api.domain.ShopCartDTO;
import org.zh.api.service.ShopCartClientService;
import org.zh.front.service.web.service.ShopCartService;

/**
 * @author hudepin
 *
 */
@RestController
public class ShopCartController implements ShopCartClientService{
	private final ShopCartService shopCartService;
	
	@Autowired
	public ShopCartController(ShopCartService shopCartService) {
		this.shopCartService = shopCartService;
	}


	@Override
	public boolean save(@RequestBody ShopCartDTO shopCart) {
		// TODO Auto-generated method stub
		return shopCartService.save(shopCart);
	}

}
