package com.Strings;

public class ToStringex1 {
	
	
	int empid;
	String name;
	
	ToStringex1(int empid,String name){
		this.empid=empid;
		this.name=name;
		
	}
	

	@Override
	public String toString() {
		return "empid=" + empid + ", name=" + name + "";
	}


	public static void main(String[] args) {
		
		ToStringex1 t=new ToStringex1(111,"sharath");
		
		System.out.println(t);
		System.out.println(t.toString());
		
	}

}
