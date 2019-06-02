package com.lty.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lty.entity.Staff;
import com.lty.entity.User;
import com.lty.service.StaffService;
import com.lty.service.UserService;
import com.lty.service.User_rolesService;
import com.lty.service.UserroleService;


@Controller
public class MainController {
	@Autowired
	private StaffService staffService;
	@Autowired
	private UserService userService;
	@Autowired
	private User_rolesService  user_rolesService;
	@Autowired 
	private UserroleService userroleService;
	// 查所有
	@RequestMapping("/toselect")
	public String toselect(Model model) {
		model.addAttribute("selectall", staffService.selectall());
		System.out.println(model.addAttribute("selectall", staffService.selectall()));
		return "showall";
	} // 员工表第二部分

	@RequestMapping("/toselecttwo")
	public String toselecttwo(Model model, Staff staff) {
		model.addAttribute("selecthalf", staffService.selecthalf(staff));
		System.out.println(model.addAttribute("selecthalf", staffService.selecthalf(staff)));
		return "selecttwo";

	}

	@RequestMapping("/tologin")
	public String login(String name, String password, HttpServletRequest request, Model model) {
		Subject subject = SecurityUtils.getSubject();
		AuthenticationToken token = new UsernamePasswordToken(name, password);

		System.out.println("打印TOKEN" + token);
		try {
			subject.login(token);
			System.out.println("登陆成功");
			return "main";
		} catch (UnknownAccountException e) {
			System.out.println("");
			model.addAttribute("msg", "账号有误");
			return "login";
		} catch (IncorrectCredentialsException e) {
			System.out.println(2);
			model.addAttribute("msg", "密码有误");
			return "login";
		}

	}
	@RequestMapping("/tomanagero")
	public String tomanagero() {
		return "managero";
			
	}

	
	@RequestMapping("/tomanagerto")
	public String tomanagerto() {
		return "managerto";
		
	}
	
	@RequestMapping("/tomanagerth")
	public String tomanagerth() {
		return "managerth";
		
	}
	
	
	
	@RequestMapping("/tojuese")
	public String toselecttwo(Model model) {
		model.addAttribute("selectjs",userService.findAll());
		return "juese";
	}
	
	@RequestMapping("/unauth")
	public String noAuth() {
		return "unauth";
		
	}
	
	@Transactional
	@RequestMapping("/todelete")
	public String todelete(Model model, int id) {
		model.addAttribute("todelete",userService.deleteJS(id));
		model.addAttribute("todelete2",user_rolesService.deletJSS(id));
		model.addAttribute("selectjs",userService.findAll());
		return "juese";
	}
	
	@RequestMapping("/toaddjs")
	public String toaddjs() {
		return "addjs";
	}
	
	@RequestMapping("/toaddjsjs")
	public String toaddjsjs(Model model,User user,String uname) {
		model.addAttribute("",userService.addJS(user));
		model.addAttribute("selectjs",userService.findAll());
		model.addAttribute("adjss",user_rolesService.addJSS(uname));
		return "juese";
		
	}
	
	@RequestMapping("/topower")
	public String topower(Model model) {
		model.addAttribute("powerMap",userService.findpower());
		return "power";
	}

	@RequestMapping("/toupdatepower")
	public String toupdatepower(int id,Model model) {
		model.addAttribute("uid",id);
		return "updatepower";
	}
	
	@RequestMapping("/ttoupdatepower")
	public String ttoupdatepower(int id,String selectid,Model model) {
		userroleService.addpowerNumber(id, Integer.parseInt(selectid));
		model.addAttribute("powerMap",userService.findpower());
		return "power";
	}
	
	@RequestMapping("/todeletepower")
	public String todeletepower(int id,Model model) {
		model.addAttribute("deletepower",userroleService.deletePower(id));
		model.addAttribute("powerMap",userService.findpower());
		return "power";
	}
}