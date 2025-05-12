package com.trioedge;

public class SwappingTwoNumbers {
	
	int x=100;
	int y=200;
	
	void swap() {
		
		System.out.println("Before swap");
		System.out.println("x = :" +x);
		System.out.println("y = :" +y);
		
		
		int temp = x;
		x=y;
		y=temp;
		
		System.out.println("after swap");
		System.out.println("x = :" +x);
		System.out.println("y = :" +y);
		
		
	}
	public static void main(String args[]) {
	SwappingTwoNumbers	obj = new SwappingTwoNumbers();
	obj.swap();
	}
}
