package com.NewBankApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.NewBankApplication.BankApp2.InsufficientFundsException;

public class BankApp4 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);

		BankApp2 bank = new BankApp2();
		BankApp3 bankArray = new BankApp3(100);
		boolean accountCreated = false;

		boolean loop = true;
		while (loop) {
			System.out.println("\n\n\t---Bank Application Demo---\n");

			System.out.println("1. Create Account\t\t2. Show Details\n" + "3. Deposit\t\t\t4. Withdraw\n"
					+ "5. Balance\t\t\t6. Last Transaction\n" + "7. Complete TransHis\t\t8. Exit\n");

			System.out.println("Select The Option [1-8]: ");
			int choice = 0;
			boolean validChoice = false;

			while (!validChoice) {
				try {
					System.out.print("Enter your choice: ");
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
				try {
					bank.createAcc(bankArray);
					bankArray.a[bank.Acc_no] = bank;
					accountCreated = true;
				} catch (BankApp2.InvalidAgeException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				if (accountCreated == true) {
					bank.ShowDetails(bankArray);
				} else {
					System.out.println("Please create an account first.");
				}
				break;
			case 3:
				if (accountCreated == true) {
					try {
						bank.DepoSit(bankArray);
					} catch (InsufficientFundsException ie) {
						System.out.println("InsufficientFunds:   InsufficientFundsException");
					}
				} else {

					System.out.println("Please create an account first.");
				}

				break;
			case 4:
				if (accountCreated == true) {
					try {
						bank.Withdraw(bankArray);
					} catch (InsufficientFundsException ie) {
						System.out.println("InsufficientFunds:   InsufficientFundsException");
					}
				} else {
					System.out.println("Please create an account first.");
				}

				break;
			case 5:
				if (accountCreated == true) {
					bank.balance(bankArray);
				} else {
					System.out.println("Please create an account first.");
				}

				break;
			case 6:
				if (accountCreated == true) {
					bank.printLastTransaction();
				} else {
					System.out.println("No account created. Please create an account first.");
				}
				break;

			case 7:
				if (accountCreated == true) {
					bank.printCompleteTransactionHistory();
				} else {
					System.out.println("No account created. Please create an account first.");
				}
				break;

			case 8:
				loop = false;
				System.out.println("Exiting Bank Application. Thank you!..See you Again");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 8.");
				System.exit(0);
			}
		}
		sc.close();
	}
}
