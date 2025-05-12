//Write a program to count how many times a specific number appears in an integer array.

package com.Arrays;

public class Assignment8 {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 3, 2, 4, 2, 5, 2, 6 };
		int target = 3;

		int count = countOccurrences(numbers, target);

		System.out.println("The number " + target + " appears " + count + " times in the array.");

	}

	public static int countOccurrences(int[] numbers, int target) {
		int count = 0;
		for (int number : numbers) {
			if (number == target) {
				count++;
			}
		}
		return count;
	}
}
