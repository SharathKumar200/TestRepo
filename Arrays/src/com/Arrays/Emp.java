package com.Arrays;

public class Emp {
	int eid;
	String ename;
	double esal;

	public Emp(int eid,String ename,double esal ) {
	super();
	this.eid=eid;
	this.ename=ename;
	this.esal=esal;
		
	}

	public static void main(String[] args) {
	Emp e1=new Emp(1111,"sharath",1000.45);
	Emp e2=new Emp(2222,"kumar",2000.45);
	Emp e3=new Emp(3333,"bs",3000.45);
	
	Emp[] ee=new Emp[3];
	ee[0]=e1;
	ee[1]=e2;
	ee[2]=e3;
	for(Emp e:ee) {
		System.out.println(e.eid+ " "+e.ename+" "+e.esal );
	}
	}

}
