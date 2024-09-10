package com.hibernate.studentcertmanytoone.com.hibernate.studentcertmanytoone;

import javax.persistence.*;

@Entity
@Table(name="USER")
public class UserDetails {
	
@Column(name="USER_ID")
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userId;
 
@Column(name="USER_NAME")
private String userName;
 
public int getUserId() {
	return userId;
}
 
public String getUserName() {
	return userName;
}
 
public void setUserId(int userId) {
	this.userId = userId;
}
 
public void setUserName(String userName) {
	this.userName = userName;
}
 
}
