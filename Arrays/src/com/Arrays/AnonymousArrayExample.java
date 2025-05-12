package com.Arrays;

public class AnonymousArrayExample {
	public static void main(String[] args) {
		// Calling the method with an anonymous array
		printArray(new int[] { 10, 20, 30, 40, 50 });
	}

	// Method that takes an integer array as a parameter
	public static void printArray(int[] array) {
		System.out.println("Array elements:");
		for (int value : array) {
			System.out.println(value);
		}
	}
}
