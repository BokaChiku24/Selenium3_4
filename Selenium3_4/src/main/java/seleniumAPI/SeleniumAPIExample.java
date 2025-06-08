package seleniumAPI;

public class SeleniumAPIExample {
	/*
	 * Here SeleniumAPIExample is the API. Create a jar file and import it any other 
	 * project. By using it other project can access this method or they can also 
	 * contribute it.
	 * Export it by using Java .jar file 
	 * Create a new project and add these .jar file as reference libraries
	 * User can access all methods from this class to other project
	 * This .jar file will be API to other project
	 */

	public SeleniumAPIExample() {
		System.out.println("Default Constructor..");
	}
	
	public void add() {
		System.out.println("Addition..");
	}
	
	public void sub() {
		System.out.println("Subtraction..");
	}
	
	public void mul() {
		System.out.println("Multiplication..");
	}
	
	public void div() {
		System.out.println("Division..");
	}
	
	public static void main(String[] args) {
		// By default compiler call the default constructor for user
		SeleniumAPIExample obj = new SeleniumAPIExample(); // Calling Default Constructor
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}

}
