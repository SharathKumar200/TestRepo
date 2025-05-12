package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbcex4 {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.106:1521:XE", "system",
					"admin");
			System.out.println("connection created succefully...........");
			PreparedStatement statement = connection.prepareStatement("update emp set esal=esal+? where esal>?");
			statement.setFloat(1, 750);
			statement.setFloat(2, 10000);
			int x = statement.executeUpdate();
			System.out.println("data updated succefully..........." + x);

			statement.close();
			connection.close();
			System.out.println("resoures released...");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}