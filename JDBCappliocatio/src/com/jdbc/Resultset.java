package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Resultset {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.106:1521:XE", "system",
				"admin");

		System.out.println("Connection created succesfully" + connection);

		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet set = statement.executeQuery("select * from emp");
		set.afterLast();
		while (set.previous()) {
			System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getFloat(3));
		}

		set.first();
		System.out.println(set.getInt(1));

		set.last();
		System.out.println(set.getInt(1));
		set.absolute(2);
		System.out.println(set.getInt(1));

		set.close();
		statement.close();
		connection.close();
		System.out.println("connection closed succesfully.......");
	}

}
