package com.learnitt.AAverybasics;

public class PrimitiveTypes {

    public static void main ( String[] args ) {

        /*
         * PRIMITIVE TYPES IN JAVA
         * Whole Number: byte | short | int | long
         * Real Number: float | double
         * Single Character: char
         * Boolean value: boolean
         * */

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println ( "Minimum Integer Value allowed is: " + myMinIntValue );
        System.out.println ( "Maximum Integer Value allowed is: " + myMaxIntValue );

        /**************************************************************************************************************/
        /*OVERFLOW SITUATION*/
        System.out.println ( "Busted Max Value: " + (myMaxIntValue + 1) );
        /*Output: Busted Max Value: -2147483648*/

        /*UNDERFLOW SITUATION*/
        System.out.println ( "Busted Min Value: " + (myMinIntValue - 1) );
        /*Output: Busted Min Value: 2147483647*/

        /* In above scenario, The values wraps-around without giving an error.*/

        /*Direct assignment of out of range values will give compiler errors
         * try uncommenting below single line comment */

//        int moreThanMaxNum = 2147483648;
        /**************************************************************************************************************/

        /*SYNTAX*/

//        int wrongSyntax = 1,234,567,890;

        int correctSyntax = 1_234_567_890;
        int betterSyntax = 1234567890;

        /* start _ from last 3 digits*/

        /**************************************************************************************************************/

        /*Similarly we can work with other Wrapper classes*/

        System.out.println ( "\n" );
        System.out.println ( "Byte value range: (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ") & Size: " + Byte.SIZE );
        System.out.println ( "Short value range: (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ") & Size: " + Short.SIZE );
        System.out.println ( "Integer value range: (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ") & Size: " + Integer.SIZE );
        System.out.println ( "Long value range: (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ") & Size: " + Long.SIZE );

        /**************************************************************************************************************/

        /*DECLARING LONG CORRECTLY*/

//        Long wrongLong = 123456789;
        Long correctLong = 123456789L;

        /*************************************** NEXT == Casting ******************************************************/

    }
}
