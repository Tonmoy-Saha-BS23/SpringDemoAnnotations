package com.bs23.SpringDemoAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CricketCoach implements Coach {
	private FortuneServices fortuneServices;
	
	// Constructor Injection
	@Autowired
	public CricketCoach(@Qualifier("restFortuneService") FortuneServices fortuneServices) {
		System.out.println("Inside Cricket Coach constructor");
		this.fortuneServices = fortuneServices;
	}
	
	public CricketCoach() {
		System.out.println("Inside default constructor of CicketCoach990");
	}
	
	// setter Injection
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneServices(FortuneServices fortuneServices) {
		System.out.println("Inside setter method for CricketCoach");
		this.fortuneServices = fortuneServices;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice Daily for 2 hours";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneServices.getFortuneService();
	}
	
	// define my init-method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Cricket : Inside do my startupstuff");
	}

	@PreDestroy
	public void doMyDestroyStuff() {
		System.out.println("Cricket: Inside do my domydestroystuff");
	}
}
