package com.boot.AirlineManagement.repository;

import java.util.List;

import com.boot.hibernate.entity.Users;

public interface IUserDao {

	public void add(Users user);
	public Users get(String username);
	public List<Users> getAll();
}
