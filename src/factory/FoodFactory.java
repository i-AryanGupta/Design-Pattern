package factory;

public class FoodFactory {
	
	public static Food getInstance(int type, String foodType)
	{
		switch(type)
		{
			case 1: return new Swiggy(foodType);
			
			case 2: return new Zomato(foodType);
			
			default: return null;
		}
		
		// Used when we have multiple sub-classes of a super class & based on input we want
		// to return one class instance
	}

}
