package com.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.user.dto.User;

@Repository
public class UserDAOImpl implements  UserDAO{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	public int create(User user) {
	Integer result =(Integer)hibernateTemplate.save(user);
	return result;
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
