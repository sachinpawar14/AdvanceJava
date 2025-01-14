package com.app.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.app.utility.Coach;
import com.app.utility.FortuneService;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Scope("singleton")
@Scope("prototype")
public class TennisCoach implements Coach {

	//@Autowired
	//@Qualifier("basicFortuneService")
	FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("In Default TennisCoach");
	}

	
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	@PostConstruct
	public void startupCode()
	{
		System.out.println("In Custom Init "+fortuneService.getClass());
	}
	
	@PreDestroy
	public void cleanupCode()
	{
		System.out.println("In CleanupCode "+fortuneService.getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5km";
	}
	
	public String getFortune()
	{
		return "Your Fortune = "+fortuneService.getFortuneService();
	}

}
