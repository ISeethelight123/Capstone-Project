package com.qyqjava.pojo;

import java.util.Date;

public class Orders {
    private Integer orderId;

    private String orderMailname;

    private String orderMailphone;

    private String orderMailaddress;

    private Integer recipientsId;

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
        this.orderMailname = orderMailname == null ? null : orderMailname.trim();
    }

    public String getOrderMailphone() {
        return orderMailphone;
    }

    public void setOrderMailphone(String orderMailphone) {
        this.orderMailphone = orderMailphone == null ? null : orderMailphone.trim();
    }

    public String getOrderMailaddress() {
        return orderMailaddress;
    }

    public void setOrderMailaddress(String orderMailaddress) {
        this.orderMailaddress = orderMailaddress == null ? null : orderMailaddress.trim();
    }

    public Integer getRecipientsId() {
        return recipientsId;
    }

    public void setRecipientsId(Integer recipientsId) {
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
        this.orderWeight = orderWeight == null ? null : orderWeight.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(String orderMoney) {
        this.orderMoney = orderMoney == null ? null : orderMoney.trim();
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
        this.orderOffer = orderOffer == null ? null : orderOffer.trim();
    }

    public String getOrderUrgent() {
        return orderUrgent;
    }

    public void setOrderUrgent(String orderUrgent) {
        this.orderUrgent = orderUrgent == null ? null : orderUrgent.trim();
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
        this.orderNowaddress = orderNowaddress == null ? null : orderNowaddress.trim();
    }
}