package com.Strings;

public class Test3 {
	Test3(String str) {

	}
//

	public static void main(String[] args) {
		// object=eqauls() ref=ref comp
		Test3 t1 = new Test3("sharath");
		Test3 t2 = new Test3("sharath");
		System.out.println(t1.equals(t2));
		System.out.println(t1 == t2);//always refer to diffrent object:false

		String s1 = "sharath";
		String s2 = "sharath";
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

		String str1 = new String("sharath");
		String str2 = new String("sharath");
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);

		StringBuffer sb1 = new StringBuffer("sharath");
		StringBuffer sb2 = new StringBuffer("sharath");
		System.out.println(sb1.equals(sb2));

	}

}
