package org.zh.admin.service.web.service;

import java.util.List;

import org.zh.api.domain.ProductDTO;

public interface ProductService {
	
	public boolean save(ProductDTO product);
	
	public boolean saveBatch(List<ProductDTO> list);

	public List<ProductDTO> findAll();
}
