//Write a program to reverse the elements of an integer array.
package com.Arrays;

public class Assignment6 {

	public static void reverseArray(int[] array) {
		int start = 0;
		int end = array.length - 1;

		while (start < end) {

			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;

			start++;
			end--;
		}
	}

	public static void printArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50 };

		System.out.println("Original array:");
		printArray(numbers);

		reverseArray(numbers);

		System.out.println("Reversed array:");
		printArray(numbers);
	}

}
