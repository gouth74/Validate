package com;

public class GradeUtil {

	public static String getGrade(int marks){
		String grade = null ;
		if (marks >= 90) {
			grade = "S";
		}
		else if ( marks >= 80 && marks < 90) {
			grade = "A";
		}
		else if ( marks >= 70 && marks < 80) {
			grade = "B";
		}
		else if ( marks >= 60 && marks < 70) {
			grade = "C";
		}
		else if ( marks >= 50 && marks < 60) {
			grade = "D";
		}
		else if ( marks < 50 ) {
			grade = "F";
		}
		return grade;
	}
}
