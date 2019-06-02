package com.sq.pojo;

public class CarLoad {

	Integer carloadId;
	String carloads;
	public Integer getCarloadId() {
		return carloadId;
	}
	public void setCarloadId(Integer carloadId) {
		this.carloadId = carloadId;
	}
	public String getCarloads() {
		return carloads;
	}
	public void setCarloads(String carloads) {
		this.carloads = carloads;
	}
	@Override
	public String toString() {
		return "CarLoad [carloadId=" + carloadId + ", carloads=" + carloads + "]";
	}
	
	
	
	
	
}
