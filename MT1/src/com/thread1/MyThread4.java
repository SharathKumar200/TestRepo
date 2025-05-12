
package com.thread1;

public class MyThread4 {

	public static void main(String[] args) throws InterruptedException {
		Demo1 t1 = new Demo1(3);
		Demo1 t2 = new Demo1(4);

		t1.start(); 
		t1.join(); 

		t2.start(); 
	}

}

class Demo1 extends Thread {
	int n;

	public Demo1(int n) {
		this.n = n;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
			try {
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}