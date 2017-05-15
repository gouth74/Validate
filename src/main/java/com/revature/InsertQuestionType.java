package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQuestionType{

		public static void insert(String Question_Type) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/question_db";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);

		String sql = "INSERT INTO question_type(Question_Type) VALUES(?)"; 
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, Question_Type);
		int rows = pst.executeUpdate();
		System.out.println("No of rows inserted:" + rows);
}
}
