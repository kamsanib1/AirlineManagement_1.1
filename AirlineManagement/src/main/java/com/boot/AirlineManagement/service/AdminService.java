package com.boot.AirlineManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.AirlineManagement.repository.IAdminDAO;
import com.boot.hibernate.entity.Admins;
import com.boot.hibernate.entity.Users;

@Service
public class AdminService implements IAdminService {

	@Autowired
	IAdminDAO adminDao;

	@Override
	public void addAdmin(Admins admin) {
		// TODO Auto-generated method stub
		adminDao.addAdmin(admin);
	}

	@Override
	public Admins getAdmin(String adminname) {
		// TODO Auto-generated method stub
		return adminDao.getAdmin(adminname);
	}

	@Override
	public List<Admins> getAllAdmins() {
		// TODO Auto-generated method stub
		return adminDao.getAllAdmins();
	}
	
}
