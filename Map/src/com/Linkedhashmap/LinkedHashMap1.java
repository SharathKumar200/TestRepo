package com.Linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<Emp, Student> ls = new LinkedHashMap<Emp, Student>();

		ls.put(new Emp(111, "sharath"), new Student(1, "bhuvana"));
		ls.put(new Emp(222, "harish"), new Student(1, "brunda"));

		Set<Emp> s = ls.keySet();
		/*
		 * for (Emp e : s) {
		 * 
		 * System.out.println(e.eid + " " + e.ename); }
		 */
		for (Emp e1 : ls.keySet()) {
			System.out.println(e1.eid + " " + e1.ename);
		}

		for (Student s3 : ls.values()) {
			System.out.println(s3.sid + " " + s3.sname);

			Set<Entry<Emp, Student>> s1 = ls.entrySet();

			Iterator<Entry<Emp, Student>> itr = s1.iterator();
			while (itr.hasNext()) {
				Entry<Emp, Student> e = itr.next();
				Emp ee = e.getKey();
				System.out.println(ee.eid + " " + ee.ename);

				Student sss = e.getValue();
				System.out.println(sss.sid + " " + sss.sid);
			}
		}
	}
}