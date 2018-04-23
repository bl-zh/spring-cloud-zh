/**
 * 
 */
package org.zh.front.service.web.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zh.api.domain.ShopCartDTO;
import org.zh.domain.entity.ShopCart;
import org.zh.domain.repository.ShopCartRespository;
import org.zh.front.service.web.service.ShopCartService;

/**
 * @author hudepin
 *
 */
@Service
public class ShopCartServiceImpl implements ShopCartService {
	private final ShopCartRespository shopCartRespository;
	@Autowired
	public ShopCartServiceImpl(ShopCartRespository shopCartRespository) {
		this.shopCartRespository = shopCartRespository;
	}
	@Override
	public boolean save(ShopCartDTO shopCart){
		ShopCart entity = new ShopCart();
		BeanUtils.copyProperties(shopCart, entity);
		return shopCartRespository.save(entity )!=null;
	}

	
}
