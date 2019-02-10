package com.springjavaconfig.entities;

import org.springframework.beans.factory.annotation.Value;

public class BaseballCoach implements Coach{

	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String name;
	
	
	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailywork(){
		return "called from baseball"; 
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	}
	
	public String getDeatils(){
		return email+"..."+name;
	}
}
