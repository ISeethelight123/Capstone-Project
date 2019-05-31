package com.sq.mapper;

import java.util.List;

import com.sq.pojo.Driver;
import com.sq.pojo.DriverQueryVo;

public interface DriverMapper {

	/**
	 * 司机增加
	 */
	void addDriver(Driver d); 
	/**
	 * 司机删除
	 */
	void deleteDriverById(Integer driverId);
	
	/**
	 * 司机修改
	 */
	void updateDriver(Driver d);
	
	/**
	 * 司机查询(单个车辆)
	 */
	Driver selectDriverOneById(Integer DriverId);
	
	
	/**
	 * 司机查询(全部车辆)的记录数
	 */
	int selectDriverCountByQueryVo(DriverQueryVo vo);
	
	/**
	 * 分页司机查询(模糊查询)
	 */
	List<Driver> selectDriverLikeByQueryVo(DriverQueryVo vo);
	
	
}
