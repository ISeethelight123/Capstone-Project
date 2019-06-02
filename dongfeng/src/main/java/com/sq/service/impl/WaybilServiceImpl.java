package com.sq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sq.common.utils.Page;
import com.sq.mapper.WaybilMapper;
import com.sq.pojo.Car;
import com.sq.pojo.Waybil;
import com.sq.pojo.WaybilQueryVo;
import com.sq.service.WaybilService;
@Service
public class WaybilServiceImpl implements WaybilService {

	@Autowired
	WaybilMapper waybilMapper;
	
	
	public void addWaybil(Waybil waybil) {
		waybilMapper.addWaybil(waybil);
	}

	public void deleteWaybilByWaybilId(Integer waybilId) {
		waybilMapper.deleteWaybilByWaybilId(waybilId);
	}

	public void deleteWaybilByWaybilOid(Integer waybilOid) {
		waybilMapper.deleteWaybilByWaybilOid(waybilOid);
	}

	public void deleteWaybilMassById(int[] arrId) {
		waybilMapper.deleteWaybilMassById(arrId);
	}

	public void updateWaybil(Waybil waybil) {
		waybilMapper.updateWaybil(waybil);
	}

	public List<Waybil> selectWaybilAll() {
		return waybilMapper.selectWaybilAll();
	}

	public List<Waybil> selectWaybilOneById(Integer waybilId) {
		return waybilMapper.selectWaybilOneById(waybilId);
	}

	public List<Waybil> selectWaybilChoose(Waybil waybil) {
		return waybilMapper.selectWaybilChoose(waybil);
	}

	
	public Integer selectMaxWaybilId() {
		return waybilMapper.selectMaxWaybilId();
	}

	
	public void addWaybilMass(List<Waybil> list) {
		waybilMapper.addWaybilMass(list);
	}

	
	public List<Waybil> selectWaybilByMany(WaybilQueryVo vo) {
		if (vo.getStartPoint() != null && vo.getStartPoint() != 0) {
			vo.setStartPoint(vo.getStartPoint());
		}
		if (vo.getEndPoint() != null && !"".equals(vo.getEndPoint().trim())) {
			vo.setEndPoint(vo.getEndPoint().trim());
		}
		System.out.println(vo.getEndPoint());
		return waybilMapper.selectWaybilByMany(vo);
	}

	
	public Page<Waybil> selectWaybilByWaybilId(WaybilQueryVo vo) {
		
		Page<Waybil> page = new Page<Waybil>();
		if (vo != null) {
			page.setSize(vo.getSize());
			//设置当前页
			page.setPage(vo.getPage());
			//设置起始行
			vo.setStartRow((vo.getPage()-1)*vo.getSize());
			//判断目的地
			if (vo.getEndPoint() != null && !"".equals(vo.getEndPoint().trim())) {
				vo.setEndPoint(vo.getEndPoint().trim());
			}
		}else {
			System.out.println("vo=null");
		}
		//设置总条数
		Integer orderCount = waybilMapper.selectCountByWaybilId(vo);
		System.out.println("orderCount---"+orderCount);
		page.setTotal(orderCount);
		
		//设置查询后的记录
		List<Waybil> waybilList = waybilMapper.selectWaybilByWaybilId(vo);
		page.setRows(waybilList);
		return page;
	}

	
	public Integer selectCountByWaybilId(WaybilQueryVo vo) {
		return waybilMapper.selectCountByWaybilId(vo);
	}

}
