package org.zh.api.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zh.api.domain.SaleCalculatorDTO;

@FeignClient(value = "zh-admin-service") // 服务提供方应用的名称
@RequestMapping("/saleCalculator")
public interface SaleCalculatorService {

	@GetMapping(value = "/calc")
	public List<SaleCalculatorDTO> calculate(@RequestBody SaleCalculatorDTO inputDTO);
	
}
