package com.baLeipzig.jassin;

import java.util.Random;

public class Operators {
    public static void main(String[] args) {

        byte a15_1 = 2;
        byte b15_1 = 2;
        byte c15_1 = (byte) (a15_1 + b15_1);

        int a15_2 = 1_000_000;

        System.out.println(Math.pow(a15_2, 2));

        int a15_3 = 69;
        // int impossible = a15_3 / 0; // error devide by zero

        float a15_4 = 1;
        float maybe = (float) (a15_4 / 0);

        System.out.println(maybe);
        System.out.println(maybe - 1);
        System.out.println(maybe + maybe);
        System.out.println(maybe - maybe);

        int a16 = 69;
        int b16 = 420;
        a16 = ++b16;
        System.out.println(a16);
        System.out.println(b16);

        byte c16 = 127;
        System.out.println(c16);
        c16++;
        System.out.println(c16);

        java.util.Random random = new Random();

    }
}
