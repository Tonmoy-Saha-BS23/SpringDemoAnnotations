package com.bs23.SpringDemoAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	private FortuneServices fortuneServices;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public SwimCoach(FortuneServices fortuneServices) {
		this.fortuneServices = fortuneServices;
	}
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters daily";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneServices.getFortuneService();
	}

}
