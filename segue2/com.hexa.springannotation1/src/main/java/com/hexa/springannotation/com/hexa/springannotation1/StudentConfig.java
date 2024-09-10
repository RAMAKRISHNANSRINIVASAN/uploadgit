package com.hexa.springannotation.com.hexa.springannotation1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;	


public class StudentConfig {
	
	@Bean(name="stud1", initMethod="init", destroyMethod="destroy")
	public Student getStudent()
 
	{
		Student s1= new Student();;
		s1.setRoll(101);
		s1.setName("Arti");
		s1.setFee(2000.9);
		return s1;
	}
	
	@Bean(name="stud2")
	public Student getStudent1()
 
	{
		Student s2= new Student();;
		s2.setRoll(102);
		s2.setName("Ron");
		s2.setFee(3000.9);
		return s2;
}
	
	@Bean(name="Res")
	public  Result getResult()
	{
		Result r= new Result();
		r.setMarks(99);
		r.setRemarks("pass");
		return r;


	}
//	@Bean(name="Res1")
//	public  Result getResult1()
//	{
//		Result r= new Result();
//		r.setMarks(89);
//		r.setRemarks("pass");
//		return r;
//
//
//	}


 
}
