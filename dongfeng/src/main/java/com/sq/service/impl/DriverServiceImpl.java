package com.sq.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sq.common.utils.Page;
import com.sq.mapper.DriverMapper;
import com.sq.pojo.Car;
import com.sq.pojo.Driver;
import com.sq.pojo.DriverQueryVo;
import com.sq.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {
	
	@Autowired
	DriverMapper driverMapper;

	/**
	 * 司机增加
	 */
	public void addDriver(Driver d) {
		driverMapper.addDriver(d);
	}

	/**
	 * 司机删除
	 */
	public void deleteDriverById(Integer driverId) {
		driverMapper.deleteDriverById(driverId);
	}

	/**
	 * 司机修改
	 */
	public void updateDriver(Driver d) {
		driverMapper.updateDriver(d);
	}

	/**
	 * 司机查询(单个车辆)
	 */
	public Driver selectDriverOneById(Integer DriverId) {
		return driverMapper.selectDriverOneById(DriverId);
	}

	/**
	 * 司机查询(全部车辆)的记录数
	 */
	public int selectDriverCountByQueryVo(DriverQueryVo vo) {
		return driverMapper.selectDriverCountByQueryVo(vo);
	}

	/**
	 * 分页司机查询(模糊查询)
	 */
	public Page<Driver> selectDriverLikeByQueryVo(DriverQueryVo vo) {
		Page<Driver> page = new Page<Driver>();
		
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
			//判断司机编号
			if (vo.getDriverId() != null) {
				vo.setDriverId(vo.getDriverId());
			}
			//判断司机名字
			if (vo.getDriverName() != null && "".equals(vo.getDriverName().trim())) {
				vo.setDriverName(vo.getDriverName().trim());
			}
			//判断司机电话
			if (vo.getDriverPhone() != null && "".equals(vo.getDriverPhone().trim())) {
				vo.setDriverPhone(vo.getDriverPhone().trim());
			}
			//判断司机状态
			if (vo.getDriverStatus() != null && "".equals(vo.getDriverStatus())) {
				vo.setDriverStatus(vo.getDriverStatus().trim());
			}
		}else {
			System.out.println("vo=null");
		}
		//设置总条数
		Integer driverCount = driverMapper.selectDriverCountByQueryVo(vo);
		System.out.println("driverCount---"+driverCount);
		page.setTotal(driverCount);
		
		//设置查询后的记录
		List<Driver> driverList = driverMapper.selectDriverLikeByQueryVo(vo);
		page.setRows(driverList);
		return page;
	}

	/**
	 * 获得司机列表
	 */
	public List<Driver> selectDriverByQueryVo(DriverQueryVo vo) {
		return driverMapper.selectDriverByQueryVo(vo);
	}

}
