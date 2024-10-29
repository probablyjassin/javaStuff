package com.baLeipzig.jassin;

public class EinfacheMathematik {

    public static int ggT(int a, int b) {
        // kleinster gemeinsamer Teiler
        if (a == b) {
            return a;
        }
        else if (a > b) {
            return ggT(a - b, b);
        }
        else {
            return ggT(a, b - a);
        }
    }

    public static void rekursionDemo(int tiefe) {
        if (tiefe < 1) {
            System.out.println("Rekursionstiefe erreicht");
        }
        else {
            System.out.println("Rekursionstiefe " + tiefe);
            rekursionDemo(tiefe - 1);
        }
    }
    // call rekursionDemo(5) to see the output
    public static void main(String[] args) {
        rekursionDemo(9999);
    }
}
