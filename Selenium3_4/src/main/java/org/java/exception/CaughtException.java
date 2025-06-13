package org.java.exception;

public class CaughtException {

	public static void main(String[] args) throws InterruptedException {
		try {
			Thread.sleep(1000); // Unhandled exception type InterruptedException
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(1000);
	}

}
