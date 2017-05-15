package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateMovie {

	public static void update() throws ClassNotFoundException, SQLException {

		// Step 1: Get the connection
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/training_db";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);

		String sql = "update movies set movie_name='OK Kanmani' where movie_id = 1";

		PreparedStatement pst = con.prepareStatement(sql);
		// pst.setString(1, movieName);
		// pst.setInt(2, movieId);
		int rows = pst.executeUpdate();
		System.out.println("No of rows updated:" + rows);
	}
	
}
