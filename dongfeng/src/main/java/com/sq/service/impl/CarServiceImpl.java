package com.sq.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sq.common.utils.Page;
import com.sq.mapper.CarMapper;
import com.sq.pojo.Car;
import com.sq.pojo.CarQueryVo;
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
	 * 车辆查询(查询全部车辆的数量)
	 */
	public int selectCarCountByQueryVo(CarQueryVo vo) {
		return carMapper.selectCarCountByQueryVo(vo);
	}

	/**
	 * 车辆查询(模糊查询)
	 */
	public Page<Car> selectCarLikeByQueryVo(CarQueryVo vo) {
		
		Page<Car> page = new Page<Car>();
		
		if (vo != null) {
			//对QueryVo对象的数据进行处理
			//防止出现因为vo=null而导致的报错,我们把涉及vo.的操作全部移到判断里面
			//因为QueryVo对象size page 赋有默认值
			//设置页大小
			page.setSize(vo.getSize());
			//设置当前页
			page.setPage(vo.getPage());
			//设置起始行
			vo.setStartRow((vo.getPage()-1)*vo.getSize());
			//判断车牌
			if (vo.getCarPlate() != null && !"".equals(vo.getCarPlate().trim())) {
				vo.setCarPlate(vo.getCarPlate().trim());
			}
			//判断车载重
			if (vo.getCarWeight() != null) {
				vo.setCarWeight(vo.getCarWeight());
			}
			//判断车型
			if (vo.getCarType() != null) {
				vo.setCarType(vo.getCarType());
			}
			//判断车状态
			if (vo.getCarStatus() != null) {
				vo.setCarStatus(vo.getCarStatus());
			}
		}else {
			System.out.println("vo=null");
		}
		//设置总条数
		Integer carCount = carMapper.selectCarCountByQueryVo(vo);
		System.out.println("carCount---"+carCount);
		page.setTotal(carCount);
		
		//设置查询后的记录
		List<Car> carList = carMapper.selectCarLikeByQueryVo(vo);
		page.setRows(carList);
		return page;
	}

}
