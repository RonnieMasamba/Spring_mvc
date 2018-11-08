package com.user.service;

import java.util.List;

import com.user.dto.User;

public interface UserService {
	
	/**
	 * 
	 * 
	 * Business logic 
	 */
 int save(User user);
 int update(int id);
 int delete(int id);
 List<User>findAll();
 

}
