package com.trioedge;

public class Assignment11 {

	private double salesAmount;
	private double commissionRate;
	private double totalCommission;

	public Assignment11() {
		salesAmount = 1000;
		commissionRate = 12;
	}

	void calculateCommission() {

		double totalcommission = salesAmount * commissionRate;

		System.out.printf("salesAmount: %.2f\n", salesAmount);
		System.out.printf("commissionRate: %.2f\n", commissionRate);
		System.out.printf("totalcommission: %.2f\n", totalcommission);

	}

	public static void main(String args[]) {
		Assignment11 obj = new Assignment11();

		obj.calculateCommission();
	}

}
