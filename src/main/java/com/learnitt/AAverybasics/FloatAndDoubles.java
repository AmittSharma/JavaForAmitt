package com.learnitt.AAverybasics;

public class FloatAndDoubles {

    /*
     * Java uses float & double types to handle the decimal numbers.
     * double is the default type in java to handle decimal numbers.
     * double is more precise and has large range to handle the decimals.
     */

    public static void main ( String[] args ) {
        System.out.println ( "float ranges from :" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + "with size: " + Float.SIZE );
        System.out.println ( "double ranges from :" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + "with size: " + Double.SIZE );

        /*************************************************************************/

        int myIntNumber = 5;
        float myFloatNumber = 5;
        double myDoubleNumber = 5;
//        float myOtherFloatNumber = 5.89;
        /*
         * The above statement has a compiler error as it seems to java that we are assigning a double value to a float var.
         * We can use casting or suffixing to handle this.
         */

        float myAnotherFloatNumber = 5.89f;
        float myOneMoreFloatNumber = (float) 6.22;

        /****************************************************************************/

        myIntNumber = 5 / 2;
        myFloatNumber = 5f / 2f;
        myDoubleNumber = 5d / 2d;

        System.out.println ( "myIntNumber: " + myIntNumber );
        System.out.println ( "myFloatNumber: " + myFloatNumber );
        System.out.println ( "myDoubleNumber: " + myDoubleNumber );

        myIntNumber = 5 / 3;
        myFloatNumber = 5f / 3f;
        myDoubleNumber = 5d / 3d;

        System.out.println ();
        System.out.println ( "myIntNumber: " + myIntNumber );
        System.out.println ( "myFloatNumber: " + myFloatNumber );
        System.out.println ( "myDoubleNumber: " + myDoubleNumber );

        /*
         * double is better choice for decimal numbers in java.
         * - Many modern computers process it faster.
         * - Many java libraries are written to process doubles NOT floats.
         * - And of-course, double is more precise and have a large range than float.
         * */

        /************************************Challenge************************************/

        /*
         * Converting pounds to kilograms
         * 1 pound = 0.45359237 kg
         */

        double weightInPound = 200d;
        double weightInKg = weightInPound * 0.45359237d;

        /* suffix d is not mandatory here, but it's good for consistency of code*/

        System.out.println ( "\n" + weightInPound + " pounds equals to " + weightInKg + " kg" );

        /*
         * IMPORTANT POINT:
         * Nowadays, we should use BIGDECIMAL class for decimal number calculations instead of float and double
         *
         */

    }
}
