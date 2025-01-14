package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.entity.TennisCoach;
import com.app.utility.Coach;

public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context =
    		   new AnnotationConfigApplicationContext(SpringConfig.class);
       TennisCoach coach= context.getBean("tennisCoach",TennisCoach.class);
       TennisCoach alphaCoach= context.getBean("tennisCoach",TennisCoach.class);
		/*
		 * System.out.println(coach.getDailyWorkout());
		 * System.out.println(coach.getFortune());
		 */
       
       System.out.println("Coach = "+coach);
       System.out.println("AlphaCoach = "+alphaCoach);
       
       System.out.println("coach == alphaCoach "+(coach == alphaCoach));
       
       context.close();
    }
}
