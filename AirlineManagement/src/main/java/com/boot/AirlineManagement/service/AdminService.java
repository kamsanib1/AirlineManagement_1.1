package com.boot.AirlineManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.AirlineManagement.repository.IAdminDAO;
import com.boot.hibernate.entity.Admins;

@Service
public class AdminService implements IAdminService {

	@Autowired
	IAdminDAO adminDao;

	@Override
	public void add(Admins admin) {
		// TODO Auto-generated method stub
		adminDao.add(admin);
	}

	@Override
	public Admins get(String adminname) {
		// TODO Auto-generated method stub
		return adminDao.get(adminname);
	}

	@Override
	public List<Admins> getAll() {
		// TODO Auto-generated method stub
		return adminDao.getAll();
	}
	
}
