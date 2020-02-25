package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// enables injecting dependencies from specified property file
@PropertySource("classpath:sport.properties")
public class SwimConfig {
	
	// define the bean for sadFortuneService
	// sadForuneService() - corresponds to bean id specified in swim coach injection
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define the bean for swim coach and inject dependencies for it
	// swimCoach() - corresponds to bean id specified in "Coach theCoach = context.getBean("swimCoach", Coach.class);" from main method
	@Bean
	public SwimCoach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
