package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcexupdate {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Driver loading completed");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.106:1521:XE", "system", "admin");

			System.out.println("Connection created succesfully" + connection);

			statement = connection.createStatement();

			int x = statement.executeUpdate("update emp set esal=esal+600 where esal>9000");
			System.out.println("Data inserted successfully.............." + x);
			int x1 = statement.executeUpdate("delete from emp where esal>12000");
			System.out.println("Data deleted successfully.............." + x1);
			
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