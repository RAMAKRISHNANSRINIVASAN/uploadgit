package com.hibernate.studentcertonetomany.com.hibernate.studentcertonetomany;

import java.util.ArrayList;
import java.util.Collection;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
 
@Entity
@Table(name="USER")
public class UserDetails {
 
@Id
@Column(name="USER_ID")
private int userId;
 
@Column(name="USER_NAME")
private String userName;
 
@OneToMany
 
@JoinTable(name="USER_VEHICLE",joinColumns=@JoinColumn(name="USER_ID"),
 
inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))
private Collection<Vehicle> vehicle=new ArrayList<Vehicle>();
 
public int getUserId() {
	return userId;
}
 
public String getUserName() {
	return userName;
}
 
public Collection<Vehicle> getVehicle() {
	return vehicle;
}
 
public void setUserId(int userId) {
	this.userId = userId;
}
 
public void setUserName(String userName) {
	this.userName = userName;
}
 
public void setVehicle(Collection<Vehicle> vehicle) {
	this.vehicle = vehicle;
}
 
}
