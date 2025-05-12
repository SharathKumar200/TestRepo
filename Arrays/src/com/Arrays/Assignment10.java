//Write a program to find the second largest number in an integer array
package com.Arrays;

public class Assignment10 {
	public static void main(String[] args) {
		int[] numbers = { 12, 45, 7, 23, 56, 89, 34 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int number : numbers) {
			if (number > largest) {
				secondLargest = largest;
				largest = number;
			} else if (number > secondLargest && number < largest) {
				secondLargest = number;
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("No second largest number found");
		} else {
			System.out.println("Second largest number: " + secondLargest);
		}
	}
}
