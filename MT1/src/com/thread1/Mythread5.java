package com.thread1;

class My extends Thread {
	public void run() {
		for (int i = 0; i <= 1; i++) {
			System.out.println("daemon Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Mythread5 {

	public static void main(String[] args) {
		My t = new My();

		t.start();
		System.out.println(t.getId());
		System.out.println(t.isAlive());
		System.out.println(t.isDaemon());
		System.out.println(t.getPriority());
		System.out.println(t.activeCount());

	}

}
