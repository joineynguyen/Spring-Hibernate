package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach 
{
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach()
	{
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	/*
	public TennisCoach(FortuneService theFortuneService)
	{
		this.fortuneService = theFortuneService;
	}
	*/
	
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() 
	{
		return "Practice swing.";
	}

	@Override
	public String getDailyFortune() 
	{	
		return fortuneService.getFortune();
	}

}
