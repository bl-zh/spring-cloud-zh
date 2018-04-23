package org.zh.admin.service.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.zh.admin.service.web.service.ProductService;
import org.zh.api.domain.InventoryDTO;
import org.zh.api.domain.ProductDTO;
import org.zh.api.service.ProductAPIService;

@RestController
public class ProductController implements ProductAPIService{

	@Autowired
	private ProductService productService;
	
	
	@Override
	public boolean saveProduct(ProductDTO product) {
		return productService.save(product);
	}

	@Override
	public boolean saveProductBatch(List<ProductDTO> list) {
		return productService.saveBatch(list);
	}

	@Override
	public List<ProductDTO> findAll() {
		return productService.findAll();
	}

	@Override
	public boolean saveInventory(InventoryDTO inventoryDTO) {
		return false;
	}

}
