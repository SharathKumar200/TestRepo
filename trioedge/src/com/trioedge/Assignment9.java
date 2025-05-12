package com.trioedge;

public class Assignment9 {

	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double monthlyPayment;

	public Assignment9() {

		loanAmount = 100000;
		interestRate = 4.5;
		loanTerm = 3;

	}

	void calculateMortgagePayment() {

		double monthlyInterestRate = interestRate / 12 / 100;

		int numberOfPayments = loanTerm * 12;

		double monthlyPayment = loanAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
				/ (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

		System.out.printf(" Monthly MortgagePayment: $%.2f\n", monthlyPayment);
	}

	public static void main(String args[]) {

		Assignment9 obj = new Assignment9();
		obj.calculateMortgagePayment();
	}

}
