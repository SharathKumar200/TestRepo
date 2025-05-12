package com.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test1 {
	void Serilizationdemo() throws IOException {
		Emp e = new Emp(111, "sharath");
		FileOutputStream fss = new FileOutputStream("abc.txt");

		ObjectOutputStream oss = new ObjectOutputStream(fss);
		oss.writeObject(e);
		oss.close();
		System.out.println("close serilalization");

	}

	void deSerialization() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e = (Emp) ois.readObject();
		System.out.println(e.eid + " " + e.ename);
		ois.close();

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Test1 t = new Test1();
		t.Serilizationdemo();
		t.deSerialization();
	}

}
