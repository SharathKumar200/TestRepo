//7. Create a character array with the letters of your name. Print the array in reverse order.

package com.Arrays;

public class Assignment7 {
	public static void reverseArray(char[] array) {
		int start = 0;
		int end = array.length - 1;

		while (start < end) {

			char temp = array[start];
			array[start] = array[end];
			array[end] = temp;

			start++;
			end--;
		}
	}

	public static void printArray(char[] array) {
		for (char c : array) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		char[] name = { 's', 'h', 'a', 'r', 'a', 't', 'h' };

		System.out.println("Original array:");
		printArray(name);

		reverseArray(name);

		System.out.println("Reversed array:");
		printArray(name);
	}

}
