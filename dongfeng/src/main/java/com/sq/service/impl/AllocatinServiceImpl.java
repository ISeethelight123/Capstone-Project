package com.sq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sq.common.utils.Page;
import com.sq.mapper.AllocationMapper;
import com.sq.pojo.Allocation;
import com.sq.pojo.Car;
import com.sq.pojo.OrderQueryVo;
import com.sq.service.AllocationService;
@Service
public class AllocatinServiceImpl implements AllocationService {

	@Autowired
	AllocationMapper allocationMapper;
	
	/**
	 * 查询分页对象
	 */
	public Page<Allocation> selectAllocationByWrehouseId(OrderQueryVo vo) {
		Page<Allocation> page = new Page<Allocation>();
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
			//判断仓库地址
			if (vo.getWrehouseName() != null && !"".equals(vo.getWrehouseName().trim())) {
				vo.setWrehouseName(vo.getWrehouseName().trim());
			}
			//判断目的地
			if (vo.getRecipientsProvince() != null && !"".equals(vo.getRecipientsProvince().trim())) {
				vo.setRecipientsProvince(vo.getRecipientsProvince());
			}
			//判断时间
			if (vo.getOrderTime() != null) {
				vo.setOrderTime(vo.getOrderTime());
			}
			
		}else {
			System.out.println("vo=null");
		}
		//设置总条数
		Integer allocationCount = allocationMapper.selectAllocationCountByWrehouseId(vo);
		System.out.println("carCount---"+allocationCount);
		page.setTotal(allocationCount);
		
		//设置查询后的记录
		List<Allocation> allocationList = allocationMapper.selectAllocationByWrehouseId(vo);
		page.setRows(allocationList);
		return page;
	}

	/**
	 * 查询符合条件的仓库内的订单数
	 */
	public Integer selectAllocationCountByWrehouseId(OrderQueryVo vo) {
		return allocationMapper.selectAllocationCountByWrehouseId(vo);
	}

}
