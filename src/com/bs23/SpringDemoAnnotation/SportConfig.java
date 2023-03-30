package com.bs23.SpringDemoAnnotation;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
//@ComponentScan("com.bs23.SpringDemoAnnotation")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	//Define bean for our sad fortune service
	@Bean
	public FortuneServices sadFortuneServices() {
		return new SadFortuneService();
	}
	
	// Define bean for our swim coach
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneServices());
	}

}
