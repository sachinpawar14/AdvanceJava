package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;

public class App1 {
	public static void main( String[] args )
    {
        SessionFactory factory = new Configuration()
        		.configure("hibernate.cfg.xml")
        		.addAnnotatedClass(Instructor.class)
        		.addAnnotatedClass(InstructorDetails.class)
        		.buildSessionFactory();
        
        Session session = factory.openSession();
        session.beginTransaction();
        
        int id = 2;
        
        InstructorDetails i = session.get(InstructorDetails.class, id);
        session.delete(i);

        session.getTransaction().commit();
        
        session.close();
        factory.close();
    }
}
