package com.baLeipzig.jassin;

public class Loops {
    public static void main(String[] args) {
        // 1. alle geraden Zahlen bis 20
        for (int i=2; i<=20; i+=2) {
            System.out.println(i);
        }

        // 2. 2er Potenzen bis 1024
        for (int i=2; i<=10; i++) {
            System.out.println(Math.round(Math.pow(2, i)));
        }

        // 3. Wochen mit Tagen
        for (int i=1; i<=3; i++) {
            for (int j=1; j<=7; j++) {
                System.out.println("Woche " + i + ", Tag " + j);
            }
        }
    }
}
