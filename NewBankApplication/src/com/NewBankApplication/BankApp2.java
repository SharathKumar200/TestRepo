package com.NewBankApplication;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApp2 extends BankApp1 {
	private Scanner sc = new Scanner(System.in);
	private String acc_type;
	private String[] transactionHistory = new String[100];
	private int transactionCount = 0;
	private String lastTransaction = "No transactions yet";

	public BankApp2(String name, String location, long balance, int age) {
		super(name, location, balance, age);
	}

	public BankApp2() {
		super("", "", 0, 0);
	}

	private void getAccountInfo(BankApp3 bankArray) {
		String input;
		do {
			System.out.print("Enter your name: ");
			input = sc.next();
			if (!input.matches("[a-zA-Z]+")) {
				System.out.println("Invalid input. Please enter only letters for the name.");
			} else {
				this.Name = input;
			}
		} while (!input.matches("[a-zA-Z]+"));

		do {
			System.out.print("Enter Location: ");
			input = sc.next();
			if (!input.matches("[a-zA-Z]+")) {
				System.out.println("Invalid input. Please enter only letters for the location.");
			} else {
				this.Location = input;
			}
		} while (!input.matches("[a-zA-Z]+"));
	}

	private void AccountType() {
		System.out.println("\n1. Savings Account\t2. Current Account\n");
		System.out.print("Enter your choice: ");
		acc_type = sc.next();
		boolean exit = false;
		while (!exit) {
			switch (acc_type) {
			case "1":
				while (true) {
					try {
						System.out.print("Enter initial deposit for Savings Account ($1000 min, multiples of $100): ");
						int initialDepositSavings = sc.nextInt();
						if (initialDepositSavings >= 1000 && initialDepositSavings % 100 == 0) {

							System.out.println("Savings Account created successfully with an initial deposit of $"
									+ initialDepositSavings + ".");
							Balance = initialDepositSavings;
							// applyInterest();
							exit = true;
							break;
						} else {

							System.out.println(
									"Invalid deposit amount for Savings Account. Minimum deposit is $1000 and must be in multiples of $100.");
						}
					} catch (InputMismatchException ie) {

						System.out.println("Invalid input. Please enter a valid Input.");
						sc.next();
					}
				}
				break;

			case "2":
				while (true) {
					try {
						System.out.print("Enter initial deposit for Current Account ($5000 min, multiples of $100): ");
						int initialDepositCurrent = sc.nextInt();
						if (initialDepositCurrent >= 5000 && initialDepositCurrent % 100 == 0) {

							System.out.println("Current Account created successfully with an initial deposit of $"
									+ initialDepositCurrent + ".");
							Balance = initialDepositCurrent;
							// applyInterest();
							exit = true;
							break;
						} else {

							System.out.println(
									"Invalid deposit amount for Current Account. Minimum deposit is $5000 and must be in multiples of $100.");
						}
					} catch (InputMismatchException ie) {

						System.out.println("Invalid input. Please enter a valid Input");
						sc.next();
					}
				}
				break;

			default:

				System.out
						.println("Invalid choice. Please choose a valid account type (1 for Savings, 2 for Current).");
				break;
			}
		}
	}

	private void generateRandomAccountNumber(BankApp3 bankArray) {
		int randomNumber;
		do {
			randomNumber = random.nextInt(100);
		} while (bankArray.a[randomNumber] != null);

		Acc_no = randomNumber;
		System.out.println("Account number generated.");
		System.out.println("Generated Account Number: " + Acc_no);
	}

	private void validateAge() throws InvalidAgeException {
		boolean validAge = false;
		do {
			System.out.print("Enter your age: ");
			try {
				Age = sc.nextInt();
				if (Age >= 18) {

					System.out.println("You are eligible to create an account.");
					validAge = true;
				} else {

					System.out.println("You must be 18 or older to create an account. Please try again.");
				}
			} catch (InputMismatchException ie) {

				System.out.println("Invalid input. Please enter a valid integer for age.");
				sc.next();
			}
		} while (!validAge);
	}

	class InvalidAgeException extends Exception {
		public InvalidAgeException(String message) {
			super(message);
		}
	}

	class InsufficientFundsException extends Exception {
		public InsufficientFundsException(String message) {
			super(message);
		}
	}

	public void createAcc(BankApp3 bankArray) throws InvalidAgeException {
		System.out.println("--- Create Account ---");
		getAccountInfo(bankArray);
		validateAge();
		AccountType();
		generateRandomAccountNumber(bankArray);

	}

	public void DisplayAccount() {
		System.out.println("--- Account Details ---");
		System.out.println("Name of account holder: " + Name);
		System.out.println("Location of account holder: " + Location);
		System.out.println("Account no: " + Acc_no);
		System.out.println("Account type: " + acc_type);
		System.out.println("Balance: " + Balance);
	}

	public void Deposit() throws InsufficientFundsException {
		boolean validInput = false;
		while (!validInput) {
			System.out.println("Enter The Amount to be Deposited:");
			try {
				long amount = sc.nextLong();
				if (acc_type.equals("1")) {
					if (amount >= 1000) {
						Balance += amount;
						lastTransaction = "Deposited $" + amount + " to Savings Account.";
						recordTransaction("Deposit", amount);
						System.out.println("Deposit successful.");
						System.out.println(
								"Successfully deposited $" + amount + ". Your balance is now $" + Balance + ".");
						validInput = true;
					} else {

						System.out.println(
								"Invalid deposit amount for Savings Account. Minimum deposit is $1000 and must be in multiples of $100.");
					}
				} else if (acc_type.equals("2")) {
					if (amount >= 5000) {
						Balance += amount;
						lastTransaction = "Deposited $" + amount + " to Current Account.";
						recordTransaction("Deposit", amount);
						System.out.println("Deposit successful.");
						System.out.println(
								"Successfully deposited $" + amount + ". Your balance is now $" + Balance + ".");

						validInput = true;
					} else {

						throw new InsufficientFundsException(
								"Invalid deposit amount for Current Account. Minimum deposit is $5000 and must be in multiples of $100.");
					}
				}
			} catch (InputMismatchException ie) {

				System.out.println("Invalid input. Please enter a valid integer for the deposit amount.");
				sc.next();
			}

		}
		applyInterest();
		System.out.println("Date: " + LocalDate.now() + ", Time: " + LocalTime.now());
	}

	public void withdraw() throws InsufficientFundsException {
		boolean validInput = false;
		while (!validInput) {
			System.out.println("Enter The Amount to be withdrawn:");
			try {
				long amount = sc.nextLong();
				if (Balance >= amount && amount > 0) {
					Balance -= amount;
					lastTransaction = "Withdrew $" + amount + " from account.";
					recordTransaction("Withdrawal", amount);
					System.out.println("Withdrawal successful.");
					System.out.println("Successfully withdrawn $" + amount + ". Your balance is now $" + Balance + ".");
					System.out.println("Date: " + LocalDate.now() + ", Time: " + LocalTime.now());

					validInput = true;
				} else {

					throw new InsufficientFundsException("Insufficient balance or invalid amount. Withdrawal failed.");
				}
			} catch (InputMismatchException ie) {

				System.out.println("Invalid input. Please enter a valid integer for the withdrawal amount.");
				sc.next();
			}
		}
		applyInterest();
	}

	public void Balance() {
		System.out.println("Your Balance Is: " + Balance);
	}

	public void ShowDetails(BankApp3 r) {
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.println("Enter The Account No:");
				int an = sc.nextInt();
				boolean accountFound = false;

				for (int i = 0; i < r.a.length; i++) {
					if (r.a[i] != null && an == r.a[i].Acc_no) {
						r.a[i].DisplayAccount();
						accountFound = true;
						validInput = true;
						break;
					}
				}

				if (!accountFound) {

					System.out.println("Account not found. Please check the account number and try again.");
				}
			} catch (InputMismatchException ie) {
				System.out.println("Invalid Input!....");
				sc.next();
			}
		}
	}

	public void DepoSit(BankApp3 r) throws InsufficientFundsException {
		boolean validInput = false;
		while (!validInput) {
			try {

				System.out.println("Enter The Account No:");

				int an = sc.nextInt();
				boolean accountFound = false;

				for (int i = 0; i < r.a.length; i++) {
					if (r.a[i] != null && an == r.a[i].Acc_no) {
						r.a[i].Deposit();

						accountFound = true;
						validInput = true;
						break;
					}
				}

				if (!accountFound) {

					System.out.println("Account not found. Please check the account number and try again.");
				}
			} catch (InputMismatchException ie) {
				System.out.println("Invalid Input!....");
				sc.next();
			}
		}
	}

	public void Withdraw(BankApp3 r) throws InsufficientFundsException {
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.println("Enter The Account No:");

				int an = sc.nextInt();
				boolean accountFound = false;

				for (int i = 0; i < r.a.length; i++) {
					if (r.a[i] != null && an == r.a[i].Acc_no) {
						r.a[i].withdraw();
						accountFound = true;
						validInput = true;
						break;
					}
				}

				if (!accountFound) {

					System.out.println("Account not found. Please check the account number and try again.");
				}
			} catch (InputMismatchException ie) {
				System.out.println("Invalid Input!....");
				sc.next();
			}
		}
	}

	public void balance(BankApp3 r) {
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.println("Enter The Account No:");
				int an = sc.nextInt();
				boolean accountFound = false;

				for (int i = 0; i < r.a.length; i++) {
					if (r.a[i] != null && an == r.a[i].Acc_no) {
						r.a[i].Balance();
						accountFound = true;
						validInput = true;
						break;
					}
				}

				if (!accountFound) {

					System.out.println("Account not found. Please check the account number and try again.");
				}
			} catch (InputMismatchException ie) {
				System.out.println("Invalid Input!....");
				sc.next();
			}
		}
	}

	public void printLastTransaction() {
		if (transactionCount > 0) {
			System.out.println("Last transaction details:");
			System.out.println(transactionHistory[transactionCount - 1]);
		} else {
			System.out.println("No transactions yet");
		}
	}

	public void printCompleteTransactionHistory() {
		if (transactionCount > 0) {
			System.out.println("Complete Transaction History:");
			for (int i = 0; i < transactionCount; i++) {
				System.out.println(transactionHistory[i]);
			}
		} else {
			System.out.println("No transactions recorded");
		}
	}

	private void applyInterest() {
		double interestRate = 0.0;

		if (acc_type.equals("1")) {
			interestRate = 0.07;
		} else if (acc_type.equals("2")) {
			interestRate = 0.05;
		}

		if (interestRate > 0) {
			double interest = Balance * interestRate;
			Balance += interest;
			lastTransaction = String.format("Applied interest of $%.2f to %s Account.", interest,
					acc_type.equals("1") ? "Savings" : "Current");
			recordTransaction("Interest", interest);
			System.out.println("Interest applied. New balance: $" + Balance);
		}
	}

	private void recordTransaction(String transactionType, double amount) {
		if (transactionCount < transactionHistory.length) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String formattedDate = LocalDate.now().format(formatter);
			String transaction = "Date: " + formattedDate + ", Time: " + LocalTime.now() + ", Type: " + transactionType
					+ ", Amount: $" + amount;
			transactionHistory[transactionCount++] = transaction;
		}
	}
}