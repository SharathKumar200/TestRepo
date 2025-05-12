package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcex5 {

	public static void main(String[] args) {
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.106:1521:XE", "system", "admin");
			System.out.println("Connection created succesfully" + connection);

			Statement statement = connection.createStatement();

			String q1 = "select * from emp";
			/* String q2 = "update emp set esal=esal+600 where esal>9000"; */

			boolean b = statement.execute(q1);
			if (b) {

				System.out.println("Selection statement........");
				ResultSet set = statement.getResultSet();

				while (set.next()) {
					System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getFloat(3));
				}
			} else {
				int a = statement.getUpdateCount();
				System.out.println("records are updated..." + a);

			}
			statement.close();
			connection.close();
			System.out.println("resoures released...");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
