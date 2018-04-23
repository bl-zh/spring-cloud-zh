package org.zh.admin.service.web.service;

import java.util.ArrayList;

import org.zh.api.domain.ProductList;


public interface QueryRecDataService {
	/**
	 * 根据userId 查询推荐的信息
	 * @param userId
	 */
	ArrayList<ProductList> findRecDataByUserId(int userId);

	/**
	 * 根据productId 查询推荐的信息
	 * @param productId
	 */
	ArrayList<ProductList> findRecDataByProId(int productId);
}
