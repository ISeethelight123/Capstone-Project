package com.sq.pojo;

import java.util.Date;

public class OrderQueryVo {

	//仓库地址
	private String wrehouseName;
	//订单目的地
	private String recipientsProvince; 
	//订单生成时间
	private String orderTime;
	
	//当前页
	private Integer page = 1;
	//每页数
	private Integer size = 10;
	//起始行
	private Integer startRow;
	
	
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getWrehouseName() {
		return wrehouseName;
	}
	public void setWrehouseName(String wrehouseName) {
		this.wrehouseName = wrehouseName;
	}
	
	public String getRecipientsProvince() {
		return recipientsProvince;
	}
	public void setRecipientsProvince(String recipientsProvince) {
		this.recipientsProvince = recipientsProvince;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	
	
	
	
	
}
