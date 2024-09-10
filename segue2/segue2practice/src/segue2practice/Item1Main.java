package segue2practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item1Main {
    public static void main(String[] args) {
        
        List<Item1> items = new ArrayList<>();

       
        Item1 s1 = new Item1(101, "dsa", 800, 100);
        items.add(s1);

        Item1 s2 = new Item1(102, "os", 800, 150);
        items.add(s2);

        Item1 s3 = new Item1(103, "c++", 800, 200);
        items.add(s3);

        Item1 s4 = new Item1(104, "aha", 800, 250);
        items.add(s4);

        Item1 s5 = new Item1(105, "book", 800, 300);
        items.add(s5);

       
        boolean flag = false;

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the item name: ");
        String inputName = scanner.nextLine();

       
        Item1 foundItem = null;
        for (Item1 item : items) {
            if (item.getName().equals(inputName)) {
                foundItem = item;
                break;
            }
        }

        if (foundItem != null) {
            System.out.println("Item found: " + foundItem.toString());

         
            System.out.print("Enter the quantity you want to purchase: ");
            int requestedQty = scanner.nextInt();

           
            int availableQty = foundItem.getQty(); 
            if (requestedQty <= availableQty) {
                
                System.out.print("We have " + availableQty + " units available. Do you want to proceed with the purchase? (yes/no): ");
                scanner.nextLine(); // Consume newline left-over
                String confirmation = scanner.nextLine();

                if ("yes".equalsIgnoreCase(confirmation)) {
                    
                    double totalBill = requestedQty * foundItem.getPrice();
                    System.out.println("Total bill for " + requestedQty + " items: " + totalBill);
                } else {
                    System.out.println("Purchase cancelled.");
                }
            } else {
                System.out.println("Requested quantity is not available.");
            }
        } else {
            System.out.println("Item not found.");
        }

    
        scanner.close();
    }
}
