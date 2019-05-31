package com.sq.service;

import java.util.List;

import com.sq.common.utils.Page;
import com.sq.pojo.Allocation;
import com.sq.pojo.OrderQueryVo;

public interface AllocationService {
	/**
	 * 查询分页对象
	 */
	Page<Allocation> selectAllocationByWrehouseId(OrderQueryVo vo);
	
	/**
	 * 查询符合条件的仓库内的订单数
	 */
	Integer selectAllocationCountByWrehouseId(OrderQueryVo vo);
	
	
}
