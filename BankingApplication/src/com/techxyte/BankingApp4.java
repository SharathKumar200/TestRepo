package com.techxyte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingApp4 {

	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);

		BankingApp3[] accounts = new BankingApp3[1];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new BankingApp3();
		}

		boolean exit = false;
		System.out.println("\n\n\t---Bank Application Demo---\n");

		System.out.println(
				"\n1.CreateAccount\t \t2.Show Account\n3.Search by Acc num\t4.Deposit Amount \n5.Withdraw Amount\t6.Check Balance\n7.Exit\t");

		while (!exit) {
			try {

				System.out.print("Enter your choice: ");
				int ch = sc.nextInt();

				switch (ch) {

				case 1:
					for (BankingApp3 account : accounts) {
						account.createAccount();
					}

				case 2:
					for (BankingApp3 account : accounts) {
						account.showAccount();
					}
					break;
				case 3:
					System.out.print("Enter account no. you want to search: ");
					String ac_no = sc.next();
					boolean found = false;
					for (BankingApp3 account : accounts) {
						found = account.search(ac_no);
						if (found)
							break;
					}
					if (!found) {
						System.out.println("Search failed! Account doesn't exist..!!");
					}
					break;
				case 4:
					System.out.print("Enter Account no. : ");
					ac_no = sc.next();
					found = false;
					for (BankingApp3 account : accounts) {
						found = account.search(ac_no);
						if (found) {
							account.deposit();
							break;
						}
					}
					if (!found) {
						System.out.println("Search failed! Account doesn't exist..!!");
					}
					break;
				case 5:
					System.out.print("Enter Account No : ");
					ac_no = sc.next();
					found = false;
					for (BankingApp3 account : accounts) {
						found = account.search(ac_no);
						if (found) {
							account.withdraw();
							break;
						}
					}
					if (!found) {
						System.out.println("Search failed! Account doesn't exist..!!");
					}
					break;
				case 6:
					System.out.print("Enter Account No: ");
					ac_no = sc.next();
					found = false;
					for (BankingApp3 account : accounts) {
						found = account.search(ac_no);
						if (found) {
							account.checkBalance();
							break;
						}
					}
					if (!found) {
						System.out.println("Search failed! Account doesn't exist..!!");
					}
					break;
				case 7:
					exit = true;
					System.out.println("Exiting Bank Application. Thank you!");
					break;
				default:
					System.out.println("Invalid choice. Please enter a number between 1 and 6.");
					break;
				}
			} catch (InputMismatchException ie) {
				System.out.println("Invalid input. Please enter a number between 1 and 6.");
				sc.next();
			}
		}
		sc.close();
	}
}
