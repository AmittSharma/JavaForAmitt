package com.learnitt.AAverybasics;

public class TernaryOperator {

    public static void main ( String[] args ) {

        /*
        * Syntax:
        * operand 01 ? operand 02 : operand 03
        * if this statement is TRUE ? then return this : else return this
        * */

        int age = 34;
        String s = age > 18 ? "They can vote in India" : "They cannot vote in India";
        System.out.println (s);

    }
}
