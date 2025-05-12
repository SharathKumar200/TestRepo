package com.Strings;

public class StringClassMethods {

	public static void main(String[] args) {
		// CharAt method
		String s = "sharath";
		System.out.println(s.charAt(1));
		// indexof method
		System.out.println(s.indexOf('a'));
		// lastindexof method

		System.out.println(s.lastIndexOf('a'));
		// length method
		System.out.println(s.length());
		String s1 = new String("yo! broo");
		// startwith and endswith
		System.out.println(s1.startsWith("yo"));
		System.out.println(s1.endsWith("oo"));

		// Contains method
		System.out.println(s1.contains("f"));

		// length() method and method chaining
		String s2 = "   sharath   ";
		System.out.println(s2.length());
		System.out.println(s2.trim().length());
		// substring method
		System.out.println(s2.trim().substring(2).length());

		// length variable vs length () method

		int[] a = { 10, 11, 12 };
		System.out.println(a.length);
		String str = "sharath";
		System.out.println(str.length());

		// split method

		String b = "hi how r u";
		String[] str5 = b.split(" ");
		for (String ss : str5) {
			System.out.println(ss);
		}

	}

}
