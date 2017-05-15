package com.revature;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ArrayList<Movie> movieNameList = ListMovie.findAllMovies();
		
		for (Movie movie : movieNameList) {
			System.out.println(movie.movieId + "-" + movie.movieName);
		}
	}

	}


