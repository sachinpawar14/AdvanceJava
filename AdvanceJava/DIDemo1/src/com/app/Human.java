package com.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	
	Heart heartObject;
	
	public Human()
	{
		System.out.println("Human Created");
	}

	
	public void setHeart(Heart heartObject) {
		System.out.println("In Setter of Heart");
		this.heartObject = heartObject;
	}

	
	public Human(Heart heartObject) {
		System.out.println("Paramterized Constructor Called");
		this.heartObject = heartObject;
	}

	public void pumping()
	{
		if(heartObject!=null)
		{
			heartObject.pump();
		}
		else
		{
			System.out.println("You are Dead!!");
		}
	}
	

}
