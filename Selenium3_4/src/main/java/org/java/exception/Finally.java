package org.java.exception;

public class Finally {

	public static void main(String[] args) {

		// Scenario 1

		try {

			// DB Connection - Success
			// Execute some queries - Exception occurs
			// Validating the data and compare from websites - Code not execute
			// Closing connection - Code not execute

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing the DB connection");
		}

	}

}
