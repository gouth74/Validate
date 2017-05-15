
package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieDb {



	public static void findAllMovies() throws ClassNotFoundException, SQLException {
		// Step 1: Get the connection
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/training_db";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);

		String sql = "select movie_id,movie_name from movies";
		PreparedStatement pst = con.prepareStatement(sql);

		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int movieId = rs.getInt("movie_id");
			String movieName = rs.getString("movie_name");
			System.out.println("MovieId=" + movieId + ",MovieName=" + movieName);
		}
	}

	public static void insert() throws ClassNotFoundException, SQLException {
		String movieName = "Theri";

		// Step 1: Get the connection
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/training_db";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);

		String sql = "INSERT INTO movies (movie_id, movie_name, LANGUAGE, description, director, type_of_movie, casting, release_date) VALUES(9, 'DHARMADURAI','Tamizh','COMEDY','XXXX','abcd','VIJAY SEDHUPATHI','2016-05-31')";
		PreparedStatement pst = con.prepareStatement(sql);
		int rows = pst.executeUpdate();
		System.out.println("No of rows inserted:" + rows);
	}

	public static void update() throws ClassNotFoundException, SQLException {

		// Inputs
		String movieName = "DDLJ";
		int movieId = 1;

		// Step 1: Get the connection
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/training_db";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);

		String sql = "update movies set movie_name='DDLJ' where movie_id = 1";

		PreparedStatement pst = con.prepareStatement(sql);
		// pst.setString(1, movieName);
		// pst.setInt(2, movieId);
		int rows = pst.executeUpdate();
		System.out.println("No of rows updated:" + rows);
	}

	public static void delete() throws ClassNotFoundException, SQLException {

		// Inputs
		String movieName = "Theri";

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