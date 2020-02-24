package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String teamName;
	private String emailAddress;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public void setTeamName(String teamName) {
		System.out.println("CricketCoach: inside setter method - setTeamName");
		this.teamName = teamName;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	//add init method
	public void doMyStartUpStuff() {
		System.out.println("Inside doMyStartUpStuff init method");
	}
	
	//add destroy method
	public void doMyCleanUpStuff() {
		System.out.println("Inside doMyCleanUpStuff destroy method");
	}
	
	
	
	
	
	
	

}
