package com.baLeipzig.jassin;

public class Inheritance {

    public static abstract class Vehicle {
        String brand;
        String model;
        int seats;

        int kilometers_driven = 0;

        public abstract void honk();

        private final Lamp mainLight;

        public Vehicle(String marke, String modell, int sitzplaetze) {
            this.brand = marke;
            this.model = modell;
            this.seats = sitzplaetze;
            this.mainLight = new Lamp();
            System.out.println("Fahrzeug erstellt");
        }

        public boolean mainLightStatus() {
            return mainLight.isOn();
        }
        public void mainLightOn() {
            mainLight.anschalten();
        }
        public void mainLightOff() {
            mainLight.ausschalten();
        }

        public void drive(int distance) {
            kilometers_driven += Math.abs(distance);
            System.out.println("brumm brumm");
        }

    }

    public static class LKW extends Vehicle {
        int achsen;
        int zuladung;

        public LKW(String marke, String modell, int sitzplaetze, int achsen, int zuladung) {
            super(marke, modell, sitzplaetze);
            this.achsen = achsen;
            this.zuladung = zuladung;
            System.out.println("LKW erstellt");
        }
        public void honk() {
            System.out.println("HONK HONK");
        }
    }

    public static class PKW extends Vehicle {
        public PKW(String marke, String modell, int sitzplaetze, int achsen) {
            super(marke, modell, sitzplaetze);
            System.out.println("PKW erstellt");
        }
        public void honk() {
            System.out.println("honk honk");
        }
    }

    public static class Bike extends Vehicle {
        public Bike(String marke, String modell) {
            super(marke, modell, 1);
            System.out.println("Fahrrad erstellt");
        }
        public void honk() {
            System.out.println("ring ring");
        }
    }

    public static class Lamp {
        private boolean isOn = false;
        public void anschalten() {
            isOn = true;
        }
        public void ausschalten() {
            isOn = false;
        }
        public boolean isOn() {
            return isOn;
        }
    }

    public static void main(String[] args) {
        //Vehicle meinAuto = new Vehicle("VW", "Golf", 5);
        // Simple Car
        //System.out.println(meinAuto.model);

        // Bike
        Bike meinFahrrad = new Bike("KTM", "Mountainbike");
        meinFahrrad.honk();

        // PKW
        PKW meinPKW = new PKW("VW", "Golf", 5, 2);
        meinPKW.drive(100);

        // Truck
        LKW meinLKW = new LKW("VW", "Transporter", 3, 2, 2000);
        meinLKW.drive(100);
        meinLKW.mainLightOn();
        System.out.println(meinLKW.mainLightStatus());
        meinLKW.honk();
        System.out.println(meinLKW.kilometers_driven);
    }
}
