package com.boot.AirlineManagement.service;

import java.util.List;

import com.boot.hibernate.entity.Users;

public interface IUserService {

	public void addUser(Users user);
	public boolean verifyUser(String username, String password);
	public Users getUser(String username);
	public List<Users> getAllUsers();
}
