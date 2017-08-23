package com.boot.AirlineManagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	protected String home() {
		return "Airline Springboot App";
	}
}
