package com.user.service;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.user.dao.UserDAO;
import com.user.dto.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public int update(int id) {
		return 0;
	}

	public int delete(int id) {
		return 0;
	}

		@Override
	@Transactional
	public int save(User user) {
		/*
		 Business logic
		 */
		return dao.create(user);

	}
	@Override
	public List<User> getUsers() {
		List<User>users=dao.findUsers();
		
		return users;
	}


}
