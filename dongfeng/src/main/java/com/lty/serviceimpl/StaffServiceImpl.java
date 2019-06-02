package com.lty.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lty.entity.Staff;
import com.lty.mapper.StaffMapper;
import com.lty.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService{
	@Autowired
	private StaffMapper staffMapper;
	//查所有
	public List<Staff> selectall() {
		// TODO Auto-generated method stub
		return staffMapper.selectall();
	}
	@Override
	public List<Staff> selecthalf(Staff staff) {
		// TODO Auto-generated method stub
		return staffMapper.selecthalf(staff);
	}
	

}
