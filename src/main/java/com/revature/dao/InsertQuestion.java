package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQuestion{

		public static void insert(String Q_Text, int Q_Type, int Q_Score) throws Exception {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/question_db";
			String username = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(url, username, password);

			String sql = "INSERT INTO question(Q_Text,Q_Type,Q_Score) VALUES(?,?,?) "; 
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, Q_Text);
			pst.setInt(2, Q_Type);
			pst.setInt(3, Q_Score);
			int rows = pst.executeUpdate();
			System.out.println("No of rows inserted:" + rows);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Unable to connect DB");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Unableto to add QType");
		}
}
}
