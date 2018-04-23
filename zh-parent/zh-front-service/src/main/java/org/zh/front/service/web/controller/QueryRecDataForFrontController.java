package org.zh.front.service.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.zh.api.domain.ProductDTO;
import org.zh.api.domain.ProductList;
import org.zh.api.domain.UserInfoDTO;
import org.zh.api.service.QueryRecDataForFront;
import org.zh.front.service.web.service.QueryRecDataService;

/**
 * @author sunyb
 *
 */
@RestController
public class QueryRecDataForFrontController implements QueryRecDataForFront {

	private final QueryRecDataService queryRecDataService;
	
	@Autowired
	public QueryRecDataForFrontController(QueryRecDataService queryRecDataService){
		this.queryRecDataService= queryRecDataService;
	}
	
	/**
	 * 根据userId查询推荐的商品信息
	 * @param 
	 * @return
	 */
	@Override
	public ArrayList<ProductList> findRecDataByUserId(UserInfoDTO user) {
		ArrayList<ProductList> list = queryRecDataService.findRecDataByUserId(user.getId());
		return list;
	}

	/**
	 * 根据productId 查询推荐的信息
	 * @param 
	 */
	@Override
	public ArrayList<ProductList> findRecDataByProId(ProductDTO product) {
		ArrayList<ProductList> list = queryRecDataService.findRecDataByUserId(product.getId());
		return list;
	}

}
