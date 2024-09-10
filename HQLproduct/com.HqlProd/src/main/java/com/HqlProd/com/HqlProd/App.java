package com.HqlProd.com.HqlProd;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {

    private SessionFactory factory;
    private Session session;

    public App() {
        factory = new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(Product.class).buildSessionFactory();
        session = factory.openSession();
    }

    public static void main(String[] args) {
        App app = new App();  // Create an instance of App to use its non-static fields
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add New Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Price of Item");
            System.out.println("4. Calculate Total Bill");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    app.addNewItem(sc);
                    break;
                case 2:
                    app.removeItem(sc);
                    break;
                case 3:
                    app.updatePrice(sc);
                    break;
                case 4:
                    app.calculateTotalBill(sc);
                    break;
                case 0:
                    app.session.close();
                    app.factory.close();
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }

    private void addNewItem(Scanner sc) {
        System.out.println("Enter Product ID: ");
        int pid = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.println("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Product Price: ");
        double price = sc.nextDouble();

        Transaction tx = session.beginTransaction();
        Product newProduct = new Product(pid, name, price);
        session.save(newProduct);
        tx.commit();

        System.out.println("Product added successfully.");
    }


    private void removeItem(Scanner sc) {
        System.out.println("Enter Product ID to remove: ");
        int pid = sc.nextInt();

        Transaction tx = session.beginTransaction();
        String hql = "delete from Product P where P.pid = :pid";
        int result = session.createQuery(hql).setParameter("pid", pid).executeUpdate();
        tx.commit();

        if (result > 0) {
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }
    // using query class   
//    private void removeItem(Scanner sc) {
//        System.out.println("Enter Product ID to remove: ");
//        int pid = sc.nextInt();
//
//        // Open a new session and begin transaction
//        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();
//
//        // Create HQL query for deletion
//        String hql = "delete from Product P where P.pid = :pid";
//        Query query = session.createQuery(hql,Product.class);
//        query.setParameter("pid", pid);
//
//        // Execute the query and get the result
//        int result = query.executeUpdate();
//        tx.commit();
//
//        // Check the result
//        if (result > 0) {
//            System.out.println("Product removed successfully.");
//        } else {
//            System.out.println("Product not found.");
//        }
//
//        // Close the session
//        session.close();
//    }


    private void updatePrice(Scanner sc) {
        System.out.println("Enter Product ID: ");
        int pid = sc.nextInt();
        System.out.println("Enter new price: ");
        double price = sc.nextDouble();

        Transaction tx = session.beginTransaction();
        String hql = "update Product P set P.price = :price where P.pid = :pid";
        int result = session.createQuery(hql).setParameter("price", price).setParameter("pid", pid).executeUpdate();
        tx.commit();

        if (result > 0) {
            System.out.println("Product price updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }
    
    // using query class   
//    private void updatePrice(Scanner sc) {
//        System.out.println("Enter Product ID: ");
//        int pid = sc.nextInt();
//        System.out.println("Enter new price: ");
//        double price = sc.nextDouble();
//
//        // Open a new session and begin transaction
//        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();
//
//        // Create the HQL query to update the price
//        String hql = "update Product P set P.price = :price where P.pid = :pid";
//        Query query = session.createQuery(hql,Product.class);
//        query.setParameter("price", price);
//        query.setParameter("pid", pid);
//
//        int result = query.executeUpdate();
//
//        // Commit the transaction
//        tx.commit();
//
//        // Check if the update was successful
//        if (result > 0) {
//            System.out.println("Product price updated successfully.");
//        } else {
//            System.out.println("Product not found.");
//        }
//
//        // Close the session
//        session.close();
//    }


    private void calculateTotalBill(Scanner sc) {
        System.out.println("Enter Product ID: ");
        int pid = sc.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();

        String hql = "select P.price from Product P where P.pid = :pid";
        Double price = (Double) session.createQuery(hql).setParameter("pid", pid).uniqueResult();

        if (price != null) {
            double totalBill = price * quantity;
            System.out.println("Total Bill: " + totalBill);
        } else {
            System.out.println("Product not found.");
        }
    }
    
    
 // using query class   
//    private void calculateTotalBill(Scanner sc) {
//        System.out.println("Enter Product ID: ");
//        int pid = sc.nextInt();
//        System.out.println("Enter quantity: ");
//        int quantity = sc.nextInt();
//
//        // Open a new session
//        Session session = factory.openSession();
//
//        // Create the HQL query to get the price of the product
//        String hql = "select P.price from Product P where P.pid = :pid";
//        Query query = session.createQuery(hql, Double.class);
//        query.setParameter("pid", pid);
//
//        // Execute the query and get the result
//        Double price = (Double) query.uniqueResult();
//
//        if (price != null) {
//            double totalBill = price * quantity;
//            System.out.println("Total Bill: " + totalBill);
//        } else {
//            System.out.println("Product not found.");
//        }
//
//        // Close the session
//        session.close();
//    }

    
    
    
}
