package state;

public class GreenState implements State{

	@Override
	public void handle(TrafficLight context) {
		System.out.println("Green Light");
		context.setState(new RedState());
	}
	

}
