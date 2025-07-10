package com.example.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertStudent {
    public static void main(String[] args) {
        // Create configuration
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(Student.class);

        // Create session factory
        SessionFactory sessionFactory = config.buildSessionFactory();

        // Open session and begin transaction
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Create a user object
       InsertStudent student = new InsertStudent(1,"Piyush Rawat",23);

        // Save the user
        session.save(student);

        // Commit transaction and close session
        session.getTransaction().commit();
        session.close();

        System.out.println("User inserted successfully!");

        // Close the session factory
        sessionFactory.close();
    }
}
