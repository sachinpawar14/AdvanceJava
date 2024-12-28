package com.app.entity;

import org.springframework.stereotype.Component;

import com.app.utility.FortuneService;

@Component
public class BasicFortuneService implements FortuneService{

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "Unlucky!!!";
	}
	
	

}
