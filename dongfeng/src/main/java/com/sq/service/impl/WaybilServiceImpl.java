package com.sq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sq.mapper.WaybilMapper;
import com.sq.pojo.Waybil;
import com.sq.service.WaybilService;
@Service
public class WaybilServiceImpl implements WaybilService {

	@Autowired
	WaybilMapper watbilMapper;
	
	
	public void addWaybil(Waybil waybil) {
		watbilMapper.addWaybil(waybil);
	}

	public void deleteWaybilByWaybilId(Integer waybilId) {
		watbilMapper.deleteWaybilByWaybilId(waybilId);
	}

	public void deleteWaybilByWaybilOid(Integer waybilOid) {
		watbilMapper.deleteWaybilByWaybilOid(waybilOid);
	}

	public void deleteWaybilMassById(int[] arrId) {
		watbilMapper.deleteWaybilMassById(arrId);
	}

	public void updateWaybil(Waybil waybil) {
		watbilMapper.updateWaybil(waybil);
	}

	public List<Waybil> selectWaybilAll() {
		return watbilMapper.selectWaybilAll();
	}

	public List<Waybil> selectWaybilOneById(Integer waybilId) {
		return watbilMapper.selectWaybilOneById(waybilId);
	}

	public List<Waybil> selectWaybilChoose(Waybil waybil) {
		return watbilMapper.selectWaybilChoose(waybil);
	}

}
