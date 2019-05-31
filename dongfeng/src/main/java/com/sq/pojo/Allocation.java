package com.sq.pojo;

public class Allocation {

	private Integer no;

	private Integer allocationId;

	private Integer allocationType;

	private String orderId;

	private Integer wrehouseId;
	//表一对一
	private Wrehouse wrehouse;
	//表一对一
	private Orders order;

	

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Wrehouse getWrehouse() {
		return wrehouse;
	}

	public void setWrehouse(Wrehouse wrehouse) {
		this.wrehouse = wrehouse;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public Integer getAllocationId() {
		return allocationId;
	}

	public void setAllocationId(Integer allocationId) {
		this.allocationId = allocationId;
	}

	public Integer getAllocationType() {
		return allocationType;
	}

	public void setAllocationType(Integer allocationType) {
		this.allocationType = allocationType;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId == null ? null : orderId.trim();
	}

	public Integer getWrehouseId() {
		return wrehouseId;
	}

	public void setWrehouseId(Integer wrehouseId) {
		this.wrehouseId = wrehouseId;
	}
}