package com.trioedge;

public class Assignment4 {

	private int AccountNumber;
	private long balance;
	long amt;

	public Assignment4() {
		AccountNumber = 123456789;
		balance = 100;
	}

	void details() {

		System.out.println("AccountNumber:" + AccountNumber);
		System.out.println("balance:" + balance);

	}

	long deposit() {
		long depositamt = 12;

		balance = balance + depositamt;
		amt = depositamt;

		System.out.println("Balance after deposit: " + balance);
		return amt;

	}

	void withdraw(long withdrawamt) {

		if (balance >= withdrawamt) {
			balance -= withdrawamt;
			amt = withdrawamt;
			System.out.println("Withdrawal of " + withdrawamt + " successful.");
		} else {
			System.out.println("Withdrawal of " + withdrawamt + " failed. Insufficient balance.");
		}
		System.out.println("Balance after withdrawal: " + balance);
	}

	void getbalance() {

		System.out.println("getbalance:" + balance);

	}

	public static void main(String[] args) {

		Assignment4 obj = new Assignment4();
		obj.details();

		obj.deposit();
		obj.withdraw(10);
		obj.getbalance();

	}
}
