package com.qyqjava.pojo;

import java.util.Date;

public class Outwerhouse {
    private Integer outwerhouseId;

    private Date outtime;

    private Integer wrehouseId;

    private Integer orderId;

    public Integer getOutwerhouseId() {
        return outwerhouseId;
    }

    public void setOutwerhouseId(Integer outwerhouseId) {
        this.outwerhouseId = outwerhouseId;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
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