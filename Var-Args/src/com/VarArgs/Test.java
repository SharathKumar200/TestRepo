package com.VarArgs;

public class Test {
	public static void m1(int... x) {
		int total = 0;
		for (int x1 : x) {
			total = total + x1;
		}
		// System.out.println("number of var-arg method:" + x.length);
		System.out.println("sum of:" + total);
	}

	public static void main(String[] args) {

		m1();
		m1(10, 20);

		m1(10, 20, 30);
		m1(10, 20, 30, 40);

	}
}
