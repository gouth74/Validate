package com.revature;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ListMovie {

		public static ArrayList<Movie> findAllMovies() throws ClassNotFoundException, SQLException {
		ArrayList<Movie> movieNameList = new ArrayList<Movie>();
		Connection con = ConnectionUtil.getConnection();
		String sql = "select movie_id,movie_name from movies";
		PreparedStatement pst = con.prepareStatement(sql);

		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int movieId = rs.getInt("movie_id");
			String movieName = rs.getString("movie_name");
			
			Movie m = new Movie();
			m.movieId = movieId;
			m.movieName = movieName;
			
			movieNameList .add(m);
		}
		rs.close();
		pst.close();
		con.close();
		return movieNameList;
	}

}


