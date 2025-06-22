package org.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("username", 1234);
		map.put("password", 2424);
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("password"));
		System.out.println(map.get("OTP")); // return -- null
		
		// Fetch values
		Set<String> key = map.keySet();
		
		for(String keys : key) {
			System.out.println("Key is: " + key + " : " + "value is: " + map.get(keys));
		}
		
		Map<String,List<String>> map1 = new HashMap<String,List<String>>();
		List<String> listOfEmails = new ArrayList<String>();
		listOfEmails.add("k.chavan@crif.com");
		listOfEmails.add("k.chavan2@crif.com");
		listOfEmails.add("k.chavan3@crif.com");
		listOfEmails.add("k.chavan4@crif.com");
		map1.put("email", listOfEmails);
		System.out.println(map1);
		Set<String> set = map1.keySet();
		
		for(String keys : set) {
			System.out.println("Key is: " + set + " : " + "value is: " + listOfEmails);
			System.out.println(keys);
		}
	}

}
