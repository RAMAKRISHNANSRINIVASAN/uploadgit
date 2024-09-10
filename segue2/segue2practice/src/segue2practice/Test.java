package segue2practice;
import java.util.HashSet;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String args[])
	{
//		int a[]= {4,6,7,88,99,3,45,23,67,89,12,34,56};
//		List<Integer> pass = new ArrayList<>();
//        List<Integer> fail = new ArrayList<>();
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > 40) {
//                pass.add(a[i]);
//            } else {
//                fail.add(a[i]);
//            }
//        }
//        System.out.println("Pass marks: " + pass);
//        System.out.println("Fail marks: " + fail);
		
		
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		       
//		        int a[] = {4, 6, 7, 88, 99, 3, 45, 23, 6, 7, 88, 99, 3, 45, 23, 6, 7, 88, 99, 3, 45, 23, 67, 89, 12, 34, 56};
//
//		       
//		        Set<Integer> uniqueSet = new HashSet<>();
//
//		       
//		        for (int i = 0; i < a.length; i++) {
//		            uniqueSet.add(a[i]);
//		        }
//
//		        
//		        System.out.println("Unique elements (unordered): " + uniqueSet);
		 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
		
//Map <Integer,String>map= new HashMap();
//		
//		map.put(101, "Asha");
//		map.put(102, "pooja");
//		map.put(102, "ajay");
// 
//		map.put(103, "komal");
// 
//		map.put(102, "Aman");
// 
//		  if(map.containsKey(101))
//		  {
//			
//				System.out.println(map.get(101));
// 
//		  }
//		  else
//		  {
//			  
//				System.out.println("Not Found");
// 
//		  }
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 Map<Integer, String> users = new HashMap<>();
	        
	       
	        users.put(101, "Asha");
	        users.put(102, "pooja");
	        users.put(102, "ajay"); 
	        users.put(103, "komal");
	        users.put(102, "Aman");

	        
	        int id = 102;
	        String pass = "pooja";

	        
	        if (users.containsKey(id)) {
	            
	            String storedName = users.get(id);

	            
	            if (storedName.equals(pass)) {
	                System.out.println("Login successful");
	            } else {
	                System.out.println("Login failed: Incorrect name");
	            }
	        } else {
	            System.out.println("Login failed: ID not found");
	        }
	}

}
