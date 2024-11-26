package com.baLeipzig.jassin;

public class Handling {
    public static void main(String[] args) {
        int anzahlSitze = -5;
        if (anzahlSitze < 0) {
            throw new IllegalArgumentException("Anzahl Sitze darf nicht negativ sein");
        }
        else {
            System.out.println("Anzahl Sitze: " + anzahlSitze);
        }
    }
}
