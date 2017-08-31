package com.boot.AirlineManagement.repository;

import java.util.List;

import com.boot.hibernate.entity.Users;

public interface IUserDao {

	public void addUser(Users user);
	public Users getUser(String username);
	public List<Users> getAllUsers();
}
