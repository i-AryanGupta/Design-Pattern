package factory;

public class Swiggy extends Food{

	public Swiggy(String item) {
		super(item);
		
	}
	
	@Override
	public String getFoodType()
	{
		return this.item;
	}

}
