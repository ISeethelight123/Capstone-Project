package com.sq.pojo;

public class Car {

	Integer carId;
	String carPlate;
	Integer carWeight;
	Integer carType;
	String carSize;
	String carStatus;
	String temp3;
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
	public String getTemp3() {
		return temp3;
	}
	public void setTemp3(String temp3) {
		this.temp3 = temp3;
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
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carPlate=" + carPlate + ", carWeight=" + carWeight + ", carType=" + carType
				+ ", carSize=" + carSize + ", carStatus=" + carStatus + ", temp3=" + temp3 + "]";
	}
	
	
	
	
	
	
	
	
}
