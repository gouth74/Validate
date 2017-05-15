package com.revature;

import java.sql.SQLException;
import java.util.Scanner;

public class TestInsertQues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int qid,aid,y;
		String ans = null;
		Scanner s = new Scanner(System.in);
	    do
	    {
			System.out.println("enter the question type");
	     	System.out.println("1.Choose the best answer 2.Fill in the blanks");
		    int ch = s.nextInt();
		    s.nextLine();
		if (ch == 1) {
			System.out.println("Enter the question:");
			String q = s.nextLine();
			System.out.println("Enter the question score:");
			int sc = s.nextInt();
		    InsertQues(q, 1, sc);
		    qid=find_qid(q);
		    if (qid!=0)
			{
		    System.out.println("Enter the four options");
			int i = 0;
			while (i < 4) {
				System.out.println("Enter option" + (i + 1) + "\n");
				String op = s.next();
				insertoption(op, qid);
				i++;
			}
			}
		    else
		    	System.out.println("no such a question");
			System.out.println("Enter the correct answer");
			ans = s.next();
			aid = find_aid(ans, qid);
			if (aid != 0) {
				insertans(qid, aid);
			} else
				System.out.println("error");
		} 
		else 
		{
			System.out.println("Enter the question for filling must be ----");
			String q = s.nextLine();
			if (q.contains("----")) {
				System.out.println("Enter the question score");
				int sc = s.nextInt();
				 insertques(q, 2, sc);
				qid=find_qid(q);
			    if (qid!=0)
				{
			    	System.out.println("enter the answer");
					ans = s.next();
					insertoption(ans, qid);
				}
			    else
			    	System.out.println("no such a question");
		  		aid = find_aid(ans, qid);
				if (aid != 0)
					insertans(qid, aid);
				else
					System.out.println("error");

			} else
				System.out.println("The question pattern is wrong. Try again");
		}
		System.out.println("Do you want to give another question give 1");
		  y=s.nextInt();
	    }
		while(y==1);
	    
	}
