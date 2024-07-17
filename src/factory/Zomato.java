package factory;

public class Zomato extends Food {
	
	public Zomato(String item) {
		super(item);
		
	}
	
	@Override
	public String getFoodType()
	{
		return this.item;
	}
}
