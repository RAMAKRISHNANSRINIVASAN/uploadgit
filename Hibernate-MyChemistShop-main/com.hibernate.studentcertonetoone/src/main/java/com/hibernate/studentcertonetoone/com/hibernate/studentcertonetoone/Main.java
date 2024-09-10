package com.hibernate.studentcertonetoone.com.hibernate.studentcertonetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        // Configure Hibernate
        Configuration config = new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Certificate.class);
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // Create Certificate instance
        Certificate cert = new Certificate(1, "Java Certification");

        // Create Student instance
        Student student = new Student(101, "Asha", cert);

        // Save Student and Certificate to the database
        session.save(cert);
        session.save(student);

        // Commit transaction and close session
        tx.commit();
        session.close();
        factory.close();
    }
}

