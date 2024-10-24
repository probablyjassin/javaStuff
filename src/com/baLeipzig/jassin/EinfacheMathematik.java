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
}
