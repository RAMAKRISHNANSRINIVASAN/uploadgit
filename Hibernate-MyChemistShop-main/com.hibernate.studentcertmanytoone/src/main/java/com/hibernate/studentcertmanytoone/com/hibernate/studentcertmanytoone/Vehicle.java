package com.hibernate.studentcertmanytoone.com.hibernate.studentcertmanytoone;

import javax.persistence.*;

@Entity
@Table(name="VEHICLE")
public class Vehicle {
 
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="VEHICLE_ID")
private int vehicleId;
 
@Column(name="VEHICLE_NAME")
private String vehicleName;
 
@ManyToOne
@JoinColumn(name="USER_ID")
private UserDetails user;
 
public int getVehicleId() {
	return vehicleId;
}
 
public String getVehicleName() {
	return vehicleName;
}
 
public UserDetails getUser() {
	return user;
}
 
public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
}
 
public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}
 
public void setUser(UserDetails user) {
	this.user = user;
}
 
}
 
