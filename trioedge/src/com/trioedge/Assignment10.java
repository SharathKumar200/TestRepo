package com.trioedge;

public class Assignment10 {

	private double quantity;
	private double unitPrice;
	private double discountPrice;
	private double totalPrice;

	public Assignment10() {
		quantity = 20;
		unitPrice = 2000;
		discountPrice = 20;
	}

	void calculateBulkDiscount() {

		double discountPrice = unitPrice * (1 - unitPrice);
		double totalPrice = discountPrice * quantity;
		System.out.printf("Unit Price: $%.2f\n", unitPrice);
		System.out.printf("DiscountPrice: $%.2f\n", discountPrice);
		System.out.printf("TotalCost: $%.2f\n", totalPrice);

	}

	public static void main(String args[]) {

		Assignment10 obj = new Assignment10();
		obj.calculateBulkDiscount();

	}

}
