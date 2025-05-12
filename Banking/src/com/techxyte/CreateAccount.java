package com.techxyte;

import java.util.*;

import java.util.Random;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Random;

import java.util.Scanner;
import java.util.Scanner;

public class CreateAccount extends BankingApp1 {

	Scanner sc = new Scanner(System.in);

	Random random = new Random();

	private void getAccountInfo() {
		System.out.print("Enter Name: ");
		name = sc.next();
	}

	private void AccountType() {
		System.out.println("\n 1. Savings Account\t 2. Current Account\n");
		System.out.print("Enter your choice: ");
		acc_type = sc.next();
		switch (acc_type) {
		case "1":
			System.out.print("Enter initial deposit amount for Savings Account : ");
			int initialDepositSavings = sc.nextInt();
			if (initialDepositSavings >= 500 && initialDepositSavings % 100 == 0) {
				System.out.println("Savings Account created successfully.");
				System.out.println("Initial balance: " + initialDepositSavings);
				balance = initialDepositSavings;
			} else {
				System.out.println(
						"Invalid deposit amount for Savings  Account. Minimum deposit is $1000 and must be in multiples of $100.");

			}
			break;

		case "2":
			System.out.print("Enter initial deposit amount for Current Account :");
			int initialDepositCurrent = sc.nextInt();
			if (initialDepositCurrent >= 5000 && initialDepositCurrent % 100 == 0) {
				System.out.println("Current Account created successfully.");
				System.out.println("Initial balance: " + initialDepositCurrent);
				balance = initialDepositCurrent;
			} else {
				System.out.println(
						"Invalid deposit amount for Current Account. Minimum deposit is $5000 and must be in multiples of $100.");

			}
			break;

		default:
			System.out.println("Invalid account type selected. ");
			acc_type = "Savings Account";
			break;
		}
	}

	private void generateRandomAccountNumber() {
		int randomNumber = random.nextInt(1000);
		accno = String.format("%03d", randomNumber);
		System.out.println("Generated Account Number: " + accno);
	}

	private void validateAge() {
		while (true) {
			System.out.print("Enter your age: ");

			if (sc.hasNextInt()) {
				age = sc.nextInt();

				if (age >= 18) {
					System.out.println("You are eligible to create an account.");
					break;
				} else {
					System.out.println("You must be 18 or older to create an account. Please try again.");
				}
			} else {
				System.out.println("Invalid input. Please enter a valid integer.");
				sc.next();
			}
		}
	}

	public void checkBalance() {

		System.out.println("Account Balance: " + balance);
	}

	public void createAccount() {
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
		System.out.println("Account no.: " + accno);
		System.out.println("Account type: " + acc_type);
		System.out.println("Balance: " + balance);
	}

	public void deposit() {

		System.out.println("Enter The Amount to be Deposited:");

		long amount = sc.nextLong();

		if (amount > 0) {
			balance += amount;
			System.out.println("Successfully Deposited.");
			System.out.println("Your Balance is : " + balance);
		} else {
			System.out.println("Invalid amount entered. Deposit failed.");
		}

		System.out.println("Invalid input. Please enter a valid integer.");
		sc.next();
	}

	public void withdraw() {

		System.out.println("Enter The Amount to be withdrawn:");

		long amount = sc.nextLong();

		if (balance >= amount && amount > 0) {
			balance -= amount;
			System.out.println("Withdrawn: $" + amount);
			System.out.println("Your Balance is : " + balance);
		} else {
			System.out.println("Insufficient balance or invalid amount. Withdrawal failed.");
		}

		System.out.println("Invalid input. Please enter a valid integer.");
		sc.next();
	}

	public void closeScanner() {
		sc.close();
	}
}