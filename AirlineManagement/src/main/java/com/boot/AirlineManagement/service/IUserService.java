package com.boot.AirlineManagement.service;

import com.boot.hibernate.entity.Users;

public interface IUserService {

	public void addUser(Users user);
	public boolean verifyUser(String username, String password);
	public Users getUser(String username);
}
