package com.baLeipzig.jassin;

public class Durchsuchen {
    public static void main(String[] args) {
        String durchsuchen = "xDurchsuchenx";
        System.out.println(durchsuchen.length());
        System.out.println(durchsuchen.chars().filter(ch -> ch == 'x').count());
        }
}
