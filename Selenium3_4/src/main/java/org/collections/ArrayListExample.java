package org.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<Object>();
		System.out.println(list); // []
		System.out.println(list.size()); // 0
		System.out.println();
		list.add(1);
		list.add(10);
		list.add("Kunal");
		list.add("Chavan");
		list.add(true);
		list.add(3.14D);
		list.add(3.14F);
		list.add('K');
		list.add('K');
		list.add(null);
		System.out.println();
		System.out.println(list);
		System.out.println(list.size());

		// Fetch the values from a list

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		try {
			System.out.println(list.get(10));
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		// Remove values
		
		list.remove(5);
		System.out.println(list);
		System.out.println(list.size());
		/*
		 * for (int i = 0; i < list.size(); i++) { 
		 * System.out.println(list.get(i)); 
		 * }
		 */
		
		for(Object o:list) {
			System.out.println(o);
		}
		System.out.println();
		System.out.println();

		Iterator<Object> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(list.get(0));
		// int number = list.get(0); // Type mismatch: cannot convert from Object to int
		Object number = list.get(0);
		// System.out.println(20+number); // The operator + is undefined for the argument type(s) int, Object
		
		// Workaround is type casting
		int number1 = (int)list.get(0);
		System.out.println(20+number1);
	}
	

}
