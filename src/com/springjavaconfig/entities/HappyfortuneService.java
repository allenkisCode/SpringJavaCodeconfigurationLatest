package com.springjavaconfig.entities;

public class HappyfortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is my Lucky day";
	}

}
