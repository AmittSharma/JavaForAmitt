package com.learnitt.CodingExercise;

public class TeenNumberChecker {
    public static void main ( String[] args ) {
        System.out.println (hasTeen(1,2,3));
        System.out.println ( isTeen (1));
    }

    public static boolean isTeen ( int num ) {
        if(num >= 13 && num <= 19)
            return true;
        return false;
    }

    public static boolean hasTeen ( int firstNum, int secondNum, int thirdNum ) {
        int[] numArray = {firstNum,secondNum,thirdNum};
        for (int num:numArray) {
            if(num >= 13 && num <= 19)
                return true;
        }
        return false;
    }
}
