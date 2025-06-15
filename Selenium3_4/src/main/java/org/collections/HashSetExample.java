package org.collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Kunal");
		set.add("Chavan");
		set.add("Kunal");
		set.add("Selenium");
		System.out.println(set.size());
		System.out.println(set);
	}

}
