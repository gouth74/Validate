package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

		public static Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName ("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/training_db";
			String username = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
}