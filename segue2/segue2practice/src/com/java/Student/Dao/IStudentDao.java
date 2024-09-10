package com.java.Student.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.Connect.DataConnect;
import com.java.Model.Student;

public class IStudentDao {
	
	Connection con;
	PreparedStatement stat;
	public IStudentDao()
	{
		con=DataConnect.getConnect();
		
	}
	   
	
	
	
	

	public void insert1(Student s) {
		
		
		try
		{
		stat=con.prepareStatement("insert into student values(?,?,?)");
		stat.setInt(1, s.getRollno());
		stat.setString(2, s.getName());
		stat.setDouble(3,s.getFee());
		
		stat.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}	
	}
	
	public void showAll() {
	    String sql = "SELECT * FROM student";
	    
	    try (PreparedStatement stat = con.prepareStatement(sql);
	         ResultSet rs = stat.executeQuery()) {
	        
	        while (rs.next()) {
	            // Print the values of each column in the current row
	            System.out.println("Roll No: " + rs.getInt(1));
	            System.out.println("Name: " + rs.getString(2));
	            System.out.println("Fee: " + rs.getDouble(3));
	            System.out.println("------------------------");
	        }
	    } catch (SQLException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}

	public void remove(int roll) {
	    String sql = "DELETE FROM student WHERE rollNo = ?";
	    
	    try {
	        PreparedStatement stat = con.prepareStatement(sql);
	        stat.setInt(1, roll);
	        
	        int rowsDeleted = stat.executeUpdate();
	        if (rowsDeleted > 0) {
	            System.out.println("Student with Roll No: " + roll + " has been deleted.");
	        } else {
	            System.out.println("No student found with Roll No: " + roll);
	        }
	    } catch (SQLException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}
	public void updateFee(int roll, double fee) {
	    String sql = "UPDATE student SET fee = ? WHERE rollNo = ?";

	    try {
	        PreparedStatement stat = con.prepareStatement(sql);
	        stat.setDouble(1, fee);  // Set new fee
	        stat.setInt(2, roll);    // Set roll number to identify the student

	        int rowsUpdated = stat.executeUpdate();

	        if (rowsUpdated > 0) {
	            System.out.println("Record updated successfully.");
	        } else {
	            System.out.println("No student found with Roll No: " + roll);
	        }

	    } catch (SQLException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}


}
