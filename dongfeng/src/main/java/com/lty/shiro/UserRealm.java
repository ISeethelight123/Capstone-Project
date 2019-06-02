package com.lty.shiro;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.druid.util.StringUtils;
import com.lty.entity.User;
import com.lty.service.UserService;


public class UserRealm extends AuthorizingRealm{
	@Autowired
	private UserService userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
	System.out.println("授权中");
	SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
	
	Subject subject = SecurityUtils.getSubject();
	
	User dbuser = (User) subject.getPrincipal();
	List<String> perms = userService.findPermissionByUserId(dbuser.getId());
	
	if(perms!=null) {
		for (String  perm: perms) {
			if(!StringUtils.isEmpty(perm));
			info.addStringPermission(perm);
		}
	}
		return info;
	}
	

	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

	UsernamePasswordToken token1=(UsernamePasswordToken)token;
	System.out.println(token1);
	
	User user = userService.findByUsername(token1.getUsername());
	if(user==null) {
		System.out.println("认证");
		return null;
	}

	return new SimpleAuthenticationInfo(user,user.getPwd(),"");
	}

}
