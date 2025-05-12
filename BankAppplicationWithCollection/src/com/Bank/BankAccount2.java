package com.Bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount1 al = new BankAccount1();

		boolean loop = true;
		while (loop) {
			System.out.println("\n\n\t--- Bank Application Demo ---\n");
			System.out.println("1. Create Account\t\t2. Show Details\n" + "3. Deposit\t\t\t4. Withdraw\n"
					+ "5. Balance\t\t\t6. Last Transaction\n" + "7. Complete Transaction History\t8. Exit\n");

			System.out.print("Select The Option [1-8]: ");
			int choice = 0;
			boolean validChoice = false;

			while (!validChoice) {
				try {
					choice = sc.nextInt();
					if (choice < 1 || choice > 8) {
						System.out.println("Invalid choice. Please enter a number between 1 and 8.");
					} else {
						validChoice = true;
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input. Please enter a valid integer.");
					sc.next();
				}
			}

			switch (choice) {
			case 1:
				al.createAccount();
				break;
			case 2:
				if (al.isAccountPresent()) {
					al.showAccountDetails();
				} else {
					System.out.println("No accounts found. Please create an account first.");
				}
				break;
			case 3:
				if (al.isAccountPresent()) {
					al.deposit();
				} else {
					System.out.println("No accounts found. Please create an account first.");
				}
				break;
			case 4:
				if (al.isAccountPresent()) {
					al.withdraw();
				} else {
					System.out.println("No accounts found. Please create an account first.");
				}
				break;
			case 5:
				if (al.isAccountPresent()) {
					al.checkBalance();
				} else {
					System.out.println("No accounts found. Please create an account first.");
				}
				break;
			case 6:
				if (al.isAccountPresent()) {
					al.printLastTransaction();
				} else {
					System.out.println("No accounts found. Please create an account first.");
				}
				break;
			case 7:
				if (al.isAccountPresent()) {
					al.printCompleteTransactionHistory();
				} else {
					System.out.println("No accounts found. Please create an account first.");
				}
				break;
			case 8:
				loop = false;
				System.out.println("Exiting Bank Application. Thank you! See you again.");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 8.");
			}
		}
		sc.close();
	}
}