package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration()
        		.configure("hibernate.cfg.xml")
        		.addAnnotatedClass(Instructor.class)
        		.addAnnotatedClass(InstructorDetails.class)
        		.buildSessionFactory();
        
        Session session = factory.openSession();
        session.beginTransaction();
        
        Instructor instructor = new Instructor("Rahul", "Pawar", "rahul@gmail.com");
        InstructorDetails instructorDetails = new InstructorDetails("Football","Sports");
        instructor.setInstructorDetails(instructorDetails);
        
        session.save(instructor);
        
        session.getTransaction().commit();
        
        session.close();
        factory.close();
        
        
    }
}
