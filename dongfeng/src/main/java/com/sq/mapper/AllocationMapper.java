package com.sq.mapper;

import java.util.List;

import com.sq.pojo.Allocation;
import com.sq.pojo.OrderQueryVo;

public interface AllocationMapper {
	/**
	 * 根据地点查询仓库内的订单
	 */
	List<Allocation> selectAllocationByWrehouseId(OrderQueryVo vo);
	
	/**
	 * 查询符合条件的仓库内的订单数
	 */
	Integer selectAllocationCountByWrehouseId(OrderQueryVo vo);
	
	
}
