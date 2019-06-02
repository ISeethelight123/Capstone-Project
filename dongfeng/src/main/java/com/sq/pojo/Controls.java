package com.sq.pojo;

import java.util.Date;

public class Controls {

	private Integer controlId;
	private Integer controlCarid;
	private Integer controlLineid;
	private Integer controlDriverid;
	private Integer controlWaybilid;
	private String controlStarttime;
	private String controlEndtime;
	private Integer controlWrehouseId;
	private String controlDestination;
	private String temp3;
	
	//表一对一
	private Car car;
	private Driver driver;
	private Wrehouse wrehouse;
	
	
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Wrehouse getWrehouse() {
		return wrehouse;
	}
	public void setWrehouse(Wrehouse wrehouse) {
		this.wrehouse = wrehouse;
	}
	public Integer getControlId() {
		return controlId;
	}
	public void setControlId(Integer controlId) {
		this.controlId = controlId;
	}
	public Integer getControlCarid() {
		return controlCarid;
	}
	public void setControlCarid(Integer controlCarid) {
		this.controlCarid = controlCarid;
	}
	public Integer getControlLineid() {
		return controlLineid;
	}
	public void setControlLineid(Integer controlLineid) {
		this.controlLineid = controlLineid;
	}
	public Integer getControlDriverid() {
		return controlDriverid;
	}
	public void setControlDriverid(Integer controlDriverid) {
		this.controlDriverid = controlDriverid;
	}
	public Integer getControlWaybilid() {
		return controlWaybilid;
	}
	public void setControlWaybilid(Integer controlWaybilid) {
		this.controlWaybilid = controlWaybilid;
	}
	
	
	
	public String getControlStarttime() {
		return controlStarttime;
	}
	public void setControlStarttime(String controlStarttime) {
		this.controlStarttime = controlStarttime;
	}
	public String getControlEndtime() {
		return controlEndtime;
	}
	public void setControlEndtime(String controlEndtime) {
		this.controlEndtime = controlEndtime;
	}
	public String getTemp3() {
		return temp3;
	}
	public void setTemp3(String temp3) {
		this.temp3 = temp3;
	}
	
	public String getControlDestination() {
		return controlDestination;
	}
	public void setControlDestination(String controlDestination) {
		this.controlDestination = controlDestination;
	}
	public Integer getControlWrehouseId() {
		return controlWrehouseId;
	}
	public void setControlWrehouseId(Integer controlWrehouseId) {
		this.controlWrehouseId = controlWrehouseId;
	}
	
	
	
	
	
	
	
	
}
