package singleton;

public class Singleton {
	
	private static Singleton instance = null;
	
	private Singleton() {}
	
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
		}
		
		return instance;
	}
	
	//making the constructor private
	//using static global variable
	// using static method to creating the object of Singleton class
	//In main method, the object create by static method calling

}
