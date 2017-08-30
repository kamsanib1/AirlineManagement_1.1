package com.boot.AirlineManagement.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.AirlineManagement.repository.IUserDao;
import com.boot.hibernate.entity.Users;

@Transactional
@Repository
public class UserService implements IUserService {

	@Autowired
	IUserDao userDao;
	
	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	@Override
	public boolean verifyUser(String username, String password) {
		// TODO Auto-generated method stub
		Users user = userDao.getUser(username);
		if(user == null || user.getPassword()!=password)
		return false;
		
		return true;
	}

	@Override
	public Users getUser(String username) {
		// TODO Auto-generated method stub
		Users user = userDao.getUser(username);
		return user;
	}

}
