package org.java.polymorphism;

public class OverridingP2 extends OverridingP1 {

	public double getHomeLoanROIHDFC() {
		return 7.5D;
	}

	public double getCarLoanROIRBI() {
		return 9.5D;
	}

	public Integer show() {
		return 10;
	}
	
	public Number display() {
		return 10F; // Number class is parent of the Float class
	}
	
	// Selenium Scenario
	// WebDriver driver = new FirefoxDriver(); driver: Polymorphic Reference

	public static void main(String[] args) {
		OverridingP2 obj = new OverridingP2();
		double homeLoanInterest = obj.getHomeLoanROIHDFC();
		double carLoanInterest = obj.getCarLoanROIRBI();
		System.out.println("Home Loan Interest: " + homeLoanInterest);
		System.out.println("Car Loan Interest: " + carLoanInterest);

	}

}
