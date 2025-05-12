package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTryresourse {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.106:1521:XE", "system",
				"admin"); Statement statement = connection.createStatement();) {
			System.out.println("connected succesfully......!");
			
			statement.executeUpdate("insert into emp values(444,'brunda',20000)");
			statement.executeUpdate("insert into emp values(222,'kumar',11000)");
			statement.executeUpdate("insert into emp values(555,'harish',20000)");
			System.out.println("data inserted succefully.....");


			ResultSet set = statement.executeQuery("select * from emp");
			while (set.next()) {
				System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getFloat(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
