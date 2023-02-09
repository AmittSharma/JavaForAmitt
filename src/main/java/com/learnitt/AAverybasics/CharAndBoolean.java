package com.learnitt.AAverybasics;

public class CharAndBoolean {

    public static void main ( String[] args ) {
        /*
        * char stores a SINGLE CHARACTER with it.
        * occupies 2 bytes of memory.
        */

        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F'; // this is backslash U notation
        char myDecimalChar = 63;

        System.out.println ("My labels are: "+ mySimpleChar +" "+ myUnicodeChar+" "+myDecimalChar);

        /*************************BOOLEANS***********************************/

        boolean isThisTrueBoolean = true;
        boolean isThisNotFalseBoolean = false;

        System.out.println (isThisTrueBoolean +" - "+ isThisNotFalseBoolean);
    }
}
