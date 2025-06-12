package org.java.loop;

public class ForLoop {

	public static void main(String[] args) {

		/*
		 * 
		 * while --> when the number of iterations are unknown 
		 * For --> number of iterations are known 
		 * do While --> at least for one time irrespective of the condition
		 * 
		 */

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);
			i++;

		}
		
		
		System.out.println("*******************");
		
		int j = 0;
		
		for (;j <= 10;) {

			System.out.println(j);
			j++;

		}
		
		
		/* Infinite for loop: 
		 * 
		 * for (int i = 1; i <= 10;) {
		 * 
		 * System.out.println(i);
		 * 
		 * }
		 */
		
		/* Infinite for loop: 
		 * 
		 * for (int i = 1;;) {
		 * 
		 * System.out.println(i);
		 * 
		 * }
		 */
		
		/* Infinite for loop: 
		 * 
		 * for (int i = 1;true;) {
		 * 
		 * System.out.println(i);
		 * 
		 * }
		 */
		
		/* Infinite for loop: 
		 * 
		 * for (;;) {
		 * 
		 * System.out.println("Inside the For loop");
		 * 
		 * }
		 */
	}

}
