package seguestream2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(108, 200.9, "dsa"));
        products.add(new Product(103, 900.9, "c++"));
        products.add(new Product(102, 800.9, "python"));
        products.add(new Product(104, 200.9, "react"));
        
        List<Product> products2 = new ArrayList<>();
        products2.add(new Product(108, 200.9, "dsa"));
        products2.add(new Product(103, 900.9, "c++"));
        products2.add(new Product(102, 800.9, "python"));
        products2.add(new Product(104, 200.9, "react"));

        //Collections.sort(products);
        System.out.println("Sort using code");
        Comparator<Product> codCom=(Product obj1 ,Product obj2)-> obj1.getCode()-obj2.getCode();
        Collections.sort(products, codCom);
        for (Product p : products) {
         System.out.println(p);
      }
        System.out.println("Sort using name");
        Comparator<Product> nmCom=(Product obj1 ,Product obj2)-> obj1.getName().compareTo(obj2.getName());
        Collections.sort(products, nmCom);
        for (Product p : products) {
            System.out.println(p);
         }
//        System.out.println("Sort using code");
//        Collections.sort(products, new CodeCpm()); using a codecpm class to compare (method)
//        for (Product p : products) {
//            System.out.println(p);
//        }
//        System.out.println("Sort using name");
//        Collections.sort(products2, new NameCpm());using a namecpm class to compare (method)
//        for (Product p : products2) {
//            System.out.println(p);
//        }
        
    }
}
