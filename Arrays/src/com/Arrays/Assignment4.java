//4. Write a program to find the largest number in an integer array
package com.Arrays;

public class Assignment4 {
	public static int findLargest(int[] numbers) {
		int largest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		int[] numbers = { 12, 33, 7, 23, 80, 90, 40 };
		int largest = findLargest(numbers);
		System.out.println("The largest number is: " + largest);
	}
}
