package com.qyqjava.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qyqjava.pojo.Relation;
import com.qyqjava.pojo.Wrehouse;
import com.qyqjava.service.WrehouseService_qyq;

/**
 * 主要提供对仓库请求的处理
 * 
 * @author Sakure
 *
 */
@Controller
@RequestMapping("/Wrehouse")
public class WrehouseController_qyq {
	@Autowired
	private WrehouseService_qyq wrehouseService;

	/**
	 * 根据条件查询信息：1，根据仓库代号查询；2，根据仓库地址查询
	 */
	@RequestMapping("/showByRequie")
	public String showByRequie(String num, String requir, Model model) {
		List<Map<String, Object>> list = wrehouseService.showByRequie(num, requir);
		System.out.println(list);
		model.addAttribute("list", list);
		return "WrehouseInfo";
	}

	/**
	 * 修改仓库信息：判断仓库内是否有货物（在表allocation
	 * 中，查询allocation_type是否有为1，有则无法修改，只有空仓库才能修改和删除相应信息
	 */

	/**
	 * 删除仓库信息:仓库内如果还有货物则无法删除
	 */
	@RequestMapping("/deleteWrehouse")
	@ResponseBody
	public int deleteWrehouse(String id) {
		System.out.println(id);
		int i = wrehouseService.deleteWrehouse(id);
		System.out.println("delete" + i);
		return i;
	}

	/**
	 * 增加仓库：在表 wrehouse 中添加字段
	 * `Wrehouse_Address`（仓库编号）`Wrehouse_Name`（仓库地址）`Wrehouse_Phone``（仓库电话） 在表
	 * relation
	 * 中添加字段`wrehouse_ID`（仓库代号）`roadway`（巷道数）`shelf`（货架数）`allocationNum`（货位数）
	 * 在表allocation中添加信息 用存储过程 PLinset
	 */
	@RequestMapping("addWrehosueInfo")
	@ResponseBody
	public int addWrehosueInfo(Wrehouse wrehouse, Relation relation) {
		// 在添加allocation是需要走存储过程，参数分别为 wreid和totel

		return wrehouseService.addWrehouseInfo(wrehouse, relation);
	}

}
