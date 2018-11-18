package com.user.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="User")
public class User implements Comparable<User> {

	@Id
	@Column(name = "user_id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;

	public int getId() {return id;}

	public void setId(int id) {	this.id = id;}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				'}';
	}

	@Override
	public int compareTo(User user) {
		/*
		 Sort users by primary key .
		 */
		return this.id.compareTo(user.id);
	}
}

