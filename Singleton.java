//This is a Singleton Code Example:
//Singleton pattern is one of the simplest design patterns in Java. 
// This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
// Its the process of instancing only one object of the class and its done by:
// declaring the constrctor private, and making the get/instance method to call the same object each time.
// one of its example is the database connection.
public class Singleton {

	private static Singleton single_instance = null;

  //private constructor so no one can instantiate it
	private Singleton() {
		
	}

  //getInstance method
	public static Singleton getInstance() {
		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}

}
