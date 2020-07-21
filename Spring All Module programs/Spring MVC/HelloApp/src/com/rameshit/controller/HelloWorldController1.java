package com.rameshit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController1 {
	
	@RequestMapping(value = "/hello.htm")
	public ModelAndView displayMessage() {
		System.out.println("displayMessage called..");
		ModelAndView modelAndView = new ModelAndView("Hello");
		modelAndView.addObject("msg", "hello good morning..");
		return modelAndView;
	}
}
