package com.learnitt.CodingExercise;

public class EqualSumChecker {
    public static void main ( String[] args ) {
        System.out.println (hasEqualSum(1,2,3));
    }

    public static boolean hasEqualSum ( int firstNum, int secondNum, int thirdNum ) {
        return firstNum + secondNum == thirdNum;
    }


}
