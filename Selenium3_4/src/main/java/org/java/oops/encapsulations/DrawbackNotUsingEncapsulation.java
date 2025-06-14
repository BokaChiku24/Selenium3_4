package org.java.oops.encapsulations;

public class DrawbackNotUsingEncapsulation {

	public int accountNo = 1234;
	public int accountPin = 23;
	public int accountAmount = 12000;

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
			accountPin = accountNewPin;
			if (tempAccountPin == accountNewPin) {
				System.out.println("Old Pin is not acceptable");
			} else {
				System.out.println("Pin change successfully");
				System.out.println("New Pin is: " + accountPin);
			}
		}
	}
}
