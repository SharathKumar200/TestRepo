package com.Strings;

public class StringBuffermethods {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("sharath");
		// delete method
		System.out.println(sb1.delete(2, 5));
		// deletecharat method
		System.out.println(sb1.deleteCharAt(2));

		StringBuffer sb2 = new StringBuffer("sharathkumar");
		// reverse method
		System.out.println(sb2.reverse());

		StringBuffer sb3 = new StringBuffer("sharathkumar");
		sb3.append("bs");
		System.out.println(sb3);

		// insert method
		StringBuffer sb4 = new StringBuffer("sharathkumar");
		sb4.insert(0, "hi");
		System.out.println(sb4);

		// replace method
		StringBuffer sb5 = new StringBuffer("hii how r u");
		sb5.replace(4, 6, "hlo ");
		System.out.println(sb5);
		
	}

}
