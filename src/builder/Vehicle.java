package builder;

public class Vehicle {

	private String engine;
	private int seats;
	
	//optional
	private int airbags;

	public Vehicle(VehicleBuilder builder) {
		this.engine = builder.engine;
		this.seats = builder.seats;
		this.airbags = builder.airbags;
	}

	public String getEngine() {
		return engine;
	}

	public int getSeats() {
		return seats;
	}

	public int getAirbags() {
		return airbags;
	}
	
	public static class VehicleBuilder{
		
		private String engine;
		private int seats;
		
		private int airbags;

		public VehicleBuilder(String engine, int seats) {
			super();
			this.engine = engine;
			this.seats = seats;
		}

		public VehicleBuilder setAirbags(int airbags) {
			this.airbags = airbags;
			return this;
		}
		
		public Vehicle build() {
		return new Vehicle(this);
		}	
		
	}
	
	
	// create a static nested class which contain the all the arguments of outer class
	
	//the main class has private constructor so to create the instance only via Builder class
	
	// builder can have the public constructor with all required parameters
	
	// for optional parameter we have setter method in builder class
	
	// the main class 'Vehicle' has only the getter method because through setter anyone can change
	// the value outside.
	
}
