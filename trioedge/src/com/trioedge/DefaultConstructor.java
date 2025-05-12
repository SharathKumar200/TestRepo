package com.trioedge;

public class DefaultConstructor {
	
	int id;
	String name;
	
	 DefaultConstructor(int id,String name) {
		 
		this. id=id;
		 this.name=name;
		
		
	}
	 DefaultConstructor(DefaultConstructor copyConstructor){
		 this.id= copyConstructor.id;
		 this.name= copyConstructor.name;
		 System.out.println("\nafter\n");
	 }
	 int showid() {
		 return id;
	 }
	 String showname() {
		 return name;
	 }
	void display() {
		System.out.println(id +" "+ name);
	}
	
	public static void main(String args[]) {
		DefaultConstructor s1=new DefaultConstructor(1,"sagar");
		s1.display();
		DefaultConstructor s2=new DefaultConstructor(s1);
		s2.display();
	}

}
