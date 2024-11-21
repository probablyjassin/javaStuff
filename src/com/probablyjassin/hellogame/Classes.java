package com.probablyjassin.hellogame;

import java.util.Arrays;

public class Classes {

    public static final class GameState {

        private static GameState INSTANCE;
        private boolean isStarted = false;

        private int carsUsed = 0;

        private String[][] gameGrid = new String[6][6];
        {
            for (String[] strings : gameGrid) {
                for (int i = 0; i < strings.length; i++) {

                    int maxCars = 4;

                    if (carsUsed >= maxCars) {
                        strings[i] = "?N";
                        continue;
                    }

                    double isCar = Math.random();
                    String value = isCar < 0.2 ? "Y" : "N";

                    strings[i] = "?" + value;
                    carsUsed+=1;
                }
            }
        }

        private GameState() {
        }

        public static GameState getInstance() {
            if(INSTANCE == null) {
                INSTANCE = new GameState();
            }

            return INSTANCE;
        }

        // getters and setters
        public boolean isStarted() {
            return isStarted;
        }
        public void setStarted(boolean started) {
            isStarted = started;
        }

        public String[][] getGameGrid() {
            return gameGrid;
        }
        public void setGameGrid(String[][] gameGrid) {
            this.gameGrid = gameGrid;
        }
    }

    public static class Vehicle {

    }
}
