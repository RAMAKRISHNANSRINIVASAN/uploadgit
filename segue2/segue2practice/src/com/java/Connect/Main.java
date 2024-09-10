package com.java.Connect;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		StudentService ser = new StudentService();
//		ser.addData();
//		ser.showAll();
//		
		
		 
		 Scanner sc = new Scanner(System.in);
		
		int choice;
        do {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Remove");
            System.out.println("4. Update");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    ser.addData();
                    break;
                case 2:
                    ser.showAll();
                    break;
                case 3:
                    ser.removeData();
                    break;
                case 4:
                    ser.updateData();
                    break;  
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        } while (choice != 5);
    }
    
 

	}


