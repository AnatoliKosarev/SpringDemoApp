package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HockeyCoachScopeTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hockeyBeanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alfaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alfaCoach);
		
		System.out.println("\nObjects point to the same bean: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alfaCoach: " + alfaCoach);
		
		context.close();
		

	}

}
