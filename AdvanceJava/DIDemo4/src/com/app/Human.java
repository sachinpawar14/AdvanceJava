package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	//@Autowired
	//@Qualifier("octupusHeart")
	Heart heartObject;
	
	public Human()
	{
		System.out.println("Human Created");
	}

	//@Autowired
	//@Qualifier("humanHeart")
	public void setHeart(Heart heartObject) {
		System.out.println("In Setter of Heart");
		this.heartObject = heartObject;
	}

	@Autowired
	//@Qualifier("humanHeart")
	public Human(Heart heartObject) {
		System.out.println("Paramterized Constructor Called");
		this.heartObject = heartObject;
	}

	public void pumping()
	{
		if(heartObject!=null)
		{
			heartObject.pump();
			System.out.println("Name of Animal = "+heartObject.nameOfAnimal+
					" No of Hearts : "+heartObject.noOfHearts);
		}
		else
		{
			System.out.println("You are Dead!!");
		}
	}
	

}
