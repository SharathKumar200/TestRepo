package com.Clonening;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sharath");
		al.add("harish");
		al.add("bhuvana");
		al.add("brunda");
		System.out.println(al);
		ArrayList<String> ss = (ArrayList<String>) al.clone();
		System.out.println(ss);
	}

}
