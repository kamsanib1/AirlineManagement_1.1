package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
