package com.bs23.SpringDemoAnnotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneServices {
	
	public HappyFortuneService() {
		System.out.println("Inside happy fortune service constructor!");
	}
	@Override
	public String getFortuneService() {
		return "Have a good day!";
	}

}
