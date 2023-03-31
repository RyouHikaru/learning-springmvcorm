package com.tapioca.spring.springmvcorm.user.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tapioca.spring.springmvcorm.user.dao.UserDAO;
import com.tapioca.spring.springmvcorm.user.entity.User;
import com.tapioca.spring.springmvcorm.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	@Transactional
	public int save(User user) {
		return dao.create(user);
	}

	public List<User> getUsers() {
		List<User> users = dao.findUsers();
		Collections.sort(users);
		return users;
	}

}
