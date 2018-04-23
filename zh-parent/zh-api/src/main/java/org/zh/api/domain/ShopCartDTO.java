package org.zh.api.domain;

import java.util.Date;

public class ShopCartDTO {
	 	private Integer id;

	    private Integer userId;

	    private String productCode;

	    private String batchCode;

	    private Integer quantity;

	    private Date createTime;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public String getProductCode() {
			return productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getBatchCode() {
			return batchCode;
		}

		public void setBatchCode(String batchCode) {
			this.batchCode = batchCode;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public Date getCreateTime() {
			return createTime;
		}

		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
	    

}
