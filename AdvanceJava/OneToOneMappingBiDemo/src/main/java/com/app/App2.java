package com.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;

import jakarta.persistence.Query;

public class App2 {
	
	public static void main( String[] args )
    {
        SessionFactory factory = new Configuration()
        		.configure("hibernate.cfg.xml")
        		.addAnnotatedClass(Instructor.class)
        		.addAnnotatedClass(InstructorDetails.class)
        		.buildSessionFactory();
        
        Session session = factory.openSession();
        session.beginTransaction();
        
        Query query = session.createQuery("from Instructor");
       List<Instructor> list = query.getResultList();
       list.forEach(i ->{ System.out.println(i); });
        //session.getTransaction().commit();
        
        session.close();
        factory.close();
    }

}
