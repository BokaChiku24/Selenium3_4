package org.java.oops.encapsulations;

public class Encapsulations {

	/*
	 * Encapsulation: Data Binding, Wrapping Data and Methods in single unit
	 * Encapsulation is used for security Encapsulation is used for data hiding,
	 * abstraction Data Hiding: Hiding the data from outside world so that they are
	 * not directly accessible Abstraction: Force calling those variables using
	 * methods (Create variable as private and to call those variable from other
	 * class they need to use methods)
	 */

	private int accountNo = 1234;
	private int accountPin = 23;
	private int accountAmount = 12000;
	
	public void withDrawAmount(int accountNumber, int accountPin, int accountAmount) {
		if (this.accountNo == accountNumber && this.accountPin == accountPin) {
			if (this.accountAmount > accountAmount) {
				System.out.println("Welcome to the withdraw functionality !!");
				this.accountAmount = this.accountAmount - accountAmount;
			} else {
				System.out.println("Don't have sufficient amount");
			}
		} else {
			System.out.println("Invalid account details !!");
		}
		System.out.println("New balanace is: " + this.accountAmount);
	}

	public void updatePin(int accountNumber, int accountPin, int accountNewPin) {
		if (this.accountNo == accountNumber && this.accountPin == accountPin) {
			System.out.println("Welcome to the PIN Update functionality !!");
			int tempAccountPin = accountPin;
			this.accountPin = accountNewPin;
			if (tempAccountPin == accountNewPin) {
				System.out.println("Old Pin is not acceptable");
			} else {
				System.out.println("Pin change successfully");
				System.out.println("New Pin is: " + accountPin);
			}
		}
	}

	public void depositAmount(int accountNumber, int accountPin, int accountAmount) {
		if (this.accountNo == accountNumber && this.accountPin == accountPin) {
			System.out.println("Welcome to the deposit functionality !!");
			this.accountAmount = this.accountAmount + accountAmount;
			System.out.println("Updated balance is: " + this.accountAmount);
		} else {
			System.out.println("Invalid account details !!");

		}
	}
}
