package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// if no name specified like "thatSillyCoach" in @Component("thatSillyCoach")- default name will be generated = "tennisCoach"
@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	// making dependency injection for fortuneService field with the use of "reflection"
	// Spring will find the bean that implements FortuneService and inject it into field
	// so no setter method for this field is required anymore
	// if several classes implement required interface - the bean specified in @Qualifier("") will be injected
	/*@Autowired
	@Qualifier("randomFortuneService")*/
	private FortuneService fortuneService;
	
	// creating default constructor
	public TennisCoach() {
		System.out.println("<<TennisCoach: Inside default constructor ");
	}
	
	// Spring will find the bean that implements FortuneService and inject it into constructor
	// if several classes implement required interface - the bean specified in @Qualifier("") will be injected 
	// note that for constructor @Qualifier annotation has to be specified inside of the constructor arguments
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		System.out.println("Inside TennisCoach constructor");
		this.fortuneService = fortuneService;
	}
	
	// creating setter method
	// Spring will find the bean that implements FortuneService and inject it into setter method
	// if several classes implement required interface - the bean specified in @Qualifier("") will be injected
	/*@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("<<TennisCoach: Inside setFortuneService() method ");
		this.fortuneService = fortuneService;
	}
	*/
	
	// performed after bean creation, constructor, dependency injections (setter methods)
	@PostConstruct
	public void doMyInitMethod() {
		System.out.println("Inside TennisCoach init method");
	}
	

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	
	// performed before bean destruction
	// not performed automatically for prototype beans - can be done only with the use of bean post-processor, which should implement DisposableBeans interface
	@PreDestroy
	public void doMyDestroyMethod() {
		System.out.println("Inside TennisCoach destroy method");
	}

}
