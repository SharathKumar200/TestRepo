package com.Strings;

import java.util.StringTokenizer;

public class Stringtoknizer {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("hi hlo i am here");
		while (st.hasMoreElements()) {
			String ste = (String) st.nextElement();
			System.out.println(ste);
		}
		StringTokenizer str = new StringTokenizer("hi .hlo i am. here", ".");
		while (str.hasMoreTokens()) {
			String stt = str.nextToken();
			System.out.println(stt);
		}

	}

}
