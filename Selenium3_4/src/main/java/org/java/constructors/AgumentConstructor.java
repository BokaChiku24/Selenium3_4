package org.java.constructors;

public class AgumentConstructor {

	String username;
	String password;
	
	public AgumentConstructor(String username, String password) {
		this.username = username;
		this.password = password;
		System.out.println("Username is: " + username + " " + "Password is: " + password);
	}
	
	public static void main(String[] args) {
		// AgumentConstructor obj = new AgumentConstructor(); // The constructor AgumentConstructor() is undefined
		AgumentConstructor obj = new AgumentConstructor("kchavan","Admin@123");
		System.out.println(obj.username);
		System.out.println(obj.password);

	}

}
