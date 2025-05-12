package com.trioedge;

public class Assignment3 {
	
	private double amount;
	private String fromCurrency;
	private String toCurrency;
	private double exchangeRate;
	
	private double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
	}
	public Assignment3() {
        amount = 100;
        fromCurrency = "USD";   
        toCurrency = "EUR";     
        exchangeRate = 0.9;
        
        double convertedAmount = convertCurrency(amount, exchangeRate);
        System.out.println("Converted amount (USD to EUR): " + convertedAmount);
        
        fromCurrency = "USD";
        toCurrency = "JPY";
        exchangeRate = 110.0;
        
        convertedAmount = convertCurrency(amount, exchangeRate);
        System.out.println("Converted amount (USD to JPY): " + convertedAmount);
	}
	 public static void main(String[] args) {
	        Assignment3 assignment = new Assignment3();
	
	 }
}
