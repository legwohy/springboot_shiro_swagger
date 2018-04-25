package com.ihome.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

	/**
	 * Go login.jsp
	 * @return
	 */
	@RequestMapping(value="login", method=RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	/**
	 * Go login
	 * @param request
	 * @return
	 */
	@RequestMapping(value="login", method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		System.out.println("后台：account="+account+"\tpwd="+password);

		UsernamePasswordToken upt = new UsernamePasswordToken(account, password);

		Subject subject = SecurityUtils.getSubject();
		try {

			// 登陆
			subject.login(upt);
			mv.setViewName("index");// 主页

			// 权限
			subject.checkPermissions("update");// 没有权限会报错


		} catch (Exception e) {
			System.out.println("登陆异常:"+e);
			mv.addObject("errorText","您的账号或密码输入错误!");

			mv.setViewName("login");// 登陆页面

		}
		return mv;
	}
	
	/**
	 * 退出
	 * @return
	 */
	@RequestMapping("logout")
	public ModelAndView logout() {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return new ModelAndView("login");
	}
}
