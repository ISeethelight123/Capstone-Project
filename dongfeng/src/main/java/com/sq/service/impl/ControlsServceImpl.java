package com.sq.service.impl;

import java.util.List;

import com.sq.mapper.ControlsMapper;
import com.sq.pojo.Controls;
import com.sq.service.ControlsService;

public class ControlsServceImpl implements ControlsService {
	
	
	ControlsMapper controlsMapper;

	/**
	 * 运单增加
	 */
	public void addControls(Controls con) {
		controlsMapper.addControls(con);
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
	 * 运单查询(全部运单)
	 */
	public List<Controls> selectControlsAll() {
		return controlsMapper.selectControlsAll();
	}

	/**
	 * 运单查询(单个运单)
	 */
	public Controls selectControlsOneByControlsId(Integer ControlsId) {
		return controlsMapper.selectControlsOneByControlsId(ControlsId);
	}

	/**
	 * 运单查询(条件运单)
	 */
	public List<Controls> selectControlsChoose(Controls con) {
		return controlsMapper.selectControlsChoose(con);
	}

}
