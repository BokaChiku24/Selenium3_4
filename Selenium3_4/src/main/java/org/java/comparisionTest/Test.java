package org.java.comparisionTest;

public class Test {

	public static void main(String[] args) {
		String name1 = "Kunal";
		String name2 = "Kunal";
		
		System.out.println(name1==name2); // true
		System.out.println(name1.equals(name2)); // true
		
		int x = 100;
		int y = 100;
		
		System.out.println(x==y);// true
		
		/*
		 * == it is comparison operator - Object reference same and address same
		 * .equals() - content is same
		 */
		
		String name_1 = new String("Kunal");
		String name_2 = new String("Kunal");
		
		System.out.println(name_1.equals(name_2));// true - contain is same
		System.out.println(name_1==name_2);//false - address is different
	}

}
