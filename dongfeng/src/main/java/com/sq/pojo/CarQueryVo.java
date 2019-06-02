package com.sq.pojo;

public class CarQueryVo {

	//车Id
	private Integer carId;
	//车牌
	private String carPlate;
	//车载重
	private Integer carWeight;
	//车类型
	private Integer carType;
	
	//车状态(0:运输中,1:闲置中)
	private String carStatus;
	
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
	
	public String getCarPlate() {
		return carPlate;
	}
	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
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
	public String getCarStatus() {
		return carStatus;
	}
	public void setCarStatus(String carStatus) {
		this.carStatus = carStatus;
	}
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	
	
	
	
	
}
