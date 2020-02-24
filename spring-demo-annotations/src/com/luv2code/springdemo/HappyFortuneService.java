package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	public HappyFortuneService() {
		System.out.println("Inside HappyFortuneService constructor");
	}

	@Override
	public String getDailyFortune() {
		
		return "Today is your lucky day!";
	}

}