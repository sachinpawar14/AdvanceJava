package com.app;

public class Heart {
	
	 String nameOfAnimal;
	 String noOfHearts;
	
	
	
	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public void setNoOfHearts(String noOfHearts) {
		this.noOfHearts = noOfHearts;
	}

	public Heart()
	{
		System.out.println("Heart Created");
	}
	
	public void pump()
	{
		System.out.println("You are Alive");
		System.out.println("You are heart is pumping!!");
		
	}

}
