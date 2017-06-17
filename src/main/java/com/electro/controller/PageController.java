package com.electro.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageController {
	
	@RequestMapping("index")
	public ModelAndView getIndex(HttpServletRequest req, HttpServletResponse resp){
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}
	
}
