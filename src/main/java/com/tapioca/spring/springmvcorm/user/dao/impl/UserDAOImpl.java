package com.tapioca.spring.springmvcorm.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.tapioca.spring.springmvcorm.user.dao.UserDAO;
import com.tapioca.spring.springmvcorm.user.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public int create(User user) {
		Integer result = (Integer) hibernateTemplate.save(user);
		return result;
	}

	public List<User> findUsers() {
		return hibernateTemplate.loadAll(User.class);
	}
}
