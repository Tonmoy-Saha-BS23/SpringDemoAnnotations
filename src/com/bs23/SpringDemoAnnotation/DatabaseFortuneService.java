package com.bs23.SpringDemoAnnotation;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneServices {

	@Override
	public String getFortuneService() {
		return "DatabaseFortuneService";
	}

}
