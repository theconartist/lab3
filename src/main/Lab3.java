/*
    Programming for Computer Scientists (CS118) - Lab 3
    Conditionals and arrays
*/

// This class contains method stubs for the exercises in Lab 3
public class Lab3 {

    // this method should return the smaller of the two integers
    public int min(int x, int y) {
        return x < y ? x : y;
    }

    // this method should return the larger of the two integers
    public int max(int x, int y) {
        return x > y ? x : y;
    }

    // this method should return the median of the three integers
    public int median(int a, int b, int c) {
        if (a > b && a < c || a > c && a < a) return a;
        if (a > b && a < c || a > c && a < a) return a;
        if (a > b && a < c || a > c && a < a) return a;
    }

    // this method should calculate how much tax someone with the
    // specified income should pay according to the tax rules
    // given in the lab sheet
    public double taxToPay(int income) {
        return 0; // this is everyone's dream
    }

    // given a digit (0-9), this method should return an array of bits
    // (represented as booleans) which indicate which
    public boolean[] segments(byte digit) {
        // initialise an array of 7 booleans,
        // all of which are initailised to false
        boolean[] result = new boolean[]
            { false, false, false, false, false, false, false };

        return result;
    }

    // given an array of digits (0-9), this method should return a byte for
    // each digit where the resulting byte indicates which segments should be
    // switched on such that the least significant bit corresponds to the 1st
    // segment and all but the most significant bit are used
    public byte[] segmentsBytes(byte[] digits) {
        byte[] results = new byte[digits.length];

        return results;
    }
}
