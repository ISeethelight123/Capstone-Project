package com.qyqjava.pojo;

import java.util.Date;

public class Inwrehouse {
    private Integer inwrehouseId;

    private Date inwrehouseTime;

    private Integer wrehouseId;

    private Integer orderId;

    public Integer getInwrehouseId() {
        return inwrehouseId;
    }

    public void setInwrehouseId(Integer inwrehouseId) {
        this.inwrehouseId = inwrehouseId;
    }

    public Date getInwrehouseTime() {
        return inwrehouseTime;
    }

    public void setInwrehouseTime(Date inwrehouseTime) {
        this.inwrehouseTime = inwrehouseTime;
    }

    public Integer getWrehouseId() {
        return wrehouseId;
    }

    public void setWrehouseId(Integer wrehouseId) {
        this.wrehouseId = wrehouseId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}