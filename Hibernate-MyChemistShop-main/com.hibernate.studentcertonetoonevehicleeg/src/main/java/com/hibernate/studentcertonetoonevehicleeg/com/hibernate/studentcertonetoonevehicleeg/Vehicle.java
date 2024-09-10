package com.hibernate.studentcertonetoonevehicleeg.com.hibernate.studentcertonetoonevehicleeg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="VEHICLE")
public class Vehicle {
 
@Id
@Column(name="VEHICLE_ID")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int vehicleId;
 
@Column(name="VEHICLE_NAME")
private String vehicleName;
 
public int getVehicleId() {
	return vehicleId;
}
 
public String getVehicleName() {
	return vehicleName;
}
public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}
 
public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
}
 
 
}