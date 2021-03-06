package com.luv2code.springdemo;

public class HockeyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public HockeyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Ice skate practice for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return "Results of the hockey game: " + fortuneService.getFortune();
	}

}
