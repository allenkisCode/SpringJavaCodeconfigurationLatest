package com.springjavaconfig.entities;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan(basePackages={"com.springjavaconfig.entities"})
@PropertySource("classpath:sport.properties")
public class Configurationclass {

	@Bean
	public FortuneService fortuneService(){
		return new HappyfortuneService();
	}
	
	@Bean
	public Coach getCoach(){
		
		System.out.println("Coach in java");
		BaseballCoach baseball = new BaseballCoach(fortuneService());
		return baseball; 
		
	}
}
