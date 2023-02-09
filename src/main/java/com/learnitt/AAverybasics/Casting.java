package com.learnitt.AAverybasics;

public class Casting {

    public static void main ( String[] args ) {

        /*SYNTAX RULES*/
        short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE; // We can declare multiple var of diff types separated by ;
        byte myMinByteValue = Byte.MIN_VALUE, getMyMaxByteValue = Byte.MAX_VALUE; // We can declare multiple var of same type separated by ,

        int myTotal = (myMinIntValue/2);
        System.out.println("Half of Minimum Int value: " + myTotal);

        /**************************************************************************************************************/

        /*
        * In below eg, compiler does not attempt to evaluate a value in var
        * BY DEFAULT IT CONSIDERS NUMBERS AS int
        * So it doesn't know if the final values fits the var data type OR not
        * Hence, throws error.
        * */

//        byte myHalfMinByteValue = (myMinByteValue/2);

        /**************************************************************************************************************/

        /*
        * In this example, java can figure out the end result at compile time
        * and if it can fit into the byte variable.
        * Hence, no error thrown.
        * */
        byte myHalfMinByteValue = (-128/2);

        /**************************************************************************************************************/

        /*
        * What is Casting ?
        * Converting a number from one type to another type.
        * */

        byte myCastedHalfMinByteValue = (byte) (myMinByteValue/2);
    }
    /**************************************************************************************************************/
}
