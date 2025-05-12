package com.trioedge;

public class Assignment6 {

	private double customerPurchases;
	private double discountThreshold;
	private boolean isEligible;

	public Assignment6() {
		customerPurchases = 10;
		discountThreshold = 0.05;
	}

	void isEligibleForDiscount() {

		if (customerPurchases >= discountThreshold) {
			isEligible = true;
		} else {
			isEligible = false;
		}

		System.out.printf("customerPurchases: $%.2f\n", customerPurchases);
		System.out.printf("discountThreshold: $%.2f\n", discountThreshold);
		System.out.printf("isEligible for Discont:" + isEligible);
	}

	public static void main(String args[]) {

		Assignment6 obj = new Assignment6();
		obj.isEligibleForDiscount();

	}

}
