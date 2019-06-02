package com.sq.pojo;

public class Driver {

	Integer driverId;
	String driverName;
	String driverPhone;
	Integer driverAge;
	String driverAddress;
	String driverStatus;
	
	public Integer getDriverId() {
		return driverId;
	}
	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverPhone() {
		return driverPhone;
	}
	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}
	public Integer getDriverAge() {
		return driverAge;
	}
	public void setDriverAge(Integer driverAge) {
		this.driverAge = driverAge;
	}
	public String getDriverAddress() {
		return driverAddress;
	}
	public void setDriverAddress(String driverAddress) {
		this.driverAddress = driverAddress;
	}
	public String getDriverStatus() {
		return driverStatus;
	}
	public void setDriverStatus(String driverStatus) {
		this.driverStatus = driverStatus;
	}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", driverPhone=" + driverPhone
				+ ", driverAge=" + driverAge + ", driverAddress=" + driverAddress + ", driverStatus=" + driverStatus
				+ "]";
	}
	
	
	
	
}
