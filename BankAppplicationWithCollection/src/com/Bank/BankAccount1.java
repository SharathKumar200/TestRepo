package com.Bank;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BankAccount1 {

	private List<BankAccount> accounts = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	public void addAccount(BankAccount account) {
		accounts.add(account);
	}
	public boolean isAccountPresent() {
        return !accounts.isEmpty();
    }

	public void createAccount() {
		System.out.println("--- Create Account ---");
		System.out.print("Enter your name: ");
		String name = sc.next();

		System.out.print("Enter location: ");
		String location = sc.next();

		System.out.print("Enter account type (1 for Savings, 2 for Current): ");
		String accType = sc.next();

		System.out.print("Enter initial deposit amount: ");
		long initialDeposit = sc.nextLong();

		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		Random random = new Random();
		int accNo = random.nextInt(10000);

		BankAccount account = new BankAccount(name, location, accType, accNo, initialDeposit, age, random);
		addAccount(account);
		System.out.println("Account created successfully with account number: " + accNo);
	}

	public void showAccountDetails() {
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.print("Enter the account number: ");
				int accNo = sc.nextInt();
				boolean accountFound = false;

				for (BankAccount account : accounts) {
					if (account.acc_no == accNo) {
						account.displayAccount();
						accountFound = true;
						validInput = true;
						break;
					}
				}

				if (!accountFound) {
					System.out.println("Account not found. Please check the account number and try again.");
				}
			} catch (InputMismatchException ie) {
				System.out.println("Invalid input. Please enter a valid integer.");
				sc.next();
			}
		}
	}

	public void deposit() {
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.print("Enter the account number: ");
				int accNo = sc.nextInt();
				System.out.print("Enter the deposit amount: ");
				long amount = sc.nextLong();
				boolean accountFound = false;

				for (BankAccount account : accounts) {
					if (account.acc_no == accNo) {
						account.deposit(amount);
						accountFound = true;
						validInput = true;
						break;
					}
				}

				if (!accountFound) {
					System.out.println("Account not found. Please check the account number and try again.");
				}
			} catch (InputMismatchException ie) {
				System.out.println("Invalid input. Please enter a valid integer.");
				sc.next();
			} catch (BankAccount.InsufficientFundsException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void withdraw() {
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.print("Enter the account number: ");
				int accNo = sc.nextInt();
				System.out.print("Enter the withdrawal amount: ");
				long amount = sc.nextLong();
				boolean accountFound = false;

				for (BankAccount account : accounts) {
					if (account.acc_no == accNo) {
						account.withdraw(amount);
						accountFound = true;
						validInput = true;
						break;
					}
				}

				if (!accountFound) {
					System.out.println("Account not found. Please check the account number and try again.");
				}
			} catch (InputMismatchException ie) {
				System.out.println("Invalid input. Please enter a valid integer.");
				sc.next();
			} catch (BankAccount.InsufficientFundsException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void checkBalance() {
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.print("Enter the account number: ");
				int accNo = sc.nextInt();
				boolean accountFound = false;

				for (BankAccount account : accounts) {
					if (account.acc_no == accNo) {
						account.checkBalance();
						accountFound = true;
						validInput = true;
						break;
					}
				}

				if (!accountFound) {
					System.out.println("Account not found. Please check the account number and try again.");
				}
			} catch (InputMismatchException ie) {
				System.out.println("Invalid input. Please enter a valid integer.");
				sc.next();
			}
		}
	}

	public void printLastTransaction() {
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.print("Enter the account number: ");
				int accNo = sc.nextInt();
				boolean accountFound = false;

				for (BankAccount account : accounts) {
					if (account.acc_no == accNo) {
						account.printLastTransaction();
						accountFound = true;
						validInput = true;
						break;
					}
				}

				if (!accountFound) {
					System.out.println("Account not found. Please check the account number and try again.");
				}
			} catch (InputMismatchException ie) {
				System.out.println("Invalid input. Please enter a valid integer.");
				sc.next();
			}
		}
	}

	public void printCompleteTransactionHistory() {
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.print("Enter the account number: ");
				int accNo = sc.nextInt();
				boolean accountFound = false;

				for (BankAccount account : accounts) {
					if (account.acc_no == accNo) {
						account.printCompleteTransactionHistory();
						accountFound = true;
						validInput = true;
						break;
					}
				}

				if (!accountFound) {
					System.out.println("Account not found. Please check the account number and try again.");
				}
			} catch (InputMismatchException ie) {
				System.out.println("Invalid input. Please enter a valid integer.");
				sc.next();
			}
		}
	}
}