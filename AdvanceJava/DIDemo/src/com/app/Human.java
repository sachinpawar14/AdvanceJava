package com.app;
public class Human {
	
	Heart heart;
	
	public Human()
	{
		System.out.println("Human Created");
	}

	public void setHeart(Heart heart) {
		System.out.println("In Setter of Heart");
		this.heart = heart;
	}

	public Human(Heart heart) {
		System.out.println("Paramterized Constructor Called");
		this.heart = heart;
	}

	public void pumping()
	{
		if(heart!=null)
		{
		heart.pump();
		}
		else
		{
			System.out.println("You are Dead!!");
		}
	}
	

}
