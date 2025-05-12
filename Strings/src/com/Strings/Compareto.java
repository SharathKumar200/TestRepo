package com.Strings;

public class Compareto {

	public static void main(String[] args) {
		String s = "sharath";
		String s1 = "kumar";
		String s2 = "sharath";

		System.out.println(s1.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println("sharath".equalsIgnoreCase("SHARATH"));

		// Coampareto()

		String t = "sharath";
		String t1 = "kumar";
		String t2 = "sharath";
		System.out.println(t.compareTo(t2));
		System.out.println("sharath".compareToIgnoreCase("SHARATH"));
		System.out.println("sharath".compareTo("SHARATH"));
	}

}
