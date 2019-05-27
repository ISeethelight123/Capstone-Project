package com.sq.service;

import java.util.List;

import com.sq.pojo.Car;

public interface CarService {

	/**
	 * 车辆增加
	 */
	void addCar(Car c); 
	/**
	 * 车辆删除
	 */
	void deleteCarById(Integer carId);
	/**
	 * 车辆批量删除
	 */
	void deleteCarMassById(int[] arrId);
	/**
	 * 车辆修改
	 */
	void updateCar(Car c);
	/**
	 * 车辆查询(全部车辆)
	 */
	List<Car> selectCarAll();
	/**
	 * 车辆查询(单个车辆)
	 */
	Car selectCarOneById(Integer carId);
	/**
	 * 车辆查询(单个车辆)
	 */
	Car selectCarOneByPlate(String carPlate);
	/**
	 * 车辆查询(条件查询)
	 */
	List<Car> selectCarChoose(Car c);
	/**
	 * 车辆查询(模糊查询)
	 */
	List<Car> selectCarLike(Car c);
	
	
	
	
}
