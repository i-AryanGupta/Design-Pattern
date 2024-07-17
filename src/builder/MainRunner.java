package builder;

public class MainRunner {
	public static void main(String[] args) {
		Vehicle car = new Vehicle.VehicleBuilder("V8", 4).setAirbags(6).build();
		Vehicle bike  = new Vehicle.VehicleBuilder("650cc", 2).build();
		
		System.out.println(" Car engine: "+car.getEngine()+" Seats: "+car.getSeats()+ " Airbags "+ car.getAirbags());
		System.out.println(" Car engine: "+bike.getEngine()+" Seats: "+bike.getSeats()+ " Airbags "+ bike.getAirbags());
	}

}
