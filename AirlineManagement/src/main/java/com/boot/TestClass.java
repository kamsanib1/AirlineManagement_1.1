package com.boot;

import org.springframework.beans.factory.annotation.Autowired;

import com.boot.AirlineManagement.service.IUserService;

public class TestClass {
    @Autowired
    IUserService userService;
    

    public TestClass() {
    	boolean res = userService.verify("jaya", "pass");
    	
    	System.out.println("jaya is user:"+res);
    }
}
