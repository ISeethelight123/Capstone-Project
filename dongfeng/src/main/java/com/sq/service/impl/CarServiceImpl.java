package com.sq.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sq.mapper.CarMapper;
import com.sq.pojo.Car;
import com.sq.service.CarService;
@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	CarMapper carMapper;

	/**
	 * 车辆增加
	 */
	public void addCar(Car c) {
		carMapper.addCar(c);
	}

	/**
	 * 车辆删除
	 */
	public void deleteCarById(Integer carId) {
		carMapper.deleteCarById(carId);
	}

	/**
	 * 车辆批量删除
	 */
	public void deleteCarMassById(int[] arrId) {
		carMapper.deleteCarMassById(arrId);
	}

	/**
	 * 车辆修改
	 */
	public void updateCar(Car c) {
		carMapper.updateCar(c);
	}

	/**
	 * 车辆查询(全部车辆)
	 */
	public List<Car> selectCarAll() {
		return carMapper.selectCarAll();
	}

	/**
	 * 车辆查询(单个车辆)
	 */
	public Car selectCarOneById(Integer carId) {
		return carMapper.selectCarOneById(carId);
	}

	/**
	 * 车辆查询(单个车辆)
	 */
	public Car selectCarOneByPlate(String carPlate) {
		return carMapper.selectCarOneByPlate(carPlate);
	}

	/**
	 * 车辆查询(条件查询)
	 */
	public List<Car> selectCarChoose(Car c) {
		return carMapper.selectCarChoose(c);
	}

	/**
	 * 车辆查询(模糊查询)
	 */
	public List<Car> selectCarLike(Car c) {
		return carMapper.selectCarLike(c);
	}

}
