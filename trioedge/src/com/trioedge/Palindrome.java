package com.trioedge;

public class  Palindrome {
	
	
	int n = 454;
	
	
	void CheckPalindrome() {
		int r, sum=0;
		int temp = n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) 
			System.out.println("Palindrom Number");
			else
			System.out.println(" Not Palindrom Number");	
	}
	
	public static void main(String args[]) {
	Palindrome obj	=new Palindrome();
	obj.CheckPalindrome();
	
		
	}
}
