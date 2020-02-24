package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an empty list
	private List<String> list = new ArrayList<>();
	
	// create a random number generator
	private Random random = new Random();

	@Override
	public String getDailyFortune() {
		list.add("Beware of the wolf in sheep's clothing");
		list.add("Diligence is the mother of good luck");
		list.add("The journey is the reward");
		
		// picks a random int from the range = to list size
		int index = random.nextInt(list.size());
		
		String theFortune = list.get(index);
		
		return theFortune;
	}

}
