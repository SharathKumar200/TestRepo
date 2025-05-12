package com.random;

import java.util.Random;

public class dtatypedouble {

	Random random;

	void datatypedouble() {
		random = new Random();
		double doubletype = random.nextDouble();
		System.out.println("double random num:"+doubletype);
	}

	public static void main(String[] args) {
		dtatypedouble dd = new dtatypedouble();
		dd.datatypedouble();
	}

}
