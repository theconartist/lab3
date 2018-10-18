/*
    Programming for Computer Scientists (CS118) - Lab 3
    Conditionals and arrays
*/

// This class contains method stubs for the exercises in Lab 3
import java.util.*;

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
        int median = c;
        if ((a > b && a < c) || (a > c && a < b)) median = a;
        if ((b > a && b < c) || (b > c && b < a)) median = b; 
        return median;
    }

    // this method should calculate how much tax someone with the
    // specified income should pay according to the tax rules
    // given in the lab sheet
    public double taxToPay(int income) {
        float rate = 0.0f;
        float totalTax = 0;
        if (income > 150000) { 
            totalTax += (income - 150000) * 0.45;
            income = 150000;
        }

        if (income > 46350 && income <= 150000) {
            totalTax += (income - 46350) * 0.4;
            income = 46350;
        }

        if (income > 11850 && income <= 46350) {
            totalTax += (income - 11850) * 0.2;
        }

        return totalTax;
    }

    // given a digit (0-9), this method should return an array of bits
    // (represented as booleans) which indicate which
    public boolean[] segments(byte digit) {
        Map<Byte, boolean[]> display = new HashMap();
        display.put((byte) 0, new boolean[]{true, true, true, true, true, true, false});
        display.put((byte) 1, new boolean[]{false, true, true, false, false, false, false});
        display.put((byte) 2, new boolean[]{true, true, false, true, true, false, true});
        display.put((byte) 3, new boolean[]{true, true, true, true, false, false, true});
        display.put((byte) 4, new boolean[]{false, true, true, false, false, true, true});
        display.put((byte) 5, new boolean[]{true, false, true, true, false, true, true});
        display.put((byte) 6, new boolean[]{true, false, true, true, true, true, true});
        display.put((byte) 7, new boolean[]{true, true, true, false, false, false, false});
        display.put((byte) 8, new boolean[]{true, true, true, true, true, true, true});
        display.put((byte) 9, new boolean[]{true, true, true, true, false, true, true});

        return display.get(digit);
    }

    // given an array of digits (0-9), this method should return a byte for
    // each digit where the resulting byte indicates which segments should be
    // switched on such that the least significant bit corresponds to the 1st
    // segment and all but the most significant bit are used
    public byte[] segmentsBytes(byte[] digits) {
        Map<Byte, Byte> byteSegment = new HashMap();
        byteSegment.put((byte) 0, (byte) 63);
        byteSegment.put((byte) 1, (byte) 6);
        byteSegment.put((byte) 2, (byte) 91);
        byteSegment.put((byte) 3, (byte) 79);
        byteSegment.put((byte) 4, (byte) 102);
        byteSegment.put((byte) 5, (byte) 109);
        byteSegment.put((byte) 6, (byte) 125);
        byteSegment.put((byte) 7, (byte) 7);
        byteSegment.put((byte) 8, (byte) 127);
        byteSegment.put((byte) 9, (byte) 111);

        byte[] byteSegments = new byte[digits.length];
        for (int i = 0; i < digits.length; i++) {
            byteSegments[i] = byteSegment.get(digits[i]);
        }

        return byteSegments;
    }
}
