package suguestream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
 
public class VowelexamMain {
 
 
		    public static void main(String[] args) {
		    	
 
		    	String str="aelcome in java";
	              str=" "+str;
	              
	              
	              
	            //  count first letter of the string is vowel or not
	          
	              
	              int c=0;
	              for(int i=0;i<str.length();i++)
	              {
			    	  if(str.charAt(i)==' ')
			    	  {
	            	  
	            	  if( str.charAt(i+1)=='o' || str.charAt(i+1)=='u' ||  str.charAt(i+1)=='a' ||  str.charAt(i+1)=='i' ||  str.charAt(i+1)=='e')
	            	  { c=c+1;
	 
	 
	      		   
	 
	            	  
	            	  }
	            	  }
			
			    	                          
	              }
			    	System.out.println(c);
		    }
}