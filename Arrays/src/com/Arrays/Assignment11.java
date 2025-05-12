//Create two integer arrays of the same length. Write a program to compute the dot product of these arrays.
package com.Arrays;

public class Assignment11 {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 6, 7, 8, 9, 10 };

		int dotProduct = computeDotProduct(array1, array2);

		System.out.println("Dot product: " + dotProduct);
	}

	public static int computeDotProduct(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			throw new IllegalArgumentException("Arrays must be of the same length");
		}

		int dotProduct = 0;
		for (int i = 0; i < array1.length; i++) {
			dotProduct += array1[i] * array2[i];
		}

		return dotProduct;
	}
}
