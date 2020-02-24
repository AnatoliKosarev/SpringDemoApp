package com.luv2code.springdemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BasketballCoach implements Coach{
	
	// inject dependency from a properties file using annotation @Value
	@Value("${foo.email}")
	private String email;
	
	// inject dependency from a properties file using annotation @Value
	@Value("${foo.team}")
	private String team;
	
	private FortuneService fortuneService;
	
	@Autowired
	public BasketballCoach(@Qualifier("randomFileFortuneService") FortuneService fortuneService) {
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
		return email.toString() + "\n" + team;
	}
	
	

}
