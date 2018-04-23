package org.zh.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InventoryStatistics {
	@Id@GeneratedValue
    private Integer id;

    private String productCode;

    private String batchCode;

    private Integer residue;

    private Integer expense;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode == null ? null : batchCode.trim();
    }

    public Integer getResidue() {
        return residue;
    }

    public void setResidue(Integer residue) {
        this.residue = residue;
    }

    public Integer getExpense() {
        return expense;
    }

    public void setExpense(Integer expense) {
        this.expense = expense;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}