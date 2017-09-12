package com.boot.AirlineManagement.repository;

import java.util.List;

import com.boot.hibernate.entity.Admins;

public interface IAdminDAO {
	public void add(Admins admin);
	public Admins get(String adminname);
	public List<Admins> getAll();

}
