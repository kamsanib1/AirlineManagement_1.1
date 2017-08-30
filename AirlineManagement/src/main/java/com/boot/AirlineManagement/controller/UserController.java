package com.boot.AirlineManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.AirlineManagement.service.IUserService;
import com.boot.hibernate.entity.Users;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired
	IUserService userService;
	
	@GetMapping("{name}")
	public ResponseEntity<Users> getUser(@PathVariable("name") String username) throws JsonProcessingException {
		Users res = null;
		ObjectMapper objMapper = new ObjectMapper();
		res = userService.getUser(username);
		if(res==null) return null;
		//String rest = objMapper.writeValueAsString(res);
		System.out.println("result for "+username+":"+res.getUsername());
		return new ResponseEntity<Users>(res,HttpStatus.OK);
	}
}
