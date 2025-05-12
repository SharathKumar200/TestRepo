/*
 * package com.thread;
 * 
 * class MyThread extends Thread { public void run() { for (int i = 0; i < 10;
 * i++) { System.out.println("User defined by thread");
 * 
 * try { Thread.sleep(50); } catch (InterruptedException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); }
 * 
 * } System.out.println(Thread.currentThread().getName());
 * System.out.println(Thread.currentThread().getName()); } }
 * 
 * public class ThreadDemo { public static void main(String[] args) { MyThread t
 * = new MyThread(); MyThread t1 = new MyThread(); t.start(); t1.start();
 * t.interrupt(); System.out.println(Thread.currentThread().getName());
 * Thread.currentThread().setName("vk");
 * System.out.println(Thread.currentThread().getName()); t.start(); for (int i =
 * 0; i < 10; i++) { System.out.println("  main thread"); } } }
 */
