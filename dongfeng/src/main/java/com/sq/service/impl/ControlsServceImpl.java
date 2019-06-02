package com.sq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sq.common.utils.Page;
import com.sq.mapper.ControlsMapper;
import com.sq.pojo.Car;
import com.sq.pojo.Controls;
import com.sq.pojo.ControlsQueryVo;
import com.sq.service.ControlsService;
@Service
public class ControlsServceImpl implements ControlsService {
	
	@Autowired
	ControlsMapper controlsMapper;

	/**
	 * 运单增加
	 */
	public Integer addControls(Controls con) {
		return controlsMapper.addControls(con);
	}

	/**
	 * 运单删除
	 */
	public void deleteControlsById(Integer ControlsId) {
		controlsMapper.deleteControlsById(ControlsId);
	}

	/**
	 * 运单批量删除
	 */
	public void deleteControlsMassById(int[] arrId) {
		controlsMapper.deleteControlsMassById(arrId);
	}

	/**
	 * 运单修改
	 */
	public void updateControls(Controls con) {
		controlsMapper.updateControls(con);
	}

	
	

	/**
	 * 运单查询(单个运单)
	 */
	public Controls selectControlsOneByControlsId(Integer ControlsId) {
		return controlsMapper.selectControlsOneByControlsId(ControlsId);
	}

	/**
	 * 运单查询(分页对象)
	 */
	public Page<Controls> selectControlsAllByControlsQueryVo(ControlsQueryVo vo) {
		Page<Controls> page = new Page<Controls>();
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
		}else {
			System.out.println("vo=null");
		}
		//设置总条数
		Integer controlsCount = controlsMapper.selectControlsCountByControlsQueryVo(vo);
		System.out.println("controlsCount---"+controlsCount);
		page.setTotal(controlsCount);
		
		//设置查询后的记录
		List<Controls> controlsList = controlsMapper.selectControlsAllByControlsQueryVo(vo);
		page.setRows(controlsList);
		return page;
	}

	/**
	 * 运单查询(条件运单)
	 */
	public List<Controls> selectControlsChoose(Controls con) {
		return controlsMapper.selectControlsChoose(con);
	}

	/**
	 * 查询调度单的id最大值
	 */
	public Integer selectMaxControlsId() {
		return controlsMapper.selectMaxControlsId();
	}

	/**
	 * 运单查询(符合条件的运单数量)
	 */
	public Integer selectControlsCountByControlsQueryVo(ControlsQueryVo vo) {
		return controlsMapper.selectControlsCountByControlsQueryVo(vo);
	}

}
