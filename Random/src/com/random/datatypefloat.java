package com.random;

import java.util.Random;

public class datatypefloat {
	Random random;

	void generaterandomfloat() {
		random = new Random();
		float randomNumber = random.nextFloat();
		System.out.println("print Random float number:" + randomNumber);
	}

	public static void main(String[] args) {
		datatypefloat df = new datatypefloat();
		df.generaterandomfloat();
	}

}
