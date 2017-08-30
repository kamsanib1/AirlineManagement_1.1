package com.boot.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.boot.hibernate.entity.*;
import com.boot.hibernate.bussiness.*;

public class HibernateMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManager userMgr = new UserManager();
		System.out.println("login"+userMgr.verifyUser("kalyan", "pass"));
	}

}
