package com.learnitt.ABcodeUnitsAndMethods;

public class ExpressionsAndKeywords {

    public static void main ( String[] args ) {
        /*
        * Java has below code units:
        * Expression: computes to a single value
        * Statement: standalone units of work
        * Code Blocks: set of more than zero statements usually grouped to achieve a single goal.
        * */

        int health = 100; // here health = 100 in an expression || datatype and semicolons are NOT part of expression.
        /*
        * int health = 100; this complete line is a statement
        * every statement ends with ;
        * */

        if(health <25){
            health = health + 25;
        }
        /*
        * here, health <25 | health + 25 | health = health + 25 are expressions
        * */

    }
}
