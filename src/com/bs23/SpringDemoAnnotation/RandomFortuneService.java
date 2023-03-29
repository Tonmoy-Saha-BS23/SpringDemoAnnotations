package com.bs23.SpringDemoAnnotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneServices {
	private String []text = {
			"Have a good day", 
			"Nice Day ahead",
			"Enjoy your Day"
	};
	private Random random = new Random();
	@Override
	public String getFortuneService() {
		int index = random.nextInt(text.length);
		return text[index];
	}

}
