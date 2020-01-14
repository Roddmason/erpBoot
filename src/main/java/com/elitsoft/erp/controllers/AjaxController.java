package com.elitsoft.erp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elitsoft.erp.model.LoginValidationModel;
import com.elitsoft.erp.services.LoginService;

@RestController
public class AjaxController {
	
	@Autowired
    private LoginService loginService;
	
	@RequestMapping(value="/loginValidations", method=RequestMethod.POST)
	public ResponseEntity<Object> loginValidations(@RequestBody LoginValidationModel loginValidationModel) {
		Long userCounter = loginService.loginCounter();
		return new ResponseEntity<>(userCounter, HttpStatus.OK);
	}
}