package delegate;

public class Manager {
	
	private Printer printer = new Printer();
	
	public void manage()
	{
		//manage task
	}
	
	public void print(String message)
	{
		printer.print(message);
	}
	
	
	// manager class before handling the printer logic.
	// new we created separate class for printer and passing the value from the manager class
	// by this we achieving Single responsibility
	
	public static void main(String[] args) {
		
		Manager manager = new Manager();
		manager.print("Hello");
	}

}
