package com.spring_code;

public class TrackCoach implements Coach{
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	public String getDailyWorkout() {
		return "run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "hi";
	}
}

