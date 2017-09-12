package com.boot.AirlineManagement.service;

import java.util.List;

import com.boot.hibernate.entity.Admins;

public interface IAdminService {
	public void add(Admins admin);
	public Admins get(String adminname);
	public List<Admins> getAll();

}
