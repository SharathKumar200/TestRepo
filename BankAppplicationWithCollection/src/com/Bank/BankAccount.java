package com.Bank;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    public String name;
    public String location;
    public String acc_type;
    public int acc_no;
    public long balance;
    public int age;
    public Random random;
    private List<String> transactionHistory = new ArrayList<>();
    private int transactionCount = 0;

    public BankAccount(String name, String location, String acc_type, int acc_no, long balance, int age, Random random) {
        this.name = name;
        this.location = location;
        this.acc_type = acc_type;
        this.acc_no = acc_no;
        this.balance = balance;
        this.age = age;
        this.random = random;
    }

    public void displayAccount() {
        System.out.println("--- Account Details ---");
        System.out.println("Name of account holder: " + name);
        System.out.println("Location of account holder: " + location);
        System.out.println("Account no: " + acc_no);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
    }

    public void deposit(long amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InputMismatchException("Deposit amount must be positive.");
        }
        balance += amount;
        recordTransaction("Deposit", amount);
        applyInterest();
        System.out.println("Deposit successful. New balance: $" + balance);
        printTimestamp();
    }

    public void withdraw(long amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InputMismatchException("Withdrawal amount must be positive.");
        }
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
        recordTransaction("Withdrawal", amount);
        applyInterest();
        System.out.println("Withdrawal successful. New balance: $" + balance);
        printTimestamp();
    }

    public void checkBalance() {
        System.out.println("Your Balance Is: $" + balance);
    }

    public void printLastTransaction() {
        if (transactionCount > 0) {
            System.out.println("Last transaction details:");
            System.out.println(transactionHistory.get(transactionCount - 1));
        } else {
            System.out.println("No transactions yet.");
        }
    }

    public void printCompleteTransactionHistory() {
        if (transactionCount > 0) {
            System.out.println("Complete Transaction History:");
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        } else {
            System.out.println("No transactions recorded.");
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
            double interest = balance * interestRate;
            balance += interest;
            recordTransaction("Interest", interest);
            System.out.println("Interest applied. New balance: $" + balance);
        }
    }

    private void recordTransaction(String transactionType, double amount) {
        if (transactionCount < 100) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = LocalDate.now().format(formatter);
            String transaction = "Date: " + formattedDate + ", Time: " + LocalTime.now() + ", Type: " + transactionType + ", Amount: $" + amount;
            transactionHistory.add(transaction);
            transactionCount++;
        }
    }

    private void printTimestamp() {
        System.out.println("Date: " + LocalDate.now() + ", Time: " + LocalTime.now());
    }

    
    public static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }
}
