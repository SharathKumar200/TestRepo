package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcex2 {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Driver loading completed");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.107:1521:XE", "system", "admin");

			System.out.println("Connection created succesfully" + connection);

			statement = connection.createStatement();

			statement.executeUpdate("insert into emp values(111,'sharath',10000)");
			statement.executeUpdate("insert into emp values(222,'kumar',11000)");
			statement.executeUpdate("insert into emp values(333,'bhuvan',10000)");
			System.out.println("data inserted succefully.....");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();

				if (connection != null)
					connection.close();
				System.out.println("connection closed succesfully.......");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
