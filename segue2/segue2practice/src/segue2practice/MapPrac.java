package segue2practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPrac {
    public static void main(String[] args) {
        // Create a map with item names and prices
        Map<String, Double> items = new HashMap<>();
        items.put("item1", 200.9);
        items.put("item2", 300.9);
        items.put("item3", 500.9);
        items.put("item4", 700.9);
        items.put("item5", 900.9);
        
        // Scanner for taking user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt for item
        System.out.print("Enter item: ");
        String item = sc.nextLine();
        
        // Prompt for quantity
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Check if item exists in the map and calculate total bill
        if (items.containsKey(item)) {
            double price = items.get(item);
            double totalBill = price * quantity;
            System.out.println("Total bill for " + item + ": " + totalBill);
        } else {
            System.out.println("Item not found.");
        }

        // Close the scanner
        sc.close();
    }
}



