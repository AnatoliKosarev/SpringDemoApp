package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class ("SportConfig.class")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call method on retrieved bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
				
		// close spring container
		context.close();
	}

}
