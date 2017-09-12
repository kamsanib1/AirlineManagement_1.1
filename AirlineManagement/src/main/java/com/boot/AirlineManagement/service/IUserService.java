package com.boot.AirlineManagement.service;

import java.util.List;

import com.boot.hibernate.entity.Users;

public interface IUserService {

	public void add(Users user);
	public boolean verify(String username, String password);
	public Users get(String username);
	public List<Users> getAll();
}
