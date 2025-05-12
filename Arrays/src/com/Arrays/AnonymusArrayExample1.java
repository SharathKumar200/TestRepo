package com.Arrays;

public class AnonymusArrayExample1 {

	public static void main(String[] args) {
		//Sum(new int[] { 10, 20, 30, 40 });
		int[] myarray= {10, 20, 30, 40};
		Sum(myarray);
		
	}

	public static void Sum(int[] x) {
		int total = 0;
		for (int x1 : x) {
			total = total + x1;
			System.out.println("sum of :" + total);

		}

	}
}
