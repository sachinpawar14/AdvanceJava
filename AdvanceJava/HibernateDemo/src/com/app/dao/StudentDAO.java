package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Student;

import jakarta.persistence.Query;

public class StudentDAO {
	
	public static void main(String[] args) {
		
		SessionFactory factory = 
				new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		//Save the Object
		Student s = new Student();
		s.setFirstName("Sayalee");
		s.setLastName("Patil");
		s.setAge(26);
		
		int i = (int)session.save(s);
		System.out.println("Object Persisted = "+i);
		
		//Get a Record on basis of ID
		/*int id = 2;
		Student s = session.get(Student.class, id);
		System.out.println(s);*/
		
		//Update an entity
		/*
		 * int id = 1; Student s = session.get(Student.class, id);
		 * s.setFirstName("Rahul"); s.setLastName("Pawar");
		 */

		//delete an Entity
		/*
		 * int id = 2; Student s = session.get(Student.class, id); session.delete(s);
		 */
		
		//Custom Queries
		/*
		 * System.out.println("List of Students..."); Query query =
		 * session.createQuery("from Student"); List<Student> list =
		 * query.getResultList(); for(Student s:list) { System.out.println(s); }
		 */
		
		session.getTransaction().commit();
		session.close();
		factory.close();	
	}
}
