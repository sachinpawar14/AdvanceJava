package com.app.entity;

import org.springframework.stereotype.Component;

import com.app.utility.FortuneService;

@Component
public class RandomFortuneService implements FortuneService{
	
	public RandomFortuneService()
	{
		System.out.println("In Default RandomFortuneService");
	}

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "Today is your Lucky Day";
	}

}