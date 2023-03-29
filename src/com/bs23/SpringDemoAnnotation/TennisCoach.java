package com.bs23.SpringDemoAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneServices fortuneServices;
	
	public TennisCoach() {
		System.out.println("Inside Tennnis coach deafult constructor");
	}
	@Override
	public String getDailyWorkout() {
		return "Tennis: Practice Daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneServices.getFortuneService();
	}

}
