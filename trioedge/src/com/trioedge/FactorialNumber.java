package com.trioedge;


public class FactorialNumber {
	
	int number=5;
	
	void checkfact() {
	int i,fact=1;
	for(i=1;i<=number;i++) {
	fact=fact*1;
	}
	System.out.println("Factorial of"+number+" is :"+fact);
}
	public static void main(String args[]) {
	FactorialNumber obj=new FactorialNumber();
	
	obj.checkfact();
}
}









