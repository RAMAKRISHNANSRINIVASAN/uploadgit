package com.hexaware.hibernate1.com.hexaware.hibernate11;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
 
 
public class App {
	SessionFactory fac;
	Session ses;
	 Transaction tx;
	
	App()
	{
        fac=new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(Book.class).buildSessionFactory();
    	
    	 ses=fac.openSession();
		
	}
	
	
	    void insertBook()
	    {
	    	 tx=ses.beginTransaction();
	         
	         Book b= new Book();
	         b.setBno(104);
	         b.setName("python");
	         b.setPrice(4000.9);
	         
	         ses.save(b);
	         tx.commit();
	    }
	    void RemoveByBNo()
	    {
	    	int bn=101;
	    	 tx=ses.beginTransaction();
	    	Book b= ses.find(Book.class,bn);
	    	if(b!=null)
	    	{
	    		ses.delete(b);
	    		tx.commit();
	    		
	    	}
	    	else
	    	{
	    		System.out.println("Not Found");
	    	}	
	    }
	    void UpdateBkPriceByBNo() {
	        // Get input from user using Scanner
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter Book Number (Bno) to update: ");
	        int bn = sc.nextInt();
	        
	        System.out.print("Enter new price for the book: ");
	        double newPrice = sc.nextDouble();

	        // Begin transaction
	        tx = ses.beginTransaction();

	        // Find the book by Bno
	        Book b = ses.find(Book.class, bn);
	        if (b != null) {
	            // Update price if book is found
	            b.setPrice(newPrice);
	            ses.update(b);
	            tx.commit();
	            System.out.println("Book price updated successfully.");
	        } else {
	            System.out.println("Book with Bno " + bn + " not found.");
	        }
	    }
	    void SearchAndDisplayBook() {
	        // Get input from user using Scanner
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Book Number (Bno) to search: ");
	        int bn = sc.nextInt();

	        // Begin transaction
	        tx = ses.beginTransaction();

	        // Find the book by Bno
	        Book b = ses.find(Book.class, bn);
	        if (b != null) {
	            // Display book details if found
	            System.out.println("Book details: " + b);
	        } else {
	            System.out.println("Book with Bno " + bn + " not found.");
	        }

	        tx.commit();
	    }
	    void showAll()
	    {
	    	
	    	 tx=ses.beginTransaction();
	    	
	    	 Query q=ses.createQuery("from Book ");
	    	 List <Book>books= q.list();
	    	
	    	 for(Book b : books)
	    	 {
	    		 System.out.println(b.toString());
	    		
	    	 }
	    	
	    	
 
	    }
	    
	    void showData()
	    {
	    	 tx=ses.beginTransaction();
	    	 String hql="from Book B where B.price>:p and B.Name=:nm ";
	    	 Query q =ses.createQuery(hql,Book.class);
	    	 q.setParameter("p", 4000.9);
	    	 q.setParameter("nm", "java");
	    	 List <Book> books=q.list();
	    	
	    	 System.out.println(books);
	    	
	    	
 
	    	
	    }
	    
	    void showpRICE() {
	        Transaction tx = ses.beginTransaction();

	        String hql = "UPDATE Book B set B.Name = :nm where B.Bno = :bn";

	        Query q = ses.createQuery(hql);
	        q.setParameter("bn", 102);
	        q.setParameter("nm", "EXpress");

	        int a = q.executeUpdate();  // Number of affected rows

	        if (a > 0) {
	            System.out.println("Name updated successfully.");
	        } else {
	            System.out.println("Update failed.");
	        }

	        tx.commit();
	    }



	    void removeHQL() {
	        Transaction tx = ses.beginTransaction();
	        
	        String hql = "delete from Book B where B.Bno = :bn";
	        
	        Query q = ses.createQuery(hql);
	        q.setParameter("bn", 104);
	        
	        int a = q.executeUpdate();  // Number of affected rows
	        
	        if (a > 0) {
	            System.out.println("Removed successfully.");
	        } else {
	            System.out.println("Removal failed.");
	        }
	        
	        tx.commit();
	    }


	
    public static void main(String[] args) {
 
    	App app= new App();
    	app.removeHQL();
    	
     
       
    		   
    	  
    	  
    	
    	System.out.println("Welcome");
 
    }
}
 
