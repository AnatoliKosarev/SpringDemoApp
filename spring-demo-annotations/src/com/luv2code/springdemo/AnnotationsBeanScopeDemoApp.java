package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alfaCoach = context.getBean("tennisCoach", Coach.class);
		
		// beans pointing to the same object?
		System.out.println((theCoach == alfaCoach));
		System.out.println(theCoach);
		System.out.println(alfaCoach);
		
		// closing spring container
		context.close();
		
		

	}

}
