package com.techxyte;

import java.util.*;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);

	}
}

public class BankingApp3 extends BankingApp1 implements BankingApp2 {

	Scanner sc = new Scanner(System.in);

	Random random = new Random();

	private void getAccountInfo() {
		String input;
		do {
			System.out.print("Enter your name: ");
			input = sc.next();
			if (!input.matches("[a-zA-Z]+")) {
				System.out.println("Invalid input. Please enter only letters.");
			} else {
				name = input;
			}

		} while (!input.matches("[a-zA-Z]+"));
		do {
			System.out.print("Enter Location: ");
			input = sc.next();
			if (!input.matches("[a-zA-Z]+")) {
				System.out.println("Invalid input. Please enter only letters.");
			} else {
				location = input;
			}

		} while (!input.matches("[a-zA-Z]+"));

	}

	private void AccountType() {
		System.out.println("\n 1. Savings Account\t 2. Current Account\n");
		System.out.print("Enter your choice: ");
		acc_type = sc.next();
		boolean exit = false;
		while (!exit) {
			switch (acc_type) {

			case "1":
				while (true) {
					System.out.print("Enter initial deposit amount for Savings Account."
							+ "  Minimum deposit is $1000 and must be in multiples of $100 : ");
					int initialDepositSavings = sc.nextInt();
					if (initialDepositSavings >= 500 && initialDepositSavings % 100 == 0) {

						System.out.println("Savings Account created successfully.");
						System.out.println("Initial balance: " + initialDepositSavings);
						balance = initialDepositSavings;
						exit = true;
						break;

					} else {
						System.out.println("Invalid deposit amount for Savings  Account. "
								+ "Minimum deposit is $1000 and must be in multiples of $100.");
					}
				}
				break;

			case "2":
				while (true) {
					System.out.print("Enter initial deposit amount for Current Account."
							+ "  Minimum deposit is $5000 and must be in multiples of $100 :");
					int initialDepositCurrent = sc.nextInt();
					if (initialDepositCurrent >= 5000 && initialDepositCurrent % 100 == 0) {
						System.out.println("Current Account created successfully.");
						System.out.println("Initial balance: " + initialDepositCurrent);
						balance = initialDepositCurrent;
						exit = true;
						break;

					} else {
						System.out.println("Invalid deposit amount for Current Account."
								+ " Minimum deposit is $5000 and must be in multiples of $100:");
					}
				}
				break;

			default:
				System.out.println("Invalid choice. Please choose a valid account type.");

				break;
			}
		}
	}

	private void generateRandomAccountNumber() {
		int randomNumber = random.nextInt(1000);
		acc_no = String.format("%03d", randomNumber);
		System.out.println("Generated Account Number: " + acc_no);
	}

	
	private void validateAge() throws InvalidAgeException {
		boolean validAge = false;
		do {
			System.out.print("Enter your age: ");
			try {
				age = sc.nextInt();
				if (age >= 18) {
					System.out.println("You are eligible to create an account.");
					validAge = true;
				} else {
					System.out.println("You must be 18 or older to create an account. Please try again.");

				}
			} catch (InputMismatchException ie) {
				System.out.println("Invalid input. Please enter a valid age.");
				sc.next();
			}
		} while (!validAge);
	}

	public void checkBalance() {

	}

	public void createAccount() throws InvalidAgeException {
		System.out.println("--- Create Account ---");
		getAccountInfo();
		validateAge();
		generateRandomAccountNumber();
		AccountType();
		System.out.println("Account created successfully!");
	}

	public void showAccount() {

		System.out.println("--- Account Details ---");
		System.out.println("Name of account holder: " + name);
		System.out.println("Location of account holder: " + location);
		System.out.println("Account no: " + acc_no);
		System.out.println("Account type: " + acc_type);
		System.out.println("Balance: " + balance);
	}

	public void deposit() {
		boolean exit = false;
		while (!exit) {
			System.out.println("Enter The Amount to be Deposited:");

			try {
				long amount = sc.nextLong();
				if (acc_type.equals("1")) {
					if (amount >= 1000) {
						balance += amount;
						System.out.println("Successfully Deposited.");
						System.out.println("Your Balance is : " + balance);
						exit = true;
					} else {
						System.out.println("Invalid deposit amount for Savings Account. "
								+ "Minimum deposit is $1000 and must be in multiples of $100.");
					}
				} else if (acc_type.equals("2")) {
					if (amount >= 5000) {
						balance += amount;
						System.out.println("Successfully Deposited.");
						System.out.println("Your Balance is : " + balance);
						exit = true;
					} else {
						System.out.println("Invalid deposit amount for Current Account. "
								+ "Minimum deposit is $5000 and must be in multiples of $100.");
					}
				}
			} catch (InputMismatchException ie) {
				System.out.println("Invalid input. Please enter a valid integer.");
				sc.next();
			}
		}
	}

	public void withdraw() {
		boolean exit = false;
		while (!exit) {

			System.out.println("Enter The Amount to be withdrawn:");

			long amount = sc.nextLong();
			try {
				if (acc_type.equals("1")) {
					if (balance >= amount && amount > 0) {
						balance -= amount;
						System.out.println("Withdrawn: $" + amount);
						System.out.println("Your Balance is : " + balance);
						exit = true;
					} else {
						System.out.println("Insufficient balance or invalid amount. Withdrawal failed.");
					}
				} else if (acc_type.equals("2")) {
					if (balance >= amount && amount > 0) {
						balance -= amount;
						System.out.println("Withdrawn: $" + amount);
						System.out.println("Your Balance is : " + balance);
						exit = true;
					} else {
						System.out.println("Insufficient balance or invalid amount. Withdrawal failed.");
					}
				}
			} catch (InputMismatchException ie) {

				System.out.println("Invalid input. Please enter a valid integer.");
				sc.next();
			}
		}
	}

	public boolean search(String ac_no) {
		if (acc_no.equals(ac_no)) {
			showAccount();
			return (true);
		}
		return (false);
	}

	public void checkbalance() {
		System.out.println("Account Balance: " + balance);
	}

	public void closeScanner() {
		sc.close();
	}

}
