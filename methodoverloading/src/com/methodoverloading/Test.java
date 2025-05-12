package com.methodoverloading;

public class Test {

	/*
	 * Method overloading in Java allows a class to have more than one method having
	 * the same name, if their parameter lists are different. This concept is
	 * fundamental in Java programming and is used extensively to create methods
	 * that perform similar tasks but with different types or numbers of parameters.
	 */

	void m1(int a, int b) {

		int sum = a + b;
		System.out.println("Result of m1(int, int, int): " + sum);

	}

	void m1(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Result of m1(int, int, int): " + sum);

	}

	public static void main(String args[]) {

		Test t = new Test();
		t.m1(10, 20);
		t.m1(10, 20, 30);

	}

}
