package com.treemap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Treemapex4 {

	public static void main(String[] args) {
		TreeMap<Product, Coustmer> t = new TreeMap<Product, Coustmer>(new MyComp1());

		t.put(new Product(1, "pen"), new Coustmer(1, "sharath"));
		t.put(new Product(3 , "pendsf"), new Coustmer(2, "kumar"));
		t.put(new Product(2, "penpencil"), new Coustmer(3, "bhuvana"));
		Set<Product> t1 = t.keySet();
		for (Product p : t1) {
			System.out.println(p.pid + " " + p.pname);
		}

	}

}

class MyComp1 implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {

		return -p1.pid.compareTo(p1.pid);
	}

}