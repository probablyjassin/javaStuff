package com.baLeipzig.jassin;

import com.baLeipzig.jassin.Fahrzeug;

import java.util.Arrays;

public class ObjektDemo {

    


    public static void main(String[] args) {
        Fahrzeug fahrzeug = new Fahrzeug("BMW", "X5", 5);
        Fahrzeug fahrzeug2 = new Fahrzeug("BMW", "X5", 5);

        System.out.println(fahrzeug.equals(fahrzeug2));

        fahrzeug.increaseKilometerstand(100);

        System.out.println(fahrzeug.getMarke());
        System.out.println(fahrzeug.getKilometerstand());
        System.out.println(fahrzeug.getBaujahr());
        fahrzeug.fahren();
        fahrzeug.hupen();

        Fahrzeug fahrzeug3 = new Fahrzeug("Audi", "A4", 5);


        System.out.println(Fahrzeug.getanzahlFahrzeuge());

        int[] intTestArray = new int[100];
        Fahrzeug[] fahrzeugArray = new Fahrzeug[7];

        for (int i = 0; i < fahrzeugArray.length; i++) {
            fahrzeugArray[i] = new Fahrzeug("BMW", "X5", i);
        }
        for (int i = 1; i < intTestArray.length; i++) {
            intTestArray[i] = i;
        }

        System.out.println(Arrays.toString(intTestArray));
        System.out.println(Arrays.toString(fahrzeugArray));

        String[] stringArray = {"Integer", "Boolean", "Character", "Long", "Double", "Float", "Short", "Byte"};

        Arrays.sort(stringArray);
        for (String s : stringArray) {
            System.out.println(s);
        }

        char acht = '8';
        char x = 'x';
        System.out.println(java.lang.Character.isDigit(acht));
        System.out.println(java.lang.Character.isDigit(x));



        /* int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = [10];
            for (int i = 0; i < 10; i++) {
                for (int i = 0; i < 10; i++) {
                    numbers[i] = i;
                }
            }
        }*/
    }
}
