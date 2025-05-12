package com.NewBankApplication;

import java.util.Random;

public class BankApp1 {
	public String Name;
	public String Location;

	public int Acc_no;
	public double Balance;
	public int Age;
	static int Noofacc = 0;
	public Random random = new Random();

	public BankApp1(String name, String location, long balance, int age) {
		this.Name = name;
		this.Location = location;
		this.Balance = balance;
		this.Age = age;
		this.Acc_no = Noofacc++;
	}
}