package com.learnitt.CodingExercise;

public class DecimalComparator {
    public static void main ( String[] args ) {

        System.out.println ( areEqualByThreeDecimalPlaces ( 2.569, 3.365 ) );
        System.out.println ( areEqualByThreeDecimalPlaces ( 2.569, 2.569 ) );
        System.out.println ( areEqualByThreeDecimalPlaces ( 2.569, 2.5695 ) );
        System.out.println ( areEqualByThreeDecimalPlaces ( 3.176, 3.175 ) );

    }

    public static boolean areEqualByThreeDecimalPlaces ( double firstValue, double secondValue ) {

        double valueOne =  firstValue * 1000;
        double valueTwo =  secondValue * 1000;
        if ((int)valueOne == (int)valueTwo) {
            return true;
        }
        return false;
    }
}
