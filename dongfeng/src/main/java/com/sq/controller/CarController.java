package com.sq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sq.common.utils.Page;
import com.sq.pojo.Car;
import com.sq.pojo.CarLoad;
import com.sq.pojo.CarQueryVo;
import com.sq.pojo.CarType;
import com.sq.service.CarLoadService;
import com.sq.service.CarService;
import com.sq.service.CarTypeService;

@Controller
@RequestMapping("/car")
public class CarController {

	@Autowired
	CarLoadService carloadService;
	@Autowired
	CarTypeService cartypeService;
	@Autowired
	CarService carService;
	
	
	@RequestMapping("/CarInfo")
	public String showCarInfo(Model model,CarQueryVo vo) {
		List<CarLoad> listLoads = carloadService.selecLoadtAll();
		List<CarType> listType = cartypeService.selectTypeAll();
		Page<Car> page = carService.selectCarLikeByQueryVo(vo);
		model.addAttribute("listLoads", listLoads);
		model.addAttribute("listType", listType);
		model.addAttribute("page", page);
		
		model.addAttribute("carPlate", vo.getCarPlate());
		model.addAttribute("carStatus", vo.getCarStatus());
		model.addAttribute("carType", vo.getCarType());
		model.addAttribute("carWeight", vo.getCarWeight());
		return "CarInfo";
	}
	
	@RequestMapping("/deleteCarById")
	@ResponseBody
	public String deleteCarById(Integer carId) {
		carService.deleteCarById(carId);
		return "OK";
	}
	
	@RequestMapping("/editCarById")
	@ResponseBody
	public Car editCarById(Integer carId) {
		Car c = carService.selectCarOneById(carId);
		return c;
	}
	
	@RequestMapping("/updateCarById")
	@ResponseBody
	public String updateCarById(Car c) {
		carService.updateCar(c);
		return "OK";
	}
	
	
	@RequestMapping("/insertCarById")
	@ResponseBody
	public String insertCarById(Car c) {
		carService.addCar(c);
		return "OK";
	}
	
}
