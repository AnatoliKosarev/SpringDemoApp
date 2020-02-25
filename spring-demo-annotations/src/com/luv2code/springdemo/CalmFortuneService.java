package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//@Component
public class CalmFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
	
		return "Keep calm and carry on";
	}

}
