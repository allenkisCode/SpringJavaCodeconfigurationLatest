package com.springjavaconfig.entities;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Configurationclass.class);
		
		
		//ctx.refresh();
		
		Coach c = ctx.getBean("getCoach", Coach.class);
		
		System.out.println(c.getFortune());
		
		System.out.println(c.getDeatils());
		
		ctx.close();

	}

}
