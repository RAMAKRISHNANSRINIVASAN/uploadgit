package suguestream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMain {

    public static void main(String[] args) {
        // Create a list of Product objects
        List<Product> products = new ArrayList<>();
        
        // Add products to the list
        Product p1 = new Product(101, 200.9, "pen");
        products.add(p1);
        
        Product p2 = new Product(102, 400.9, "notebook");
        products.add(p2);
        
        Product p3 = new Product(106, 800.9, "book");
        products.add(p3);
        
        Product p4 = new Product(107, 800.9, "book");
        products.add(p4);
        
        Product p5 = new Product(108, 900.9, "book");
        products.add(p5);
        // Print product details using a stream
        products.stream().filter((t)->t.getCode()==102).forEach(temp -> System.out.println(temp.toString()));//*NOTE
        System.out.println("printing which contain book");
        
        
        
        products.stream().filter((t)->t.getName().equals("book")).forEach(temp -> System.out.println(temp.toString()));//*NOTE
        
        System.out.println("printing price above 200");
        
        products.stream().filter((t)->t.getPrice()>200).forEach(temp -> System.out.println(temp.toString()));
        
        System.out.println("storing and printing which contain book");
        
                
        List<Product> p = products.stream().filter((t)-> t.getName().equals("book")).collect(Collectors.toList());//*NOTE
	    p.forEach((t)->System.out.println(t.toString()));   //*NOTE
	    
	    System.out.println("trying alternate way printing price above 200");
	    
	    List<Product> filteredList = products.stream().filter((t) -> t.getPrice() > 200).collect(Collectors.toList()); 
	    filteredList.forEach((t)->System.out.println(t.toString()));
	   // System.out.println("try > 200): " + filteredList);//*NOTE if list the to select the object we need t.getPrice() specifically but in main3 class its just the int is present so just t->t is enough and not t->t.getPrice()
        //System.out.println(p);
	
        // Alternatively, use an enhanced for-loop to print product details
        /*
        for (Product p : products) {
            System.out.println(p);
        }
        */
    }
}
