/*
 * package com.thread1;
 * 
 * class MyThread1 extends Thread { int n;
 * 
 * public MyThread1(int n) { this.n = n; }
 * 
 * public void run() { for (int i = 0; i <= 10; i++) { System.out.println(n +
 * " *" + i + " =" + n * i); try { Thread.sleep(1000); } catch
 * (InterruptedException e) {
 * 
 * e.printStackTrace(); } } } }
 * 
 * class MyThread2 {
 * 
 * public static void main(String[] args) throws InterruptedException {
 * 
 * MyThread1 t1 = new MyThread1(3); t1.join(); MyThread1 t2 = new MyThread1(4);
 * t1.start(); t2.start(); } }
 */
