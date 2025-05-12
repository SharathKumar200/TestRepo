package com.thread1;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("User defined thraed");
		}

	}

}

class ThreadDemo1 {
	public static void main(String[] args) {

		MyRunnable r = new MyRunnable();

		new Thread(r).start();

		new Thread(new MyRunnable()).start();
	}
}
