package com.boot.AirlineManagement.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.boot.hibernate.entity.Users;

@Transactional
@Repository
public class UserDao implements IUserDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		entityManager.persist(user);
	}

	@Override
	public Users getUser(String username) {
		// TODO Auto-generated method stub
		return entityManager.find(Users.class, username);
	}

}
