package com.SortingComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>();

		al.add(new Emp(111, "sharath"));
		al.add(new Emp(555, "bhuvana"));
		al.add(new Emp(222, "brunda"));
		al.add(new Emp(888, "harish"));

		Collections.sort(al, new Eidcomp());

		for (Emp e : al) {
			System.out.println(e.eid + " " + e.ename);
		}

	}

}
