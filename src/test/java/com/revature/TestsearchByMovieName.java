package com.revature;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestsearchByMovieName {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Movie m = MovieSearch.searchByMovieName("DDLJ");
		System.out.println(m.movieName + m.movieId + m.releaseDate);
	}

		}

