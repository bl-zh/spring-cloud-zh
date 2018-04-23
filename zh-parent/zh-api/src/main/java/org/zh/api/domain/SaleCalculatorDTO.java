package org.zh.api.domain;

import java.math.BigDecimal;

public class SaleCalculatorDTO {

	/**
	 * 输入商品数量
	 */
	private BigDecimal saleNum;
	
	/**
	 * 输入商品价格
	 */
	private BigDecimal price;
	
	private String productCode;
	
	private String productName;
	
	/**
	 * 盈利
	 */
	private BigDecimal  profit;
	
	/**
	 * 剩余库存数量
	 */
	private Integer residue;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getSaleNum() {
		return saleNum;
	}

	public void setSaleNum(BigDecimal saleNum) {
		this.saleNum = saleNum;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getProfit() {
		return profit;
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}

	public Integer getResidue() {
		return residue;
	}

	public void setResidue(Integer residue) {
		this.residue = residue;
	}
	
	
}
