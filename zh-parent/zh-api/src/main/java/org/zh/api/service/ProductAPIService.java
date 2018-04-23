package org.zh.api.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zh.api.domain.InventoryDTO;
import org.zh.api.domain.ProductDTO;

@FeignClient(value = "zh-admin-service") // 服务提供方应用的名称
@RequestMapping("/product")
public interface ProductAPIService {

	@PostMapping(value = "/save")
	public boolean saveProduct(@RequestBody ProductDTO product);
	
	@PostMapping(value = "/saveBatch")
	public boolean saveProductBatch(@RequestBody List<ProductDTO> list);
	
	@GetMapping(value = "/findAll")
	public List<ProductDTO> findAll();

	@PostMapping(value = "/createInventory")
	public boolean saveInventory(@RequestBody InventoryDTO inventoryDTO);
	
}
