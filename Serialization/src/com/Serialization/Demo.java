package com.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Emp2> al = new ArrayList<Emp2>();

		al.add(new Emp2(111, "sharath"));
		al.add(new Emp2(222, "harish"));
		al.add(new Emp2(333, "brunda"));
		al.add(new Emp2(444, "bhuvana"));
		FileOutputStream fss = new FileOutputStream("abc.txt");

		ObjectOutputStream oss = new ObjectOutputStream(fss);
		oss.writeObject(al);
		oss.close();
		System.out.println("close serilalization");

		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Emp2> e = (ArrayList<Emp2>) ois.readObject();
		for (Emp2 e1 : al)
			System.out.println(e1.eid + " " + e1.ename);
		ois.close();

	}

}
