package com.hibernate.studentresultembed.com.hibernate.studentresultembed;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        
        // Configure Hibernate
        Configuration config = new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(Student.class);
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // Create Result instance
        Result r = new Result();
        r.setMarks(101);
        r.setSub("DSA");

        // Create Student instance
        Student s1 = new Student();
        s1.setRoll(101);
        s1.setName("Asha");
        s1.setResult(r);

        // Save Student to database
        session.save(s1);

        // Commit transaction and close session
        tx.commit();
        session.close();
        factory.close();
    }
}
