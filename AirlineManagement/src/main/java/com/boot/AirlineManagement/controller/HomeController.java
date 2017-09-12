package com.boot.AirlineManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.AirlineManagement.service.IUserService;

@RestController
public class HomeController {
	 
	@Autowired
	IUserService userService;
	 
	@RequestMapping("/")
	protected String home() {
		String txt = "Airline Springboot App:<br/>jaya is a valid user:" + userService.verify("jaya", "pass");
		
		return txt;
	}
}
