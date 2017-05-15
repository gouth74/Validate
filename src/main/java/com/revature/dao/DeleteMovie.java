package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteMovie {

	public static void delete(String movieName) throws ClassNotFoundException, SQLException {

		// Step 1: Get the connection
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/training_db";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);

		String sql = "delete from movies where  movie_name = ?";

		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, movieName);

		int rows = pst.executeUpdate();
		System.out.println("No of rows deleted:" + rows);
	}
	}
