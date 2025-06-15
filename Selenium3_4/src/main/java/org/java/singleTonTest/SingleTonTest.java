package org.java.singleTonTest;

public class SingleTonTest {

	private static SingleTonTest instance = new SingleTonTest();
	
	private SingleTonTest() {
		System.out.println("Creating objects");
	}
	
	public static SingleTonTest getInstance() {
		return instance;
	}

}
