package com.sq.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sq.common.utils.Page;
import com.sq.pojo.Car;
import com.sq.pojo.CarQueryVo;

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
	 * 车辆查询(单个车辆)
	 */
	Car selectCarOneById(Integer carId);
	/**
	 * 车辆查询(单个车辆)
	 */
	Car selectCarOneByPlate(String carPlate);
	/**
	 * 车辆查询(全部车辆)的记录数
	 */
	int selectCarCountByQueryVo(CarQueryVo vo);
	
	/**
	 * 分页车辆查询(模糊查询)
	 */
	Page<Car> selectCarLikeByQueryVo(CarQueryVo vo);
	
	/**
	 * 获得列表
	 */
	List<Car> selectCarByQueryVo(CarQueryVo vo);
	
	
	
}
