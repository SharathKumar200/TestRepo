package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcex7 {

	public static void main(String[] args) throws SQLException {
		Connection connection = TestCon.createConnection();

		Statement set = connection.createStatement();

		ResultSet sta = set.executeQuery("select * from emp");
		ResultSetMetaData metaData = sta.getMetaData();
		System.out.println(metaData.getColumnCount());
		System.out.println(metaData.getColumnClassName(1));
		System.out.println(metaData.getColumnTypeName(2));

	}

}
