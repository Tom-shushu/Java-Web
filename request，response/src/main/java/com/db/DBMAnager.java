package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DBMAnager {

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(Driver.class.getName());
		} catch (ClassNotFoundException e) {
			System.out.println("驱动文件未找到!");
		}
		String url = "jdbc:mysql://localhost:3307/db1";
		String user = "root";
		String password = "a123456";
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}

}
