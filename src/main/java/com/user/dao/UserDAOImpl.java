package com.user.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.user.dto.User;

@Repository
public class UserDAOImpl implements  UserDAO{
	
	
	private HibernateTemplate hibernateTemplate;

	
	public int create(User user) {
		return 0;
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
