//Write a program to remove duplicates from a sorted integer array.
package com.Arrays;

public class Assignment14 {
	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 2, 2, 3, 4, 4, 5, 6, 6 };

		System.out.println("Original array:");
		printArray(array);

		int[] uniqueArray = removeDuplicates(array);

		System.out.println("Array with duplicates removed:");
		printArray(uniqueArray);
	}

	public static int[] removeDuplicates(int[] array) {
		if (array.length == 0) {
			return array;
		}

		int writeIndex = 1;

		for (int readIndex = 1; readIndex < array.length; readIndex++) {
			if (array[readIndex] != array[readIndex - 1]) {
				array[writeIndex] = array[readIndex];
				writeIndex++;
			}
		}

		int[] uniqueArray = new int[writeIndex];
		System.arraycopy(array, 0, uniqueArray, 0, writeIndex);

		return uniqueArray;
	}

	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
