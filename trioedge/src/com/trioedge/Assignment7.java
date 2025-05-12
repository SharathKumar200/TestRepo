package com.trioedge;

public class Assignment7 {
	
	private double mealPrice;
	private double taxRate;
	private double tipPercent;
	private double totalCost;
	
	
	public Assignment7() {
		mealPrice=70;
		taxRate=0.3;
		tipPercent=0.2;
	}
	
	void calculateMealCost() {
		
		totalCost=mealPrice+(mealPrice*tipPercent)+(mealPrice*taxRate);
		
		System.out.printf("mealPrice : %.2f\n",mealPrice);
		System.out.printf("taxRate : %.2f\n",taxRate);
		System.out.printf("tipPercent : %.2f\n",tipPercent);
		System.out.printf("totalCost : %.2f",totalCost);
	}
	
	
	public static void main(String args[]) {
		
		Assignment7 obj=new Assignment7();
		obj.calculateMealCost();
		
	}

}
