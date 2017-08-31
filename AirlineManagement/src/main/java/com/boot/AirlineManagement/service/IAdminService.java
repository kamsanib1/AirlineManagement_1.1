package com.boot.AirlineManagement.service;

import java.util.List;

import com.boot.hibernate.entity.Admins;

public interface IAdminService {
	public void addAdmin(Admins admin);
	public Admins getAdmin(String adminname);
	public List<Admins> getAllAdmins();

}
