package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	List<String> fortuneList = new ArrayList();	
	//creating random value between 0 and 2
	//casting to int is needed because random() returns double
	//private int random = (int)(Math.random()*3);
	private Random random = new Random();

	@Override
	public String getFortune() {
		fortuneList.add("You are lucky!");
		fortuneList.add("Better luck next time!");
		fortuneList.add("It's a draw");
		
		int index = random.nextInt(fortuneList.size());
		
		return fortuneList.get(index);
	}

}
