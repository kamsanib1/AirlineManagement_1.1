package com.boot.AirlineManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.AirlineManagement.service.IUserService;
import com.boot.hibernate.entity.Users;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("api/user")
public class UserController {

	@Autowired
	IUserService userService;
	
	@GetMapping("{name}")
	public ResponseEntity<Users> getUser(@PathVariable("name") String username) throws JsonProcessingException {
		Users res = null;
		res = userService.get(username);
		if(res==null) return null;
		//System.out.println("result for "+username+":"+res.getUsername());
		return new ResponseEntity<Users>(res,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Users>> getAllUsers(){
		List<Users> users = userService.getAll();
		return new ResponseEntity<List<Users>>(users,HttpStatus.OK);
	}
	
	@PostMapping("")
	public ResponseEntity<Users> add(@RequestBody Users user) {
		userService.add(user);
		return new ResponseEntity<Users>(user,HttpStatus.OK);
	}
}
