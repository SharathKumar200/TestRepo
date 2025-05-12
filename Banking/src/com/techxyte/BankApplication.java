package com.techxyte;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CreateAccount ca = new CreateAccount();

		// CreateAccount ca = null;
		boolean exit = false;
		System.out.println("\n\n\t---Bank Application Demo---\n");

		do {

			System.out.println(
					"\n1. Create Account\t 2. Display Account\n3. Deposit Amount\t 4. Withdraw\n5. Balance\n6. Exit\n");

			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:

				// ca = new CreateAccount(); // Create a new instance for each session
				ca.createAccount();
				break;

			case 2:

				if (ca != null) {

					ca.showAccount();
				} else {
					System.out.println("No account created yet.");
				}
				break;
			case 3:

				if (ca != null) {

					ca.deposit();
				} else {
					System.out.println("No account created yet.");
				}
				break;
			case 4:

				if (ca != null) {

					ca.withdraw();

				} else {
					System.out.println("No account created yet.");
				}
				break;
			case 5:

				if (ca != null) {
					ca.checkBalance();
				} else {
					System.out.println("No account created yet.");
				}
				break;
			case 6:

				exit = true;
				if (ca != null) {
					ca.closeScanner();
				}
				System.out.println("Exiting Bank Application. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 6.");
				break;
			}
		} while (!exit);
		sc.close();
	}
}