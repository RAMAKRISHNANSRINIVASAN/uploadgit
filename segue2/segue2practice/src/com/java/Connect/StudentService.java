package com.java.Connect;

import java.util.Scanner;

import com.java.Model.Student;
import com.java.Student.Dao.IStudentDao;

public class StudentService {
	
	Scanner sc ;
	IStudentDao dao;
	
	
	public StudentService() {
		
		sc=new Scanner(System.in);
		dao=new IStudentDao();
		
	}
		public void addData()
		{
			Student s =new Student();
			System.out.println("enter roll no ");
			s.setRollno(sc.nextInt());
			
			System.out.println("enter name no ");
			sc.nextLine();
			s.setName(sc.nextLine());
			
			System.out.println("enter fee");
			s.setFee(sc.nextDouble());
			
			dao.insert1(s);
			
			
			
		}
		public void showAll() {
		  dao.showAll();
		}

		
		public void removeData() {
	        System.out.println("Enter the roll number of the student to remove: ");
	        int roll = sc.nextInt();

	        dao.remove(roll);  // Call the DAO remove method to delete the student record
	    }
		public void updateData() {
		    System.out.println("Enter the roll number of the student to update: ");
		    int roll = sc.nextInt();

		    System.out.println("Enter the new fee: ");
		    double fee = sc.nextDouble();

		    dao.updateFee(roll, fee);  // Call the DAO method to update the fee
		}

		
		
		
		

	
	
	
	
	
	
	

}
