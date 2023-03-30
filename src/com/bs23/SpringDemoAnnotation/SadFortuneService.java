package com.bs23.SpringDemoAnnotation;

public class SadFortuneService implements FortuneServices {

	@Override
	public String getFortuneService() {
		return "Today is a bad day!";
	}

}
