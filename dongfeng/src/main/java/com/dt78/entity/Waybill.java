package com.dt78.entity;

import java.util.Date;

public class Waybill {
    private Integer orderId;

    private String orderMailname;

    private String orderMailphone;

    private String orderMailaddress;

    private String recipientsId;

    private Date orderTime;

    private String orderWeight;

    private String orderType;

    private String orderMoney;

    private Integer orderStaffid;

    private String orderOffer;

    private String orderUrgent;

    private Integer orderState;

    private String orderNowaddress;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderMailname() {
        return orderMailname;
    }

    public void setOrderMailname(String orderMailname) {
        this.orderMailname = orderMailname;
    }

    public String getOrderMailphone() {
        return orderMailphone;
    }

    public void setOrderMailphone(String orderMailphone) {
        this.orderMailphone = orderMailphone;
    }

    public String getOrderMailaddress() {
        return orderMailaddress;
    }

    public void setOrderMailaddress(String orderMailaddress) {
        this.orderMailaddress = orderMailaddress;
    }

    public String getRecipientsId() {
        return recipientsId;
    }

    public void setRecipientsId(String recipientsId) {
        this.recipientsId = recipientsId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderWeight() {
        return orderWeight;
    }

    public void setOrderWeight(String orderWeight) {
        this.orderWeight = orderWeight;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(String orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getOrderStaffid() {
        return orderStaffid;
    }

    public void setOrderStaffid(Integer orderStaffid) {
        this.orderStaffid = orderStaffid;
    }

    public String getOrderOffer() {
        return orderOffer;
    }

    public void setOrderOffer(String orderOffer) {
        this.orderOffer = orderOffer;
    }

    public String getOrderUrgent() {
        return orderUrgent;
    }

    public void setOrderUrgent(String orderUrgent) {
        this.orderUrgent = orderUrgent;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getOrderNowaddress() {
        return orderNowaddress;
    }

    public void setOrderNowaddress(String orderNowaddress) {
        this.orderNowaddress = orderNowaddress;
    }

	@Override
	public String toString() {
		return "Waybill [orderId=" + orderId + ", orderMailname=" + orderMailname + ", orderMailphone=" + orderMailphone
				+ ", orderMailaddress=" + orderMailaddress + ", recipientsId=" + recipientsId + ", orderTime="
				+ orderTime + ", orderWeight=" + orderWeight + ", orderType=" + orderType + ", orderMoney=" + orderMoney
				+ ", orderStaffid=" + orderStaffid + ", orderOffer=" + orderOffer + ", orderUrgent=" + orderUrgent
				+ ", orderState=" + orderState + ", orderNowaddress=" + orderNowaddress + "]";
	}
    
}