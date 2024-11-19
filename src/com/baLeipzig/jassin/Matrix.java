package com.baLeipzig.jassin;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int counter = 1;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = counter;
                counter++;
            }
        }
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
