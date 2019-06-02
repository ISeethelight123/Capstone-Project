package com.qyqjava.pojo;

public class Wrehouse {
	private Integer wrehouseId;

	private Integer wrehouseAddress;

	private String wrehouseName;

	private String wrehousePhone;

	@Override
	public String toString() {
		return "Wrehouse [wrehouseId=" + wrehouseId + ", wrehouseAddress=" + wrehouseAddress + ", wrehouseName="
				+ wrehouseName + ", wrehousePhone=" + wrehousePhone + "]";
	}

	public Integer getWrehouseId() {
		return wrehouseId;
	}

	public void setWrehouseId(Integer wrehouseId) {
		this.wrehouseId = wrehouseId;
	}

	public Integer getWrehouseAddress() {
		return wrehouseAddress;
	}

	public void setWrehouseAddress(Integer wrehouseAddress) {
		this.wrehouseAddress = wrehouseAddress;
	}

	public String getWrehouseName() {
		return wrehouseName;
	}

	public void setWrehouseName(String wrehouseName) {
		this.wrehouseName = wrehouseName == null ? null : wrehouseName.trim();
	}

	public String getWrehousePhone() {
		return wrehousePhone;
	}

	public void setWrehousePhone(String wrehousePhone) {
		this.wrehousePhone = wrehousePhone == null ? null : wrehousePhone.trim();
	}
}