package com.envers.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * User Dao class
 *
 */
@Repository
public class UserDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Add user in data base
	 * 
	 * @param user
	 * @return primary key[id] of added user
	 */
	@Transactional
	public Long addUser(User user) {

		Session session = sessionFactory.getCurrentSession();

		return (Long) session.save(user);

	}

	/**
	 * Add user in data base
	 * 
	 * @param user
	 * @return primary key[id] of added user
	 */
	@Transactional
	public Long updateUser(User user) {

		Session session = sessionFactory.getCurrentSession();
		session.update(user);
		return user.getId();
	}
}
