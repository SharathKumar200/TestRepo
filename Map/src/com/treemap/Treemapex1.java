package com.treemap;

import java.util.TreeMap;

public class Treemapex1 {

	public static void main(String[] args) {
		TreeMap<String, Integer> t = new TreeMap<String, Integer>();
		t.put("sharath", 1);
		t.put("bhuvana", 2);
		t.put("brunda", 3);
		t.put("harish", 4);

		System.out.println(t);

		TreeMap<String, Integer> t1 = new TreeMap<String, Integer>(/* t */);
		t1.putAll(t);
		t1.put("kumar", 7);

		System.out.println(t1);
	}

}
