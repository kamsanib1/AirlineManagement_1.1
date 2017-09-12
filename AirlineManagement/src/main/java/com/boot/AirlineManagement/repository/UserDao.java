package com.boot.AirlineManagement.repository;

import java.util.List;

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
	public void add(Users user) {
		// TODO Auto-generated method stub
		entityManager.persist(user);
	}

	@Override
	public Users get(String username) {
		// TODO Auto-generated method stub
		return entityManager.find(Users.class, username);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		List<Users> users = (List<Users>)entityManager.createQuery("from Users")
														.getResultList();
		return users;
	}

}
