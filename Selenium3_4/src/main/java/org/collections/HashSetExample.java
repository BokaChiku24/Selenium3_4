package org.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Kunal");
		set.add("Chavan");
		set.add("Kunal");
		set.add("Selenium");
		System.out.println(set.size());
		System.out.println(set);

		// Fetch values

		for (String var : set) {
			System.out.println(var);
		}
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("Chavan"))
			System.out.println(itr.next());
		}
	}

}
