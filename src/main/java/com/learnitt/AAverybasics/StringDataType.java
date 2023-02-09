package com.learnitt.AAverybasics;

public class StringDataType {

    public static void main ( String[] args ) {
        /*
        * String is used to store a sequence of char.
        */

        String myString = "This is my string. ";
        System.out.println ("My String is: " + myString);

        String myMoreString = "This is more string.";
        System.out.println (myString + myMoreString);
        /*
        * Here + is used for concatenation of two strings
        * + used after a String starts concatenating everything after it as string.
        * */

        /**************************STRING ARE IMMUTABLE****************************************************************/

        /*
        * Strings are IMMUTABLE which means, once assigned, you can't change its value.
        * everytime you concatenate string using + operator, java creates a new String object in the memory.
        * We will see StringBuilder Class which is Mutable to handle concatenation more efficiently.
        * */
    }
}
