package com.elitsoft.erp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/loginValidated",  method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView validationLogin(Model model, @RequestParam("email") String email, @RequestParam("password") String password, @RequestParam(defaultValue="off", value="checkbox", required=false) String checkbox) {
		model.addAttribute("inicioSesion", "OK");
		model.addAttribute("checkbox", checkbox);
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		return new ModelAndView("main");
	}
}
