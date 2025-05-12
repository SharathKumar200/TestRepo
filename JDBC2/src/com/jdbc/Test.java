package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:oracle:thin:@192.168.0.106:1521/XE";
		String username = "system";
		String password = "admin";

		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
			System.out.println("connected to oracle database");
			connection.close();
		} catch (SQLException e) {
			System.out.println("connection failed.Error:" + e.getMessage());
			e.printStackTrace();
		}

	}

}