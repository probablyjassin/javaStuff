package com.probablyjassin.hellogame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.probablyjassin.hellogame.Classes.GameState;
import com.probablyjassin.hellogame.gameUtils;

public class GameMain {

    public static void main(String[] args)
            throws IOException {

        System.out.println("Welcome!");
        System.out.println("Press the enter key to start the game!");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // just accept any input to start the game
        reader.readLine();

        GameState.getInstance().setStarted(true);

        gameUtils.printGameGrid();

        System.out.println("Game started!");

        // game loop
        while(GameState.getInstance().isStarted()) {
            System.out.println("Guess a field (e.g. 'E4'): ");
            String guess = reader.readLine();
            System.out.println("You entered: " + guess);
        }
    }
}
