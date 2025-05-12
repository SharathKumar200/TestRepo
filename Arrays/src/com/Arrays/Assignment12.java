//Write a program that rotates the elements of an array to the right by k positions.

package com.Arrays;

public class Assignment12 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int k = 4;

		System.out.println("Original array:");
		printArray(array);

		rotateArray(array, k);

		System.out.println("Rotated array:");
		printArray(array);
	}

	public static void rotateArray(int[] array, int k) {
		k = k % array.length;

		reverseArray(array, 0, array.length - 1);
		reverseArray(array, 0, k - 1);
		reverseArray(array, k, array.length - 1);
	}

	public static void reverseArray(int[] array, int start, int end) {
		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}

	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
