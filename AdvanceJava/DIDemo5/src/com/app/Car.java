package com.app;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle{
	
	public Car()
	{
		System.out.println("Car Constructor");
	}

	@Override
	public String start() {
		
		return "Car Started";
	}

}
