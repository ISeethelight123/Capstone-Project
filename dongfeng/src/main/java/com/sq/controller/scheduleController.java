package com.sq.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sq.common.utils.Page;
import com.sq.pojo.Car;
import com.sq.pojo.CarQueryVo;
import com.sq.pojo.China;
import com.sq.pojo.Controls;
import com.sq.pojo.ControlsQueryVo;
import com.sq.pojo.Driver;
import com.sq.pojo.DriverQueryVo;
import com.sq.pojo.Waybil;
import com.sq.pojo.WaybilQueryVo;
import com.sq.pojo.Wrehouse;
import com.sq.service.AllocationService;
import com.sq.service.CarService;
import com.sq.service.ChinaService;
import com.sq.service.ControlsService;
import com.sq.service.DriverService;
import com.sq.service.OrdersService;
import com.sq.service.WaybilService;
import com.sq.service.WrehouseService;

@Controller
@RequestMapping("Schedule")
public class scheduleController {

	@Resource(name="wrehouseServicesq")
	WrehouseService wrehouseService;
	@Resource(name="chinaServicesq")
	ChinaService chinaService;
	@Resource(name="allocationServicesq")
	AllocationService allocationService;
	@Resource(name="ordersServicesq")
	OrdersService ordersService;
	@Autowired
	WaybilService waybilService;
	@Autowired
	CarService carService;
	@Autowired
	DriverService driverService;
	@Autowired
	ControlsService controlsService;
	
	
	@RequestMapping("createSchedule/createSchedule")
	public String showCreateSchedule(Model model) {
		//生成出发仓库列表
		List<Wrehouse> wrehouseList = wrehouseService.selectWrehouse();
		//生成目的地列表
		List<China> chinaList = chinaService.selectprovincebyid();
		//生成闲置车辆列表
		CarQueryVo carVo = new CarQueryVo();
		carVo.setCarStatus("1");
		List<Car> carList = carService.selectCarByQueryVo(carVo);
		//生成闲置司机列表
		DriverQueryVo driverVo = new DriverQueryVo();
		driverVo.setDriverStatus("1");
		List<Driver> driverList = driverService.selectDriverByQueryVo(driverVo);
		
		model.addAttribute("wrehouseList", wrehouseList);
		model.addAttribute("chinaList", chinaList);
		model.addAttribute("carList", carList);
		model.addAttribute("driverList", driverList);
		
		return "createSchedule";
	}
	/**
	 * 查询车辆
	 */
	@RequestMapping("createSchedule/enquiryCar")
	@ResponseBody
	public List<Car> enquiryCar(Integer carId) {
		System.out.println("查询车辆");
		CarQueryVo carVo = new CarQueryVo();
		carVo.setCarId(carId);
		carVo.setCarStatus("1");//闲置车辆
		Page<Car> carPage = carService.selectCarLikeByQueryVo(carVo);
		return carPage.getRows();
	}
	/**
	 * 查询司机
	 */
	@RequestMapping("createSchedule/enquiryDriver")
	@ResponseBody
	public List<Driver> enquiryDriver(Integer driverId) {
		System.out.println("查询车辆");
		DriverQueryVo carVo = new DriverQueryVo();
		carVo.setDriverId(driverId);
		carVo.setDriverStatus("1");//闲置车辆
		Page<Driver> driverPage = driverService.selectDriverLikeByQueryVo(carVo);
		return driverPage.getRows();
	}
	
