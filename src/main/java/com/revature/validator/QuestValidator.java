package com.revature.validator;

public class QuestValidator {

	public static void validateInsertQuestionType(String Qtext, int qtype, int score) throws Exception {
		// TODO Auto-generated method stub

		if (Qtext == null || Qtext.trim().equals("")) {
			throw new Exception("Invalid Question Type");
		}
	}

}
