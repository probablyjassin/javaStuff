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

        String hello = "Hello", lo = "lo";
        System.out.print((hello == "Hello") + " ");
        System.out.print((hello == "Hello") + " ");
        System.out.print((hello == ("Hel" + "lo")) + " ");
        System.out.print((hello == ("Hel" + lo)) + " ");
        System.out.println(hello == ("Hel" + lo).intern());

        System.out.println("Hello World".indexOf("o"));

        int dezimalWert = 10435;
        // int oktalWert = 0243; // compiler complains lol
        int hexWert = 0x28;
        int binWert = 0b1010;
        int dezimalWert2 = 10_435;

        long dezimalWertL = 10435L;

        char ichBinEinChar = 'x';
        char ichBinEinChar2 = 120;
        char ichBinEinChar3 = '\u0078';

        String nichts = null;
        String leer;

        // System.out.println(nichts);

        final int TAGE_PRO_WOCHE = 7;
        final double pi = 3.1415926535897932384626433832795028841;
        System.out.println(pi);
    }
}
