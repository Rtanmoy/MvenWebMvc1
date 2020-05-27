package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	@RequestMapping("/show")
	public ModelAndView showPage() {
	 ModelAndView m=new ModelAndView();
	m.setViewName("Home");
	return m;

}
}