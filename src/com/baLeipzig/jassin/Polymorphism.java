package com.baLeipzig.jassin;

import com.baLeipzig.jassin.Inheritance.LKW;

public class Polymorphism {
    public static class Werkstatt {
        public void hupeTesten(Inheritance.Vehicle fahrzeug) {
            System.out.printf("Teste Hupe vom %s %s... ", fahrzeug.brand, fahrzeug.model);
            fahrzeug.honk();
        }
    }
    public static void main(String[] args) {
        Werkstatt meineWerstatt = new Werkstatt();
        LKW meinAuto = new LKW("VW", "Golf", 5, 2, 1000);
        meineWerstatt.hupeTesten(meinAuto);
    }
}
