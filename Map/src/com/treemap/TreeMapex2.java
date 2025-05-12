package com.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapex2 {

	public static void main(String[] args) {

		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		t.put(1, "sharath");
		t.put(3, "bhuvana");
		t.put(2, "brunda");
		t.put(4, "harish");

		t.put(10, "sharath");
		t.put(30, "bhuvana");
		t.put(20, "brunda");
		t.put(40, "harish");
		SortedMap<Integer, String> t1 = t.subMap(1, 30);
		TreeMap<Integer, String> t2 = new TreeMap<Integer, String>(t1);
		System.out.println(t2);

		SortedMap<Integer, String> t3 = t.tailMap(3);
		TreeMap<Integer, String> t4 = new TreeMap<Integer, String>(t3);
		System.out.println(t4);
		SortedMap<Integer, String> t6 = t.headMap(3);
		TreeMap<Integer, String> t5 = new TreeMap<Integer, String>(t6);
		System.out.println(t5);
	}

}
