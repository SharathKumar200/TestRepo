package com.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class Treemapex3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<Integer, String>(new Mycomp());
		t.put(1, "sharath");
		t.put(3, "bhuvana");
		t.put(2, "brunda");
		t.put(4, "harish");

		t.put(10, "sharath");
		t.put(30, "bhuvana");
		t.put(20, "brunda");
		t.put(40, "harish");
		System.out.println(t);
	}

}

class Mycomp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return -o1.compareTo(o2);
	}

}