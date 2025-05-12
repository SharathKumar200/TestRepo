package com.trioedge;

public class Assignment2 {
	
	
	private double principal=1000;
	private double rate=0.5;
	private double time=3;
	private double compoundFrequency=12;
	private double finalamount;
	
	public void  calculateCompoundInterest() {
		
		finalamount=principal * Math.pow(1 + rate / compoundFrequency, compoundFrequency * time);
		System.out.println("principal:" +principal);
		System.out.println("rate:"+rate);
		System.out.println("time:"+time);
		System.out.println("compoundFrequency:"+compoundFrequency);
		
		System.out.println("finalamount:" +finalamount );
		
	}
	
	public static void main(String [] args) {
		
		Assignment2 obj=new Assignment2();
		
		obj.calculateCompoundInterest();
	}
	
	
}
