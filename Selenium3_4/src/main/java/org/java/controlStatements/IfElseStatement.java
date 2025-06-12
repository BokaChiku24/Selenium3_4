package org.java.controlStatements;

public class IfElseStatement {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 20);
		System.out.println(num);

		if (num > 10) {
			System.out.println(num + " is greater than 10 ");
		} else if (num > 10 && num < 15) {
			System.out.println(num + " is between 10 ");
		} else {
			System.out.println(num + " is less than 10 ");
		}
	}

}
