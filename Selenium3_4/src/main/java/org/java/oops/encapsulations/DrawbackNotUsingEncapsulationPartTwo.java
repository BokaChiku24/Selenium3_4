package org.java.oops.encapsulations;

public class DrawbackNotUsingEncapsulationPartTwo {

	public static void main(String[] args) {
		/*
		 * Now from this client class by using the object of the DrawbackNotUsingEncapsulation user can change
		 * the instance variable values
		 */
		DrawbackNotUsingEncapsulation obj = new DrawbackNotUsingEncapsulation();
		obj.accountAmount = 10000000;
		obj.withDrawAmount(1234, 23, 1400);
		obj.updatePin(1234, 23, 23);
	}

}
