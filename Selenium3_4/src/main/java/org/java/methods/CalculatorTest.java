package org.java.methods;

public class CalculatorTest {
	
	public int getSum(int num1, int num2) { // Parameters
		int result = num1 + num2;
		return result;
	}

	public int getSub(int num1, int num2) { // Parameters
		int result = num1 - num2;
		return result;
	}
	
	public int getMul(int num1, int num2) { // Parameters
		int result = num1 * num2;
		return result;
	}
	
	public int getdiv(int num1, int num2) { // Parameters
		int result = num1 / num2;
		return result;
	}
	
	public int getMod(int num1, int num2) { // Parameters
		int result = num1 % num2;
		return result;
	}
	
	public static void main(String[] args) {
		CalculatorTest calc = new CalculatorTest();
		int sum = calc.getSum(10, 14); // Arguments pass to the method
		System.out.println("Addition is: " + sum);
	}
	
}
