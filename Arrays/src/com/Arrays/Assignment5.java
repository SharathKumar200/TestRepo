//Create an array of 10 integers and print only the even numbers from the array.

package com.Arrays;

public class Assignment5 {
	public static void main(String[] args) {
		int[] evennumber = { 10, 20, 30, 45, 55, 12, 13, 34, 23, 45 };

		for (int arr : evennumber) {
			if (arr % 2 == 0) {
				System.out.println(arr);
			}

		}
	}

}
