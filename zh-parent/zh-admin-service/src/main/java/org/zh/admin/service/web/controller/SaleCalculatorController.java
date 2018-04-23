package org.zh.admin.service.web.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zh.admin.service.web.service.InventoryService;
import org.zh.api.domain.SaleCalculatorDTO;
import org.zh.api.service.SaleCalculatorService;
import org.zh.domain.entity.Inventory;
import org.zh.domain.entity.InventoryStatistics;

@RestController
public class SaleCalculatorController implements SaleCalculatorService {

	@Autowired
	InventoryService inventoryService;
	
	@Override
	public List<SaleCalculatorDTO> calculate(@RequestBody SaleCalculatorDTO inputDTO) {
		List<SaleCalculatorDTO> outputList = new ArrayList<SaleCalculatorDTO>();
		Iterable<InventoryStatistics> statistics = inventoryService.findInventoryStatisticsByResidue();
		for (InventoryStatistics inventoryStatistics : statistics) {
			SaleCalculatorDTO output = new SaleCalculatorDTO();
			output.setResidue(inventoryStatistics.getResidue());
			output.setProductCode(inventoryStatistics.getProductCode());
			
			List<Inventory> Inventorys = inventoryService.findInventoryByStatistics(inventoryStatistics);
			BigDecimal costPrice = Inventorys.get(0).getCostPrice();

			BigDecimal Residue = new BigDecimal(output.getResidue());
			BigDecimal saleNum = Residue.max(inputDTO.getSaleNum());
			BigDecimal profit = inputDTO.getPrice().subtract(costPrice).divide(saleNum);
			output.setProfit(profit);
			
			outputList.add(output);
		}
		return outputList;
	}

}
