package com.boot.AirlineManagement.repository;

import java.util.List;

import com.boot.hibernate.entity.Admins;

public interface IAdminDAO {
	public void addAdmin(Admins admin);
	public Admins getAdmin(String adminname);
	public List<Admins> getAllAdmins();

}
