package state;

public class RedState implements State{

	@Override
	public void handle(TrafficLight context) {
		System.out.println("RedLight");
		context.setState(new YellowState());
	}

}
