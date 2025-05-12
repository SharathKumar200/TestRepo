package com.trioedge;

interface BankAccount {
	void Deposit();

	double getBalance();

	String getName();

	String getSSN();

	String getLocation();

	int getAge();
}

class SavingsAccount implements BankAccount {
	private String Name;
	private String Location;
	private String SSN;
	private int Age;
	private double Balance;

	public SavingsAccount(String Name, String Location, String SSN, int Age) {
		if (Age <= 18) {
			System.out.println("Age must be greater than 18 for opening a savings account.");
		}
		this.Name = Name;
		this.Location = Location;
		this.SSN = SSN;
		this.Age = Age;
		this.Balance = 0.0;
	}

	public void Deposit(double Amount) {
		if (Amount > 500) {
			Balance += Amount;
			System.out.println(Amount + " deposited successfully.");
		} else {
			System.out.println("Deposit amount must be positive.");
		}

	}

	public double getBalance() {

		return Balance;
	}

	public String getName() {

		return Name;
	}

	public String getSSN() {

		return SSN;
	}

	public String getLocation() {

		return Location;
	}

	public int getAge() {

		return Age;
	}

	@Override
	public void Deposit() {
		// TODO Auto-generated method stub
		
	}
}

class CurrentAccount implements BankAccount {

	private String Name;
	private String Location;
	private String SSN;
	private int Age;
	private double Balance;

	public CurrentAccount(String Name, String Location, String SSN, int Age) {
		if (Age <= 18) {
			System.out.println("Age must be greater than 18 for opening a current account.");
		}
		this.Name = Name;
		this.Location = Location;
		this.SSN = SSN;
		this.Age = Age;
		this.Balance = 0.0;

	}

	public void Deposit(double Amount) {
		if (Amount > 5000) {
			Balance += Amount;
			System.out.println(Amount + " deposited successfully.");
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}

	public double getBalance() {

		return Balance;
	}

	public String getName() {

		return Name;
	}

	public String getSSN() {

		return SSN;
	}

	public String getLocation() {

		return Location;
	}

	public int getAge() {

		return Age;
	}

	@Override
	public void Deposit() {
		// TODO Auto-generated method stub
		
	}

}

class Account {

	public static void main(String[] args) {

		SavingsAccount savingsAccount = new SavingsAccount("sharth", "1234", "Banglore", 22);
		savingsAccount.Deposit(1000.0);

		System.out.println("Savings Account Holder: " + savingsAccount.getName());
		System.out.println("Location: " + savingsAccount.getLocation());
		System.out.println("SSN: " + savingsAccount.getSSN());
		System.out.println("Age: " + savingsAccount.getAge());
		System.out.println("Current Balance: " + savingsAccount.getBalance());

		System.out.println();

		CurrentAccount CurrentAccount = new CurrentAccount("manu", "1234", "Banglore", 22);
		CurrentAccount.Deposit(1000.0);

		System.out.println("Savings Account Holder: " + savingsAccount.getName());
		System.out.println("Location: " + savingsAccount.getLocation());
		System.out.println("SSN: " + savingsAccount.getSSN());
		System.out.println("Age: " + savingsAccount.getAge());
		System.out.println("Current Balance: " + savingsAccount.getBalance());

	}

}
