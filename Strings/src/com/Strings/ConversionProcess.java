package com.Strings;

public class ConversionProcess {

	public static void main(String[] args) {

		String s = "sharath";
		String s12 = "kumar";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.replace(0, 0, s12));

		StringBuffer sb1 = new StringBuffer("sharath");
		String s1 = sb1.toString();

		System.out.println(s1);

		String originalString = "Hello World";
		String newString = originalString.replace("World", "Java");
		System.out.println(newString); // prints "Hello Java"

	}

}
