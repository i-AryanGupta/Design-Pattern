package factory;

public class Food {
	
	String item;
	
	
	
	public Food(String item) {
		this.item = item;
	}

	public String getFoodType()
	{
		return this.item;
	}

}
