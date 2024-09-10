package calender1;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
	 public static void main(String args[]) 
	    { 
	        Calendar c = Calendar.getInstance(); 
	        System.out.println("The Current Date is:" + c.getTime()); 
	        
	        
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Enter your birth year: ");
	        int birthYear = scanner.nextInt();

	        System.out.println("Enter your birth month (1-12): ");
	        int birthMonth = scanner.nextInt() - 1; 

	        System.out.println("Enter your birth day: ");
	        int birthDay = scanner.nextInt();

	        Calendar today = Calendar.getInstance();

	        Calendar birthDate = Calendar.getInstance();
	        birthDate.set(birthYear, birthMonth, birthDay);

	        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

	        if (today.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)) {
	            age--;
	        }

	        System.out.println("Your age is: " + age);
	        
	        
	        
	        
	        
	        
	    } 

}
