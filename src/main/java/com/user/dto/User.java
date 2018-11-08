package com.user.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="User")
public class User {
	
@Id
@Column(name="user_id")
private int id;
@Column(name="first_name")
private String firstName;
@Column(name="last_name")
private String lastName;

public int getId() {return id;}

public void setId(int id) {	this.id = id;}

public String getFirstName() {return firstName;}

public void setFirstName(String firstName) {this.firstName = firstName;}

public String getLastName() {	return lastName;}
public void setLastName(String lastName) {	this.lastName = lastName;}

public String toString() {
	return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}




}
