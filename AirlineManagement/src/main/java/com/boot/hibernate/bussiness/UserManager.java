package com.boot.hibernate.bussiness;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.boot.hibernate.entity.Users;

public class UserManager extends Manager{
	
	public void addUser(Users user){
		Session session = SessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();

	}
	
	public void addUser(String username, String password){
		Users user = new Users();
		user.setUsername(username);
		user.setPassword(password);
		addUser(user);
	}
	
	public boolean verifyUser(String username, String password){
		System.out.println("User manager:Before opening Session");
		Session session = SessionManager.getSessionFactory().openSession();
		System.out.println("User manager:After opening Session");
		session.beginTransaction();
		
		Query query = session.createQuery("from Users where username=? and password=?");
		query.setString(0, username)
			 .setString(1, password);
		List<Users> users = (List<Users>) query.list();
		
		session.close();

		
		return !users.isEmpty();
		

	}
	
	public List<Users> getUsersList(){
		Session session = SessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from Users");
		query.setMaxResults(maxCount);
		incrementIndex();
		List<Users> users = (List<Users>) query.list();
		
		
		session.close();
		
		return users;
		
	}
}
