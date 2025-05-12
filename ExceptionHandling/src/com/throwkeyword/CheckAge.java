package com.throwkeyword;

import java.util.*;

public class CheckAge {

	// Method to check age and throw custom exception if not eligible
	/*
	 * static void status(int age) throws InvalidAgeException { if (age > 20) {
	 * System.out.println("Eligible"); } else { throw new InvalidAgeException(); } }
	 * 
	 * public static void main(String[] args) throws InvalidAgeException { Scanner
	 * sc = new Scanner(System.in); System.out.println("Enter your age:"); int age =
	 * sc.nextInt();
	 * 
	 * 
	 * // Call the status method to check age eligibility CheckAge.status(age);
	 * 
	 * // Catching the custom exception and handling it
	 * //System.out.println("Caught InvalidAgeException: " + e.getMessage()); } }
	 */

	// PARAMETER CONSTRUCTER
	static void status(int age) throws InvalidAgeException {
		if (age > 20) {
			System.out.println("Eligible");
		} else {
			throw new InvalidAgeException("your not eligiable");
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();

		// Call the status method to check age eligibility
		CheckAge.status(age);

		// Catching the custom exception and handling it
		// System.out.println("Caught InvalidAgeException: " + e.getMessage());
	}
}
