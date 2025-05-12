package com.random;

import java.util.Random;

public class datatypesrandom {
	Random random;

	public void generate() {
		random = new Random();
		int intrandom = random.nextInt(999)+1;

		System.out.println("print Random integer number:" + intrandom);

	}

	public static void main(String[] args) {
		datatypesrandom ra = new datatypesrandom();
		ra.generate();
	}
}