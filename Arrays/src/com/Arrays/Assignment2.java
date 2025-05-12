//2. Write a program to find the sum of all elements in an integer array.
package com.Arrays;

public class Assignment2 {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("sum of given arrays:" + sum);

	}

}
