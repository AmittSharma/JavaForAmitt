package com.learnitt.AAverybasics;

public class OperatorOperandsExpressions {
    public static void main ( String[] args ) {
        int result = 1 + 2;
        System.out.println ( "Result: " + result );
        /*
         * here =  & + are two operators
         * here 1,2 are operands
         * */

        int previousResult = result;

        result = result - 1;

        System.out.println ( "ResultNow: " + result );
        System.out.println ( "Previous result: " + previousResult );

        /***************************Playing with Char datatype*********************************/

        char firstChar = 'z';
        char secondChar = 'r';

        System.out.println ( firstChar + secondChar );
        System.out.println ( "" + firstChar + secondChar );
        System.out.println ( " + after a string will concatenate anything after +" );

        /**************************Modulus Operator******************************************/

        result = 5;
        System.out.println ( "Remainder when 5 divided by 2: " + result % 2 );

        /********************************Short Hand Operators**********************************/

        result++;
        result--;
        result += 5;
        result -= 5; // This actually mean is: result = (data type of result)( result - 5);
        result *= 5;
        result /= 5;


    }
}
