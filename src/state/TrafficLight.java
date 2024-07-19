package state;

public class TrafficLight {
	
	private State state;

	public TrafficLight() {
		state = new RedState();
	}
	
	public void setState(State st)
	{
		state = st;
	}
	
	public void change()
	{
		state.handle(this);
	}
	
	// Before
	/*  we can do all this with the if else in a single class but it violates the SOLID principle
	 	Now we created state interface based on that the state is changing like red -> yellow -> green
		he TrafficLightContext class delegates state-specific behavior to the current state object, 
		improving readability and maintainability. */

}
