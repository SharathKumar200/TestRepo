package com.Clonening;

public class Clone1 implements Cloneable {

	int a = 10;
	int b = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		Clone1 c = new Clone1();

		System.out.println(c.a);
		System.out.println(c.b);
		Clone1 c2 = (Clone1) c.clone();
		System.out.println(c2.a);
		System.out.println(c2.b);

	}

}
