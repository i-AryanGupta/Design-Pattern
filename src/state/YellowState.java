package state;

public class YellowState implements State {

	@Override
	public void handle(TrafficLight context) {
		
		System.out.println("Yellow light");
		context.setState(new GreenState());
		
	}

}