	/**
	 * 生成运单号
	 */
	@RequestMapping("createSchedule/createWaybilLists")
	@ResponseBody
	public List<Waybil> createWaybilLists(WaybilQueryVo waybilQueryVo) {
		System.out.println("Java==createWaybilLists");
		System.out.println("StartPoint="+waybilQueryVo.getStartPoint());
		System.out.println("EndPoint=="+waybilQueryVo.getEndPoint());
		List<Waybil> waybilList = waybilService.selectWaybilByMany(waybilQueryVo);
		return waybilList;
	}
	/**
	 * 查看运单详情
	 */
	@RequestMapping("createSchedule/waybilEnquiry")
	@ResponseBody
	public List<Waybil> waybilEnquiry(WaybilQueryVo waybilQueryVo) {
		System.out.println("Java==waybilEnquiry");
		System.out.println("StartPoint="+waybilQueryVo.getStartPoint());
		System.out.println("EndPoint=="+waybilQueryVo.getEndPoint());
		System.out.println("waybilId=="+waybilQueryVo.getWaybilId());
		Page<Waybil> waybilPage = waybilService.selectWaybilByWaybilId(waybilQueryVo);
		return waybilPage.getRows();
	}
	/**
	 * 回显调度单
	 */
	@RequestMapping("createSchedule/editSchedule")
	@ResponseBody
	public Controls scheduleEdit(ControlsQueryVo vo) {
		System.out.println("进入Java =scheduleEdit");
		System.out.println("Carid--"+vo.getControlCarid());
		System.out.println("Driverid--"+vo.getControlDriverid());
		System.out.println("Lineid--"+vo.getControlLineid());
		System.out.println("Waybilid--"+vo.getControlWaybilid());
		System.out.println("WrehouseId--"+vo.getControlWrehouseId());
		System.out.println("Starttime--"+vo.getControlStarttime());
		System.out.println("Endtime--"+vo.getControlEndtime());
		System.out.println("Destination--"+vo.getControlDestination());
		
		Integer controlId = controlsService.selectMaxControlsId();
		if(controlId == null) {
			controlId = 0;
		}
		//车辆牌照
		Integer carid = vo.getControlCarid();
		Car car = carService.selectCarOneById(carid);
		//司机名字
		Integer driverid = vo.getControlDriverid();
		Driver driver = driverService.selectDriverOneById(driverid);
		//仓库名字
		Integer wrehouseId = vo.getControlWrehouseId();
		Wrehouse wrehouse = wrehouseService.selectWrehouseById(wrehouseId);
		//向Controls对象中存值
		Controls c = new Controls();
		//存调度单编号
		c.setControlId(controlId+1);
		System.out.println("controlId"+c.getControlId());
		c.setCar(car);
		c.setDriver(driver);
		c.setWrehouse(wrehouse);
		c.setControlCarid(vo.getControlCarid());
		c.setControlLineid(vo.getControlLineid());
		c.setControlDriverid(vo.getControlDriverid());
		c.setControlDestination(vo.getControlDestination());
		c.setControlStarttime(vo.getControlStarttime());
		c.setControlEndtime(vo.getControlEndtime());
		c.setControlWrehouseId(vo.getControlWrehouseId());
		c.setControlWaybilid(vo.getControlWaybilid());
		return c;
	}
	
	@RequestMapping("createSchedule/saveSchedule")
	@ResponseBody
	public String scheduleSave(ControlsQueryVo vo) {
		System.out.println("进入Java =scheduleSave");
		Integer controlId = controlsService.selectMaxControlsId();
		if(controlId == null) {
			controlId = 0;
		}
		//车辆牌照
		Integer carid = vo.getControlCarid();
		//司机名字
		Integer driverid = vo.getControlDriverid();
		//仓库名字
		Integer wrehouseId = vo.getControlWrehouseId();
		//向Controls对象中存值
		Controls c = new Controls();
		//存调度单编号
		c.setControlId(controlId+1);
		c.setControlCarid(vo.getControlCarid());
		c.setControlDriverid(vo.getControlDriverid());
		c.setControlDestination(vo.getControlDestination());
		c.setControlLineid(vo.getControlLineid());
		c.setControlStarttime(vo.getControlStarttime());
		c.setControlEndtime(vo.getControlEndtime());
		c.setControlWrehouseId(vo.getControlWrehouseId());
		c.setControlWaybilid(vo.getControlWaybilid());
		//保存进数据库
		Integer addControls = controlsService.addControls(c);
		System.out.println(addControls);
		if (addControls == 1) {
			//修改司机,车辆状态
			Car car = new Car();
			car.setCarId(carid);
			car.setCarStatus("0");
			carService.updateCar(car);
			Driver driver = new Driver();
			driver.setDriverId(driverid);
			driver.setDriverStatus("0");
			driverService.updateDriver(driver);
			return "OK";
		}else {
			return "NO";
		}
	}
	@RequestMapping("manageSchedule/manageSchedule")
	public String showControlerInfo(ControlsQueryVo vo,Model model) {
		//分页对象
		Page<Controls> page = controlsService.selectControlsAllByControlsQueryVo(vo);
		//生成出发仓库列表
		List<Wrehouse> wrehouseList = wrehouseService.selectWrehouse();
		//生成目的地列表
		List<China> chinaList = chinaService.selectprovincebyid();
		//生成闲置车辆列表
		CarQueryVo carVo = new CarQueryVo();
		List<Car> carList = carService.selectCarByQueryVo(carVo);
		//生成闲置司机列表
		DriverQueryVo driverVo = new DriverQueryVo();
		List<Driver> driverList = driverService.selectDriverByQueryVo(driverVo);
		
		//分页对象
		model.addAttribute("page", page);
		//下拉列表
		model.addAttribute("wrehouseList", wrehouseList);
		model.addAttribute("chinaList", chinaList);
		model.addAttribute("carList", carList);
		model.addAttribute("driverList", driverList);
		//回显
		model.addAttribute("controlId", vo.getControlId());
		model.addAttribute("controlWrehouseId", vo.getControlWrehouseId());
		model.addAttribute("controlCarid", vo.getControlCarid());
		model.addAttribute("controlDestination", vo.getControlDestination());
		model.addAttribute("controlDriverid", vo.getControlDriverid());
		model.addAttribute("controlLineid", vo.getControlLineid());
		return "controlerInfo";
	}
	
	@RequestMapping("manageSchedule/editSchedule")
	@ResponseBody
	public Controls editSchedule(Integer controlId) {
		Controls controls = controlsService.selectControlsOneByControlsId(controlId);
		return controls;
	}
	
	
	
	
	
	
	
	
}
