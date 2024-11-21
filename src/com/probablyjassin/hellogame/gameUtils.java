package com.probablyjassin.hellogame;

public class gameUtils {
    public static void printGameGrid() {
        String[][] gameGrid = Classes.GameState.getInstance().getGameGrid();

        String[] columnLabels = {" ", "A", "B", "C", "D", "E", "F"};
        for (String label : columnLabels) {
            System.out.print(label + " ");
        }
        System.out.println();

        String bruh = "wiopvhionv";

        for (int i = 0; i < gameGrid.length; i++) {
            System.out.print(i+1 + " ");
            for (String cell : gameGrid[i]) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
