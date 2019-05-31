package com.sq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sq.common.utils.Page;
import com.sq.pojo.Car;
import com.sq.pojo.CarLoad;
import com.sq.pojo.CarQueryVo;
import com.sq.pojo.CarType;
import com.sq.pojo.Driver;
import com.sq.pojo.DriverQueryVo;
import com.sq.service.DriverService;

@Controller
@RequestMapping("/driver")
public class DriverController {

	@Autowired
	DriverService driverService;
	
	@RequestMapping("/DriverInfo")
	public String showDriverInfo(Model model,DriverQueryVo vo) {
		Page<Driver> page = driverService.selectDriverLikeByQueryVo(vo);
		model.addAttribute("page", page);
		
		model.addAttribute("driverId", vo.getDriverId());
		model.addAttribute("driverStatus", vo.getDriverStatus());
		model.addAttribute("driverName", vo.getDriverName());
		model.addAttribute("driverPhone", vo.getDriverPhone());
		return "DriverInfo";
	}
	
	@RequestMapping("/deleteDriverById")
	@ResponseBody
	public String deleteDriverById(Integer driverId) {
		driverService.deleteDriverById(driverId);
		return "OK";
	}
	
	@RequestMapping("/editDriverById")
	@ResponseBody
	public Driver editDriverById(Integer driverId) {
		return driverService.selectDriverOneById(driverId);
	}
	
	@RequestMapping("/updateDriverById")
	@ResponseBody
	public String updateDriverById(Driver d) {
		driverService.updateDriver(d);
		return "OK";
	}
	
	
	@RequestMapping("/insertDriverById")
	@ResponseBody
	public String insertDriverById(Driver d) {
		driverService.addDriver(d);
		return "OK";
	}
	
	
	
	
}
