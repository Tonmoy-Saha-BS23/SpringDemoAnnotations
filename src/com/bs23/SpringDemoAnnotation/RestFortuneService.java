package com.bs23.SpringDemoAnnotation;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneServices {

	@Override
	public String getFortuneService() {
		return "RestFortuneService";
	}

}
