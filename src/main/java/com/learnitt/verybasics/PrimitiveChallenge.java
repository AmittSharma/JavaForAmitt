package com.learnitt.verybasics;

public class PrimitiveChallenge {
    public static void main ( String[] args ) {
        byte myByteNum = 10;
        short myShortNum = 20;
        int nyIntNum = 60;
        long myLongNum = 50000L + 10L*(myByteNum+myShortNum+nyIntNum);
        System.out.println (myLongNum);

        short myShortTotal = (short) (100 + 10*(myByteNum+myShortNum+nyIntNum));
        System.out.println (myShortTotal);
    }
}
