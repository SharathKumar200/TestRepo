package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Transactionex1 {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		Savepoint savepoint = null;
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.106:1521:XE", "system", "admin");

			System.out.println("Connection created succesfully" + connection);

			statement = connection.createStatement();
			connection.setAutoCommit(false);

			statement.executeUpdate("insert into emp values(999,'arun',15000)");
			statement.executeUpdate("insert into emp values(102,'sagar',15000)");
			savepoint = connection.setSavepoint();
			statement.executeUpdate("insert into emp values(103,'sunil',15000)");
			statement.executeUpdate("insert into emp values(104,'veera',15000)");
			statement.executeUpdate("update emp set esal=esal+500 where esal>15000");
			statement.executeUpdate("delete from emp where eid=102");

			connection.commit();

			System.out.println("transaction succesfull.......");

		} catch (Exception e) {
			e.printStackTrace();
			connection.rollback(savepoint);
			System.out.println("transaction succesfail.......");

		} finally {
			if (statement != null)
				statement.close();
			connection.close();
			System.out.println("connection closed succesfully.......");
		}

	}

}
