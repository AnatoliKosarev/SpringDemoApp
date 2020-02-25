package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySource("classpath:sport.properties")
//@ComponentScan("com.luv2code.springdemo")
public class KickerConfig {

	@Bean
	public FortuneService calmFortuneService() {
		return new CalmFortuneService();
	}
	
	@Bean
	public KickerCoach kickerCoach() {
		return new KickerCoach(calmFortuneService());
	}

}
