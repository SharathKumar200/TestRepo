package com.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<Integer, String>();

		hs.put(111, "sharath");
		hs.put(222, "bhuvana");
		hs.put(333, "harish");
		hs.put(444, "brunda");

		System.out.println(hs);

		Set<Integer> s = hs.keySet();
		System.out.println(s);
		Collection<String> v = hs.values();
		System.out.println(v);

		Set<Entry<Integer, String>> s1 = hs.entrySet();
		for (Entry<Integer, String> ss : s1) {

			System.out.println(ss);
		}
	}
}
