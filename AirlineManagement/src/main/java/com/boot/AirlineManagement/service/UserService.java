package com.boot.AirlineManagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.AirlineManagement.repository.IUserDao;
import com.boot.hibernate.entity.Users;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserDao userDao;
	
	@Override
	public void add(Users user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}

	@Override
	public boolean verify(String username, String password) {
		// TODO Auto-generated method stub
		Users user = userDao.get(username);
		if(user == null || user.getPassword()!=password)
		return false;
		
		return true;
	}

	@Override
	public Users get(String username) {
		// TODO Auto-generated method stub
		Users user = userDao.get(username);
		return user;
	}

	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		
		return userDao.getAll();
	}

}
