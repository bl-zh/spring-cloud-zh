package org.zh.admin.service.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zh.admin.service.web.service.QueryRecDataService;
import org.zh.api.domain.ProductDTO;
import org.zh.api.domain.ProductList;
import org.zh.api.domain.UserInfoDTO;
import org.zh.api.service.QueryRecommendData;

/**
 * @author sunyb 根据会员ID或者商品ID 查询推荐的产品信息
 *
 * 2018年4月20日下午12:26:05
 */
@RestController
public class QueryRecDataController implements QueryRecommendData {
	
	private final QueryRecDataService queryRecDataService;
	
	@Autowired
	public QueryRecDataController(QueryRecDataService queryRecDataService){
		this.queryRecDataService= queryRecDataService;
	}
	
	/**
	 * 根据userId查询推荐的商品信息
	 * @param 
	 * @return
	 */
	@Override
	public ArrayList<ProductList> findRecDataByUserId(@RequestBody UserInfoDTO user) {
		ArrayList<ProductList> list = queryRecDataService.findRecDataByUserId(user.getId());
		return list;
	}

	/**
	 * 根据productId 查询推荐的信息
	 * @param 
	 */
	@Override
	public ArrayList<ProductList> findRecDataByProId(@RequestBody ProductDTO product) {
		ArrayList<ProductList> list = queryRecDataService.findRecDataByUserId(product.getId());
		return list;
	}

}
