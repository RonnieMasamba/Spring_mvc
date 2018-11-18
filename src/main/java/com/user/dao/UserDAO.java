package com.user.dao;


import com.user.dto.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDAO {
	
	int create(User user);
	List<User> findUsers();
	

}
