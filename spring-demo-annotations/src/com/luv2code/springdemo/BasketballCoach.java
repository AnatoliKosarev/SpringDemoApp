package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
	
	// inject dependency from a properties file using annotation @Value
	@Value("foo.email")
	private String email;
	
	// inject dependency from a properties file using annotation @Value
	@Value("foo.team")
	private String team;
	
	private FortuneService fortuneService;
	
	@Autowired
	public BasketballCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		System.out.println("Inside BasketballCoach constructor");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Work on your dribbling skills";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	
	public String getEmailAndTeam() {
		return email + "\n" + team;
	}
	
	

}
