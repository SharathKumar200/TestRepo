package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchOperation {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.106:1521:XE", "system",
				"admin");

		System.out.println("Connection created succesfully" + connection);

		Statement statement = connection.createStatement();
		statement.addBatch("Create table emp(eid number , ename varchar2(30),esal number)");
		statement.addBatch("insert into emp values(888,'jon',10000)");
		statement.addBatch("insert into emp values(999,'janny',11000)");
		statement.addBatch("insert into emp values(101,'kiran',10000)");

		System.out.println("data inserted succefully.....");
		statement.addBatch("update emp set esal=esal+500 where esal=10000");
		System.out.println("updated succesfully....." + statement.getUpdateCount());
		/* statement.addBatch("drop table emp"); */

		int[] a = statement.executeBatch();
		for (int x : a) {
			System.out.println(x);
		}

		statement.close();
		connection.close();
		System.out.println("connection closed succesfully.......");

	}

}
