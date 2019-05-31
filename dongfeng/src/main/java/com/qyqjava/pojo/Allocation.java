package com.qyqjava.pojo;

public class Allocation {

	private Integer no;

	private Integer allocationId;

	private Integer allocationType;

	private String orderId;

	private Integer wrehouseId;

	@Override
	public String toString() {
		return "Allocation [no=" + no + ", allocationId=" + allocationId + ", allocationType=" + allocationType
				+ ", orderId=" + orderId + ", wrehouseId=" + wrehouseId + "]";
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