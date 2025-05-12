package com.mt22;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("User defined thraed" + Thread.currentThread().getName());
		}

	}

}

public class ThreadDemo {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();

		new Thread(r).start();

		new Thread(new MyRunnable()).start();

		new Thread(() -> System.out.println("lamda expression")).start();

	}

}
