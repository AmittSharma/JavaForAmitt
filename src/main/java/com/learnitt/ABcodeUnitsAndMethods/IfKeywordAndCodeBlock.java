package com.learnitt.ABcodeUnitsAndMethods;

public class IfKeywordAndCodeBlock {

    public static void main ( String[] args ) {

        /*Challenge*/

        boolean gameOver = true;
        int levelCompleted = 5;
        int score = 800;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println ( "Your final score is: " + finalScore );
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println ( "Your final score is: " + finalScore );
        }

    }
}
