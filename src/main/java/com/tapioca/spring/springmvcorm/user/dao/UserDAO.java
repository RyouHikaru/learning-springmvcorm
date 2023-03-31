package com.tapioca.spring.springmvcorm.user.dao;

import java.util.List;

import com.tapioca.spring.springmvcorm.user.entity.User;

public interface UserDAO {

	int create(User user);
	
	List<User> findUsers();
}
