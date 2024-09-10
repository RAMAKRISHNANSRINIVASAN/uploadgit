package suguestream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List of users
        
       List<String>users=new ArrayList<String>();
		
		users.add("Asha");
		users.add("pooja");
		users.add("kavita");
		users.add("Ajay");
		users.add("deepa");
		
		System.out.println("print count of names length > 4");
		//long c=users.stream().filter((temp)->temp.length()>4).count();
		long c=users.stream().filter((temp)->temp.length()>4).count();//*NOTE here count is returning long 
		int c1=(int)c;//*NOTE alternate we can change long to int 
		System.out.println(c1);
		
		
		System.out.println("print name start");
		users.stream().filter((t)->t.startsWith("As")).forEach((temp)->System.out.println(temp));
       
		System.out.println("print all users");
        // Stream to print all users
        users.stream().forEach((temp) -> System.out.println(temp));
        
        // List of integers
        List<Integer> al = new ArrayList<>();
        
        // Adding integers to the list
        al.add(2);
        al.add(22);
        al.add(42);
        al.add(28);
        
        // Print all integers using stream
        al.stream().forEach((t) -> System.out.println(t));
        
        // Print even integers using stream with filter
        System.out.println("Even numbers:");
        al.stream()
          .filter((e) -> e % 2 == 0)
          .forEach((t) -> System.out.println(t));

        // Traditional for-loop
        System.out.println("Using traditional for-loop:");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        
        // Enhanced for-loop
        System.out.println("Using enhanced for-loop:");
        for (Integer i : al) {
            System.out.println(i);
        }
    }
}
