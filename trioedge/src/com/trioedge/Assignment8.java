package com.trioedge;

public class Assignment8 {

	private double buyprice;
	private double sellprice;
	private double quantity;
	private double profit;

	public Assignment8() {

		buyprice = 10.5;
		sellprice = 15.5;
		quantity = 100;

	}

	void calculateTradeProfit() {

		profit = (sellprice - buyprice) * quantity;

		System.out.println(" buyprice:" + buyprice);
		System.out.println(" pricesell:" + sellprice);
		System.out.println(" quantity:" + quantity);
		System.out.printf("profit of trading %.2f units: %.2f: ", quantity, profit);

	}

	public static void main(String args[]) {

		Assignment8 obj = new Assignment8();

		obj.calculateTradeProfit();
	}

}
