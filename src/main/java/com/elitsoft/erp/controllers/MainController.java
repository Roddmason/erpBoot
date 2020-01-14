package com.elitsoft.erp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView index(Model model) {
		model.addAttribute("inicio", "Rodrigo Mason");
		return new ModelAndView("index");
	}
}