package com.sq.pojo;

import java.util.Date;

public class Controls {

	Integer controlId;
	Integer controlCarid;
	Integer controlLineid;
	Integer controlDriverid;
	Integer controlWaybilid;
	Date controlStarttime;
	Date controlEndtime;
	String temp1;
	String temp2;
	String temp3;
	
	
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
	public Date getControlStarttime() {
		return controlStarttime;
	}
	public void setControlStarttime(Date controlStarttime) {
		this.controlStarttime = controlStarttime;
	}
	public Date getControlEndtime() {
		return controlEndtime;
	}
	public void setControlEndtime(Date controlEndtime) {
		this.controlEndtime = controlEndtime;
	}
	public String getTemp1() {
		return temp1;
	}
	public void setTemp1(String temp1) {
		this.temp1 = temp1;
	}
	public String getTemp2() {
		return temp2;
	}
	public void setTemp2(String temp2) {
		this.temp2 = temp2;
	}
	public String getTemp3() {
		return temp3;
	}
	public void setTemp3(String temp3) {
		this.temp3 = temp3;
	}
	
	public String toString() {
		return "Controls [controlId=" + controlId + ", controlCarid=" + controlCarid + ", controlLineid="
				+ controlLineid + ", controlDriverid=" + controlDriverid + ", controlWaybilid=" + controlWaybilid
				+ ", controlStarttime=" + controlStarttime + ", controlEndtime=" + controlEndtime + ", temp1=" + temp1
				+ ", temp2=" + temp2 + ", temp3=" + temp3 + "]";
	}
	
	
	
	
	
}
