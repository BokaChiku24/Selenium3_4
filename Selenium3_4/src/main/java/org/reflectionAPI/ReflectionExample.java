package org.reflectionAPI;

public class ReflectionExample {

	@SuppressWarnings("unused")
	private double show(int a, int b) {
		return 3.14D;
	}

	@SuppressWarnings("unused")
	private boolean display(int a, String name) {
		return true;
	}

	public static void main(String[] args) {
		ReflectionExample obj = new ReflectionExample();
		System.out.println(obj.getClass().getSimpleName());
	}

}
