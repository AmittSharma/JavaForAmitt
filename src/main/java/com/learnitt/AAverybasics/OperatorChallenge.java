package com.learnitt.AAverybasics;

public class OperatorChallenge {

    public static void main ( String[] args ) {

        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double resultDouble = (firstDouble + secondDouble)*100.00;
        double remainder =  resultDouble%40.00;
        boolean isRemainderZero = remainder == 0.00 ? true : false;
        System.out.println (isRemainderZero);
        if(!isRemainderZero){
            System.out.println ("got some remainder");
        }
    }
}
