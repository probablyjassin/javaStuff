package com.baLeipzig.jassin;

import com.baLeipzig.jassin.Fahrzeug;

public class ObjektDemo {
    public static void main(String[] args) {
        // 1. Objekt erzeugen
        // create fahrzeug object with given attributes
        Fahrzeug fahrzeug = new Fahrzeug("BMW", "X5");

        fahrzeug.increaseKilometerstand(100);

        System.out.println(fahrzeug.getMarke());
        System.out.println(fahrzeug.getKilometerstand());
        System.out.println(fahrzeug.getBaujahr());
        fahrzeug.fahren();
        fahrzeug.hupen();

        Fahrzeug fahrzeug2 = new Fahrzeug("Audi", "A4");


        System.out.println(Fahrzeug.getanzahlFahrzeuge());
    }
}
