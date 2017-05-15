package com.revature.dao;


public class InsertQuestion{

		public static void insert(String Q_Text, int Q_Type, int Q_Score) throws ClassNotFoundException, SQLException {
		
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
}
}
InsertQuestion.java

package assesment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

	// TODO Auto-generated method stub

	
	public static void showqtype() throws ClassNotFoundException, SQLException {

		Connection con = connection.myconnection();
		String sql = "select * from QType";
		PreparedStatement p = con.prepareStatement(sql);
		ResultSet rs = p.executeQuery();
		while (rs.next()) {
			System.out.println("id=" + rs.getInt("id") + "\t Question type =" + rs.getString("Qtype")
					+ "\t Active status=" + rs.getBoolean("is_active") + "\n");
		}

	}

	public static void insertques(String d, int i, int sc) throws ClassNotFoundException, SQLException {
		Connection con = connection.myconnection();
		String sql = "insert into ques (qtext,qty,qscore) values (?,?,?)";
		PreparedStatement p = con.prepareStatement(sql);
		p.setString(1, d);
		p.setInt(2, i);
		p.setInt(3, sc);
		int rows = p.executeUpdate();
		System.out.println("no of rows inserted" + rows);
	}

	public static void insertoption(String d, int i) throws ClassNotFoundException, SQLException {
		Connection con = connection.myconnection();
		String sql = "insert into aoption (anstext,qtext) values (?,?)";
		PreparedStatement p = con.prepareStatement(sql);
		p.setString(1, d);
		p.setInt(2, i);
		int rows = p.executeUpdate();
		System.out.println("no of rows inserted" + rows);
	}

	public static int find_aid(String a, int qno) throws ClassNotFoundException, SQLException {
		Connection con = connection.myconnection();
		String sql = "select id from aoption where qtext=? and anstext=?";
		PreparedStatement p = con.prepareStatement(sql);
		p.setInt(1, qno);
		p.setString(2, a);
		ResultSet rs = p.executeQuery();
		if (rs.next())
			return rs.getInt("id");
		return 0;
	}

	public static void insertans(int d, int i) throws ClassNotFoundException, SQLException {
		Connection con = connection.myconnection();
		String sql = "insert into canswer (qid,ansid) values (?,?)";
		PreparedStatement p = con.prepareStatement(sql);
		p.setInt(1, d);
		p.setInt(2, i);
		int rows = p.executeUpdate();
		System.out.println("no of rows inserted" + rows);
	}
	public static int find_qid(String a) throws ClassNotFoundException, SQLException {
		Connection con = connection.myconnection();
		String sql = "select id from ques where qtext=?";
		PreparedStatement p = con.prepareStatement(sql);
		p.setString(1, a);
		ResultSet rs = p.executeQuery();
		if (rs.next())
			return rs.getInt("id");
		return 0;
	}
}
