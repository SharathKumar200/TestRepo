package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class Jdbcex6 {

	public static void main(String[] args) throws SQLException {
		Connection connection;
		try {
			connection = TestCon.createConnection();
			DatabaseMetaData metaData = connection.getMetaData();

			System.out.println(metaData.getDatabaseProductName());
			System.out.println(metaData.getDatabaseProductVersion());
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
