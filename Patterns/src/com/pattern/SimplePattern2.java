package com.pattern;

public class SimplePattern2 {
	int i;
	int j;
	int n = 8;

	void pattern() {
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*" );
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		SimplePattern2 pattern2 = new SimplePattern2();
		pattern2.pattern();
	}

}
