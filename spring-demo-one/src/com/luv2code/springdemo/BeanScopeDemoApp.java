package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//extract bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alfaCoach = context.getBean("myCoach", Coach.class);
		
		//check if beans are the same
		boolean result = (theCoach == alfaCoach);
		
		//print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alfaCoach: " + alfaCoach);
		
		//close configuration file
		context.close();

	}

}
