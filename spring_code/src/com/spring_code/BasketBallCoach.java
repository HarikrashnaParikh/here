package com.spring_code;

public class BasketBallCoach  implements Coach{
	
	//define a private field for the dependency
		private FortuneService fortuneService;
		
		//define a constructor  for dependency injection
		public BasketBallCoach(FortuneService thefortuneService)
		{
			fortuneService = thefortuneService;
		}
		
		@Override	
		public String getDailyWorkout()
		{
			return "Spend 30 mins on batting practice";
		}
	
		@Override
		public String getDailyFortune() {
			//use my Fortuneservice to get a fortune
			return fortuneService.getFortune();
		}
		


}
