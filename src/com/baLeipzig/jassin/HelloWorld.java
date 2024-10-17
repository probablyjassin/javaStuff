package com.baLeipzig.jassin;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("Anzahl der Argumente: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println(1 + 2 + "Studierende");
        System.out.println("Studierende"+ 1 + 2);
    }
}
