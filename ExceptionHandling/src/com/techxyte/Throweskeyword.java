package com.techxyte;

import java.io.*;

public class Throweskeyword {

	void m2() throws InterruptedException, FileNotFoundException {
		Thread.sleep(1000);
		FileInputStream fis = new FileInputStream("abc.txt");

	}

	void m1() throws InterruptedException, FileNotFoundException {
		m2();
	}

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		Throweskeyword tk = new Throweskeyword();
        //try {
            tk.m1();
        //} catch (InterruptedException| FileNotFoundException e) {
          //  e.printStackTrace();
        //}
            System.out.println("hii");
	}

}

//Exception
//Ae//AIOB//STIOB