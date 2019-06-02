package com.sq.pojo;

public class Car {

	Integer carId;
	String carPlate;
	Integer carWeight;
	Integer carType;
	String carSize;
	String carStatus;
	
	//一对一
	CarLoad loads;
	CarType types;
	
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public String getCarPlate() {
		return carPlate;
	}
	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}
	public String getCarSize() {
		return carSize;
	}
	public void setCarSize(String carSize) {
		this.carSize = carSize;
	}
	public Integer getCarWeight() {
		return carWeight;
	}
	public void setCarWeight(Integer carWeight) {
		this.carWeight = carWeight;
	}
	public Integer getCarType() {
		return carType;
	}
	public void setCarType(Integer carType) {
		this.carType = carType;
	}
	
	public String getCarStatus() {
		return carStatus;
	}
	public void setCarStatus(String carStatus) {
		this.carStatus = carStatus;
	}
	
	public CarLoad getLoads() {
		return loads;
	}
	public void setLoads(CarLoad loads) {
		this.loads = loads;
	}
	public CarType getTypes() {
		return types;
	}
	public void setTypes(CarType types) {
		this.types = types;
	}
	
	
	
	
	
	
	
	
	
}
