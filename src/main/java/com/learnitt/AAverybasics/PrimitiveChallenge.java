package com.learnitt.AAverybasics;

public class PrimitiveChallenge {
    public static void main ( String[] args ) {
        byte myByteNum = 100;
        short myShortNum = 200;
        int myIntNum = 6000;
        long myLongNum = 50000L + 10L * (myByteNum + myShortNum + myIntNum); // the L is option if the value is less than the max int value
        System.out.println ( myLongNum );

        short myShortTotal = (short) (100 + 10 * (myByteNum + myShortNum + myIntNum));
        System.out.println ( myShortTotal );
    }
}
