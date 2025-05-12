package com.Strings;

public class Test2 {

	public static void main(String[] args) {
		// immutable :modification is not allowed
		String s = "sharath";
		s.concat("kumar");
		System.out.println(s);
		// mutable:modification is allowed

		StringBuffer buffer = new StringBuffer("sharath");
		buffer.append("kumar");
		System.out.println(buffer);

		// IMP
//		String s = "sharath";
//		String str=s.concat("kumar");
//		System.out.println(str);

//		String s1 = "sharath";
//		s1 = s.concat("kumar");
//		System.out.println(s1);

	}

}
