package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchOperationpreparest2 {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.106:1521:XE", "system",
				"admin");

		System.out.println("Connection created succesfully" + connection);

		PreparedStatement preparedStatement = connection.prepareStatement("update emp set ename=? where eid=?");
		preparedStatement.setString(1, "kumar");
		preparedStatement.setInt(2, 888);
		preparedStatement.addBatch();

		preparedStatement.setString(1, "gunda");
		preparedStatement.setInt(2, 101);
		preparedStatement.addBatch();

		preparedStatement.executeBatch();
		System.out.println("updated succesfully.....");

		preparedStatement.close();
		connection.close();
		System.out.println("connection closed succesfully.......");

	}

}
