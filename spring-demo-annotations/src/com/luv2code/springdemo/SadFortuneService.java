package com.luv2code.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Not so good today";
	}

}
