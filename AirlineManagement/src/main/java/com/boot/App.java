package com.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.boot.AirlineManagement.service.IUserService;
import com.boot.hibernate.bussiness.UserManager;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
		//UserManager userMgr = new UserManager();
		//System.out.println("login"+userMgr.verifyUser("kalyan", "pass"));

        //new TestClass();
        System.out.println("---------------------------LOG-----------------------------");
    }
}
