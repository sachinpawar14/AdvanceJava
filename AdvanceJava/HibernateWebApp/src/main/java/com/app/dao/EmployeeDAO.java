package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Employee;

public class EmployeeDAO {
	
	public static int saveEmployee(Employee e)
	{
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		int status =(int) session.save(e);
		session.getTransaction().commit();
		return status;
	}

}
