package com.trioedge;

public class Assingment1 {

	double hoursWorked = 40.5;
	double hourlyRate = 12.4;
	double weeklypay;

	double calculateWeeklyPay(double hoursWorked, double hourlyRate) {

		double weeklyPay = hoursWorked * hourlyRate;

		return weeklyPay;

	}

	public static void main(String args[]) {

		Assingment1 obj = new Assingment1();

		double calculateWeeklyPay = obj.calculateWeeklyPay(obj.hoursWorked, obj.hourlyRate);

		System.out.printf(" weeklypay: %.2f%n", calculateWeeklyPay);

		System.out.printf(" hoursWorked: %.2f%n", obj.hoursWorked);
		System.out.printf("hourlyRate: %.2f%n", obj.hourlyRate);
	}
}
