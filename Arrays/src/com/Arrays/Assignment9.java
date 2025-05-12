//Create a 2D integer array representing a 3x3 matrix. Fill it with user input and then print the matrix.
package com.Arrays;

import java.util.Scanner;

public class Assignment9 {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter elements of the 3x3 matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Matrix:");
		printMatrix(matrix);
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
