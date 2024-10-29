package com.baLeipzig.jassin;

public class Fahrzeug {
    private static int anzahlFahrzeuge = 0;

    public static int getanzahlFahrzeuge() {
        return anzahlFahrzeuge;
    }

    private final String marke;
    private final String modell;
    private final int baujahr;
    private int kilometerstand;
    public Fahrzeug(String marke, String modell) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = java.time.Year.now().getValue();
        this.kilometerstand = 0;
        anzahlFahrzeuge++;
    }

    public String getMarke() {
        return this.marke;
    }
    public String getModell() {
        return modell;
    }
    public int getBaujahr() {
        return baujahr;
    }
    public int getKilometerstand() {
        return kilometerstand;
    }
    public void increaseKilometerstand(int kilometer) {
        if (kilometer < 0) {
            throw new IllegalArgumentException("Kilometerstand darf nicht negativ sein");
        }
        kilometerstand += kilometer;
    }

    public void fahren() {
        System.out.println("brumm brumm");
    }
    public void hupen() {
        System.out.println("tut tut");
    }

}
