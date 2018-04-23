package org.zh.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class ProductidSet {
	@Id@GeneratedValue
    private Integer id;

    private String productIdSet;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductIdSet() {
		return productIdSet;
	}

	public void setProductIdSet(String productIdSet) {
		this.productIdSet = productIdSet;
	}
    
    
}
