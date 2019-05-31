package com.sq.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.fabric.xmlrpc.base.Array;
import com.sq.common.utils.Page;
import com.sq.pojo.Allocation;
import com.sq.pojo.China;
import com.sq.pojo.Driver;
import com.sq.pojo.DriverQueryVo;
import com.sq.pojo.OrderQueryVo;
import com.sq.pojo.Orders;
import com.sq.pojo.Waybil;
import com.sq.pojo.Wrehouse;
import com.sq.service.AllocationService;
import com.sq.service.ChinaService;
import com.sq.service.DriverService;
import com.sq.service.OrdersService;
import com.sq.service.WaybilService;
import com.sq.service.WrehouseService;

@Controller
@RequestMapping("/waybil")
public class WaybilController {

	@Autowired
	WrehouseService wrehouseService;
	@Autowired
	ChinaService chinaService;
	@Autowired
	AllocationService allocationService;
	@Autowired
	OrdersService ordersService;
	@Autowired
	WaybilService waybilService;

	@RequestMapping("/waybil")
	public String showDriverInfo(Model model, OrderQueryVo vo) {

		Page<Allocation> page = allocationService.selectAllocationByWrehouseId(vo);
		List<Wrehouse> wrehouseList = wrehouseService.selectWrehouse();
		List<China> chinaList = chinaService.selectprovincebyid();
		model.addAttribute("page", page);
		model.addAttribute("wrehouseList", wrehouseList);
		model.addAttribute("chinaList", chinaList);

		model.addAttribute("wrehouseName", vo.getWrehouseName());
		model.addAttribute("recipientsProvince", vo.getRecipientsProvince());
		model.addAttribute("orderTime", vo.getOrderTime());

		return "waybil";
	}

	@RequestMapping("/editWaybil")
	@ResponseBody
	public List<Orders> editWaybil(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		String[] id;
		System.out.println("进入editWaybil");
		if (null != cookies) {
			for (Cookie cookie : cookies) {
				if ("ArticleId".equals(cookie.getName())) {
					System.out.println(cookie.getValue());
					id = cookie.getValue().split("\\|");
					System.out.println(Arrays.toString(id));
					// 用StringBuffer来存放数组中的非空元素，用“;”分隔
					StringBuffer sb = new StringBuffer();
					for (int i = 0; i < id.length; i++) {
						if ("".equals(id[i])) {
							continue;
						}
						sb.append(id[i]);
						if (i != id.length - 1) {
							sb.append(";");
						}
					}
					// 用String的split方法分割，得到数组
					id = sb.toString().split(";");
					System.out.println(Arrays.toString(id));
					List<Orders> ordersList = ordersService.selectOrdersById(id);
					return ordersList;
				} else {
					System.out.println("cookie ArticleId为空");
				}
			}
		} else {
			System.out.println("cookie为空");
		}
		return null;
	}

	@RequestMapping("/createWaybilId")
	@ResponseBody
	public Integer createWaybilId() {
		Integer selectMinWaybilId = waybilService.selectMaxWaybilId();
		if (selectMinWaybilId == null) {
			selectMinWaybilId = 0;
		}
		System.out.println(selectMinWaybilId);
		return selectMinWaybilId;
	}

	@RequestMapping("/saveWaybil")
	@ResponseBody
	public String saveWaybil(HttpServletRequest request,HttpServletResponse response) {
		Cookie[] cookies = request.getCookies();
		String[] id;
		System.out.println("进入saveWaybil");
		if (null != cookies) {
			for (Cookie cookie : cookies) {
				if ("ArticleId".equals(cookie.getName())) {
					System.out.println(cookie.getValue());
					id = cookie.getValue().split("\\|");
					System.out.println(Arrays.toString(id));
					// 用StringBuffer来存放数组中的非空元素，用“;”分隔
					StringBuffer sb = new StringBuffer();
					for (int i = 0; i < id.length; i++) {
						if ("".equals(id[i])) {
							continue;
						}
						sb.append(id[i]);
						if (i != id.length - 1) {
							sb.append(";");
						}
					}
					// 用String的split方法分割，得到数组
					id = sb.toString().split(";");
					System.out.println("id--"+Arrays.toString(id));
					Integer waybilId = createWaybilId()+1;
					System.out.println("waybilId--"+waybilId);
					List<Waybil> waybilList = new ArrayList<Waybil>();
					for (String strId : id) {
						Waybil waybil = new Waybil();
						waybil.setWaybilId(waybilId);
						waybil.setWaybilOrderid(Integer.parseInt(strId));
						waybilList.add(waybil);
					}
					waybilService.addWaybilMass(waybilList);
					Cookie newcookie = new Cookie("ArticleId",null);//cookie名字要相同
					newcookie.setPath(request.getContextPath());  // 相同路径
					response.addCookie(newcookie);
					return "OK";
				} else {
					System.out.println("cookie ArticleId为空");
				}
			}
		} else {
			System.out.println("cookie为空");
		}

		return null;
	}

}
