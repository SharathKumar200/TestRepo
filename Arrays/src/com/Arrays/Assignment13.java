//Create a program that finds and prints all pairs of integers in an array whose sum is equal to a given number.
package com.Arrays;

import java.util.Arrays;

public class Assignment13 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int targetSum = 10;

		System.out.println("Pairs with sum " + targetSum + ":");

		findPairs(array, targetSum);
	}

	public static void findPairs(int[] array, int targetSum) {
		Arrays.sort(array);

		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			int currentSum = array[left] + array[right];

			if (currentSum == targetSum) {
				System.out.println(array[left] + " + " + array[right] + " = " + targetSum);
				left++;
				right--;
			} else if (currentSum < targetSum) {
				left++;
			} else {
				right--;
			}
		}
	}
}
