package com.baLeipzig.jassin;

public class Loops {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("for loop: " + i);
        }

        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println("while loop: " + j);
            j++;
        }

        // do-while loop
        int k = 0;
        do {
            System.out.println("do-while loop: " + k);
            k++;
        } while (k < 5);

        // 1. alle geraden Zahlen bis 20
        for (int i=2; i<=20; i+=2) {
            System.out.println(i);
        }

        // 2. 2er Potenzen bis 1024
        for (int i=2; i<=10; i++) {
            System.out.println(Math.round(Math.pow(2, i)));
        }
    }
}
