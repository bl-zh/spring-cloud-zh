package org.zh.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.zh.api.domain.ProductDTO;
import org.zh.api.domain.ProductList;
import org.zh.api.domain.UserInfoDTO;

/**
 * @author sunyb
 *
 * 2018年4月20日上午11:12:56
 */
@FeignClient(value = "zh-admin-service")
public interface QueryRecommendData {
	
	/**
	 * 根据userId查询推荐的商品信息
	 * @param user 
	 * @return
	 */
	@PostMapping(value = "/query/findRecDataByUserId")
	public ArrayList<ProductList> findRecDataByUserId(@RequestBody UserInfoDTO user);
	
	/**
	 * 根据商品id查询推荐的商品信息
	 * @param user
	 * @return
	 */
	@PostMapping(value = "/query/findRecDataByProId")
	public ArrayList<ProductList> findRecDataByProId(@RequestBody ProductDTO product);
	
}
