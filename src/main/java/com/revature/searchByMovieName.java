package com.revature;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class searchByMovieName {

	public static Movie searchByMovieName(String inputMovieName) throws ClassNotFoundException, SQLException {
		Movie m = null;
		Connection con = ConnectionUtil.getConnection();
		String sql = "select movie_id,movie_name,release_date from movies where movie_name = ?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, inputMovieName);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			int movieId = rs.getInt("movie_id");
			String movieName = rs.getString("movie_name");
			Date dt = rs.getDate("release_date");
			
			m = new Movie();
			m.movieId = movieId;
			m.movieName = movieName;
			m.releaseDate = dt.toLocalDate();
		}
		return m;
	}

	}
