package com.tapioca.spring.springmvcorm.user.service;

import java.util.List;

import com.tapioca.spring.springmvcorm.user.entity.User;

public interface UserService {

	int save(User user);
	
	List<User> getUsers();
	
	User getUser(Integer id);
}
