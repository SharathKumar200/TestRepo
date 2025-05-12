package com.pattern;

public class SimplePaterrn {
	int i;
	int j;
	int n = 5;

	void pattern() {
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		SimplePaterrn simplePaterrn = new SimplePaterrn();
		simplePaterrn.pattern();

	}

}
