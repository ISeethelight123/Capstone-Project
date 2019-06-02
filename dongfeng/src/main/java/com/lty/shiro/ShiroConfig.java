package com.lty.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {
	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(
			@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		Map<String, String> filterMap = new LinkedHashMap<String, String>();

		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
		/*
		 * filterMap.put("/add", "authc"); filterMap.put("/update", "authc");
		 */
		/*
		 * filterMap.put("/testthy", "anon"); filterMap.put("/add",
		 * "perms[product:add]"); filterMap.put("/update", "perms[product:update]");
		 */
		shiroFilterFactoryBean.setLoginUrl("/tologin");

		filterMap.put("/tomanagero", "perms[m1:findone]");
		filterMap.put("/tomanagerto", "perms[m2:findtwo]");
		filterMap.put("/tomanagerth", "perms[m3:findthrea]");
		filterMap.put("/toselect", "perms[m4:findfour]");
		filterMap.put("/tojuese", "perms[admin:findall]");
		filterMap.put("/topower", "perms[admin:findall]");
		shiroFilterFactoryBean.setUnauthorizedUrl("unauth");
		/* filterMap.put("/**", "authc"); */
		/* filterMap.put("/**", "anon"); */
		System.out.println("shiro配置文件");
		return shiroFilterFactoryBean;

	}

	@Bean(name = "securityManager")
	public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm) {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(userRealm);
		return securityManager;

	}

	@Bean(name = "userRealm")
	public UserRealm getRealm() {
		System.out.println("........................................................................123456");
		return new UserRealm();

	}

}
