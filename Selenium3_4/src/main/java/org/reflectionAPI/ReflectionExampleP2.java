package org.reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionExampleP2 {

	public void show() {

	}

	public void display() {

	}
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ReflectionExample obj = new ReflectionExample();
		Class test = obj.getClass();
		System.out.println(test.getSimpleName());
		System.out.println(test.getMethods());
		Constructor[] cons = test.getConstructors();
		for (Constructor co : cons) {
			System.out.println(co.getName());
		}
		Method[] t = test.getDeclaredMethods();
		System.out.println(t.length);

		for (Method m : t) {
			System.out.println(m.getName() + " : Return Type is -- " + m.getReturnType());
			Parameter[] params = m.getParameters();
			for (Parameter param : params) {
				System.out.println(param.getName());
			}
		}

		/*
		 * Test --> Object --> Class Object is already stored inside Class Method -->
		 * get or executed --> Method class store information Constructors --> Called
		 * --> Constructor class store information
		 * 
		 */

		// Selenium Scenario

		/*
		 * @BeforeMethod public void beforeMethod(Method m){
		 * 
		 * System.out.println("Test case executed is: " + m.getname());
		 * 
		 * }
		 * 
		 * @Test doLogin(String userName, String password){
		 * 
		 * }
		 * 
		 * @Test doUserReg(){
		 * 
		 * }
		 * 
		 */
	}

}
