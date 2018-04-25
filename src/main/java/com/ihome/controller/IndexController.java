package com.ihome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	/**
	 * Go Index
	 * @return
	 */
	@RequestMapping(value={"", "/", "index"})
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	/**
	 * unauthor
	 * @return
	 */
	@RequestMapping("unauthor")
	public ModelAndView unauthor() {
		return new ModelAndView("unauthor");
	}
	
	/**
	 * reports
	 * @return
	 */
	@RequestMapping("reports")
	public ModelAndView reports() {
		return new ModelAndView("reports");
	}
}
