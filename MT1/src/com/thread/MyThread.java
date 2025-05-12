package com.thread;

class Demo extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Good morning........" + Thread.currentThread().getName());
			/* System.out.println(Thread.currentThread().getName()); */
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MyThread {

	public static void main(String[] args) {
		Demo t1 = new Demo();
		Demo t2 = new Demo();
		Demo t3 = new Demo();

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
	}

}
