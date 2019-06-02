package com.lty.service;

import java.util.List;

import com.lty.entity.Staff;

public interface StaffService {
	//查所有
	public List<Staff>selectall();
	//员工表二单条
	public List<Staff>selecthalf(Staff staff );
}
