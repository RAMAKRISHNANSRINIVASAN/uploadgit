package seguestream2;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OnlineShoppingMain {

    public static void main(String[] args) {
        // Create a HashSet of OnlineShopping products
        Set<OnlineShopping> products = new HashSet<>();
        products.add(new OnlineShopping(101, "Laptop", 1200, 5));
        products.add(new OnlineShopping(102, "Smartphone", 800, 10));
        products.add(new OnlineShopping(103, "Tablet", 450, 7));
        products.add(new OnlineShopping(104, "Headphones", 150, 15));

        
        List<OnlineShopping> productList = new ArrayList<>(products);

        // Sort products by name using a lambda expression
//        productList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
//
//        System.out.println("Products sorted by name:");
//        productList.forEach(System.out::println);

        // Sort products by price using a lambda expression
        //Comparator<Product> codCom=(Product obj1 ,Product obj2)-> obj1.getCode()-obj2.getCode();
        Comparator<OnlineShopping> priCom=(OnlineShopping obj1 ,OnlineShopping obj2)-> obj1.getPrice()-obj2.getPrice();
//        Comparator<OnlineShopping> priCom = (OnlineShopping obj1, OnlineShopping obj2) -> 
//        Double.compare(obj1.getPrice(), obj2.getPrice());

        Collections.sort(productList, priCom);
        System.out.println("\nProducts sorted by price:");
        for (OnlineShopping p : productList) {
            System.out.println(p);
            
            
         }
        //Comparator<Product> nmCom=(Product obj1 ,Product obj2)-> obj1.getName().compareTo(obj2.getName());
        Comparator<OnlineShopping> nameCom=(OnlineShopping obj1 ,OnlineShopping obj2)-> obj1.getName().compareTo(obj2.getName());
        Collections.sort(productList, nameCom);
        System.out.println("\nProducts sorted by name:");
        for (OnlineShopping p : productList) {
            System.out.println(p);
        
        //productList.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

        
        //productList.forEach(System.out::println);
    }
}
}
