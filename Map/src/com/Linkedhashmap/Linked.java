package com.Linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Linked {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Product> l = new LinkedHashMap<Integer, Product>();

		l.put(1, new Product(111, "pen"));

		l.put(2, new Product(222, "pen2"));
		l.put(3, new Product(333, "marker"));
		l.put(4, new Product(444, "pencil"));

		Set<Entry<Integer, Product>> s1 = l.entrySet();
		Iterator<Entry<Integer, Product>> ss = s1.iterator();

		while (ss.hasNext()) {
			Entry<Integer, Product> e = ss.next();
			Product p = e.getValue();

			if (p.pid == 111) {
				ss.remove();

			}
			for (Entry<Integer, Product> ee : l.entrySet()) {
				Product eee = e.getValue();
				System.out.println(eee.pid + " " + eee.pname);
			}

		}
	}

}
