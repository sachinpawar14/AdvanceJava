package com.app;

import org.springframework.stereotype.Component;

@Component
public class Airplane implements Vehicle{
	
	public Airplane()
	{
		System.out.println(" Airplane constructor");
	}

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "Airplane Started";
	}
	
	
	

}
