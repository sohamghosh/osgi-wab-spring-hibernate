package org.motechproject.spike.wab;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Stock implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue
    @Column(name = "STOCK_ID")
    private Integer stockId;

    @Column(name = "STOCK_CODE")
    private String stockCode;

    @Column(name = "STOCK_NAME")
    private String stockName;

    public Integer getStockId() {
        return this.stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return this.stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return this.stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("Stock");
        sb.append("{stockId=").append(stockId);
        sb.append(", stockCode='").append(stockCode).append('\'');
        sb.append(", stockName='").append(stockName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

