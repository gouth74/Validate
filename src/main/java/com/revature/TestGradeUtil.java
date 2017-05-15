package com.revature;

import com.GradeUtil;

public class TestGradeUtil {

    public static void main(String[] args) {
 
        testCase1();
        testCase2();
        testCase3();
    }
 
    // testcase 1 : Marks greater than 90
    private static void testCase1() {
 
        String result1 = GradeUtil.getGrade(25);
        System.out.println(result1);
    }
 
    // testcase 2 : Marks less than 45
    private static void testCase2() {
 
        String result1 = GradeUtil.getGrade(99);
        System.out.println(result1);
    }
 
    // testcase 3 : Marks less than 60
    private static void testCase3() {
 
        String result1 = GradeUtil.getGrade(75);
        System.out.println(result1);
    }
 
}