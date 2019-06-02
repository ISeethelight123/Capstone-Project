package com.sq.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Orders {

	Integer orderId;
	String orderMailName;
	String orderMailPhone;
	String orderMailAddress;
	Integer recipientsId;
	
	String orderTime;
	String orderWeight;
	String orderType;
	String orderMoney;
	Integer orderStaffId;
	String orderOffer;
	String orderUrgent;
	String orderNowAddress;
	Integer orderState;
	
	//表一对一
	Recipients recipient;
	//表一对一
	Allocation allocation;
	
	
	
	public Allocation getAllocation() {
		return allocation;
	}
	public void setAllocation(Allocation allocation) {
		this.allocation = allocation;
	}
	public Recipients getRecipient() {
		return recipient;
	}
	public void setRecipient(Recipients recipient) {
		this.recipient = recipient;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderMailName() {
		return orderMailName;
	}
	public void setOrderMailName(String orderMailName) {
		this.orderMailName = orderMailName;
	}
	public String getOrderMailPhone() {
		return orderMailPhone;
	}
	public void setOrderMailPhone(String orderMailPhone) {
		this.orderMailPhone = orderMailPhone;
	}
	public String getOrderMailAddress() {
		return orderMailAddress;
	}
	public void setOrderMailAddress(String orderMailAddress) {
		this.orderMailAddress = orderMailAddress;
	}
	public Integer getRecipientsId() {
		return recipientsId;
	}
	public void setRecipientsId(Integer recipientsId) {
		this.recipientsId = recipientsId;
	}
	
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
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
	public Integer getOrderStaffId() {
		return orderStaffId;
	}
	public void setOrderStaffId(Integer orderStaffId) {
		this.orderStaffId = orderStaffId;
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
	public String getOrderNowAddress() {
		return orderNowAddress;
	}
	public void setOrderNowAddress(String orderNowAddress) {
		this.orderNowAddress = orderNowAddress;
	}
	public Integer getOrderState() {
		return orderState;
	}
	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}
	
	
	
	
	
	
}
