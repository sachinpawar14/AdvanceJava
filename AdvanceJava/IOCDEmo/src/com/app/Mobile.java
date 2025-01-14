package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {	
	public static void main(String[] args) {
		/*
		 * Vodafone v = new Vodafone(); v.calling(); v.data();
		 */
		
		/*
		 * Sim air = new Airtel(); air.calling(); air.data();
		 */
		
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 *  Vodafone v =(Vodafone) context.getBean("voda"); 
		 *  v.calling();
		 *  v.data();
		 */
		
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 *  Airtel a = context.getBean("air",Airtel.class); 
		 *  a.calling();
		 *   a.data();
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();	
	}
}
