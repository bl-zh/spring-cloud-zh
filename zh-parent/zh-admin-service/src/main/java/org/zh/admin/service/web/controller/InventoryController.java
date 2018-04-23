/**
 * 
 */
package org.zh.admin.service.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.zh.admin.service.web.service.InventoryService;
import org.zh.api.service.InventoryAdminClientService;

/**
 * @author hudepin
 *
 */
@RestController
public class InventoryController implements InventoryAdminClientService {
	private final InventoryService inventoryService;
	
	@Autowired
	public InventoryController(InventoryService inventoryService) {
		super();
		this.inventoryService = inventoryService;
	}




	@Override
	public double queryProductTotalAmount() {
		// TODO Auto-generated method stub
		return inventoryService.queryProductTotalAmount();
	}

}
