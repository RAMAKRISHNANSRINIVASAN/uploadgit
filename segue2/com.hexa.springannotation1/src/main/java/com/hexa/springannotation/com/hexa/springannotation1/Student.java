package com.hexa.springannotation.com.hexa.springannotation1;

import org.springframework.beans.factory.annotation.Autowired;
public class Student {
	int Roll;
	String Name;
	Double Fee;
	public int getRoll() {
		return Roll;
	}
	@Autowired
	Result res;
	
	

	public Result getRes() {
		return res;
	}
	public void setRes(Result res) {
		this.res = res;
	}
	
	
	Student(){
		
	}
	
	

	public void setRoll(int roll) {
		Roll = roll;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getFee() {
		return Fee;
	}
	public void setFee(Double fee) {
		Fee = fee;
	}
	void init() {
		System.out.println("before object is created");
	}
	void destroy() {
		System.out.println("After finishing the work");
	}
	@Override
	public String toString() {
		return "Student [Roll=" + Roll + ", Name=" + Name + ", Fee=" + Fee + "]";
	}

 
}