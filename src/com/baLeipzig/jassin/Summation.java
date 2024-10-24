package com.baLeipzig.jassin;

public class Summation {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i <= 49; i++) {
            total += 2 * i + 1;
        }
        System.out.println(total);

        int n = 123456;
        int m = 0;

        while (n > 0) {
            m += (10 * m) +  (n % 10);
            n /= 10;
        }
        System.out.println(m);

        int x = 1, summe = 0;
        do {
            summe += x;
            x++;
        } while (x < 100);
        System.out.println(summe);
    }
}
