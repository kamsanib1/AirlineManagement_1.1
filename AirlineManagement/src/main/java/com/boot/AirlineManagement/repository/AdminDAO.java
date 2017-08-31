package com.boot.AirlineManagement.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.boot.hibernate.entity.Admins;

@Transactional
@Repository
public class AdminDAO implements IAdminDAO {

	@PersistenceContext
	EntityManager entityManager;
		

	@Override
	public void addAdmin(Admins admin) {
		// TODO Auto-generated method stub
		entityManager.persist(admin);
	}

	@Override
	public Admins getAdmin(String adminname) {
		// TODO Auto-generated method stub
		return entityManager.find(Admins.class, adminname);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admins> getAllAdmins() {
		// TODO Auto-generated method stub
		List<Admins> admins = (List<Admins>)entityManager.createQuery("from admins")
															.getResultList();
		return admins;
	}

}
