package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbcex3 {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.107:1521:XE", "system",
					"admin");
			System.out.println("connection created succefully...........");
			PreparedStatement statement = connection.prepareStatement("insert into emp values(?,?,?)");
			try (Scanner scanner = new Scanner(System.in)) {
				while (true) {

					System.out.println("enter employee eid:");
					int eid = scanner.nextInt();

					System.out.println("enter employee ename:");
					String ename = scanner.next();

					System.out.println("enter employee esal:");
					Double esal = scanner.nextDouble();

					statement.setInt(1, eid);
					statement.setString(2, ename);
					statement.setDouble(3, esal);
					System.out.println("data inserted successfully");
					statement.executeUpdate();

					System.out.println("if you want to continue Enter(yes/no)");
					String Option = scanner.next();
					if (Option.equals("no"))
						;
					break;
				}
				scanner.close();
				statement.close();
				connection.close();
				System.out.println("resoures released...");
			}
		}

		catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
