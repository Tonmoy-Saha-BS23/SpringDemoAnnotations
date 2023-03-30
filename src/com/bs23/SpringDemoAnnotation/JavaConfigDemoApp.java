package com.bs23.SpringDemoAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// Read the java configuration file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// getting a CricketCoachbean
		Coach coach = context.getBean("cricketCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		
		// Dependency Injection for CricketCoach
		Coach coach2 = context.getBean("cricketCoach", Coach.class);
		System.out.println(coach2.getDailyWorkout());
		System.out.println(coach2.getDailyFortune());
		
		//scope singleton check
		boolean checker = (coach == coach2);
		System.out.println("\nSingleton\n----------\n The both object are same: " + checker);
		
		Coach coach3 = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach3.getDailyWorkout());
		System.out.println(coach3.getDailyFortune());
		
		Coach coach4 = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach4.getDailyWorkout());
		System.out.println(coach4.getDailyFortune());
		
		//scope prototype check
		checker = (coach3 == coach4);
		System.out.println("\nPrototype\n----------\n The both object are same: " + checker);
		
		
		context.close();
	}

}
