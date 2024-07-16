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
	
	
}
