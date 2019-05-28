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
public class HelloWorld {

	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
	
	
	
}
