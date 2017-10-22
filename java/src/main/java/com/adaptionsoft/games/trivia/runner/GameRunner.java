
package com.adaptionsoft.games.trivia.runner;

import com.adaptionsoft.games.uglytrivia.Game;

import java.util.Random;
import java.util.Scanner;


public class GameRunner {
    private static boolean notAWinner;

    public static void main(String[] args) {
        Random rand;
        switch (args.length) {
            case 0:
                rand = new Random();
                break;
            default:
                if (args[0].equals("--play")) {
                    System.out.println("How many players?");
                    Scanner scanner = new Scanner(System.in);
                    scanner.nextLine();
                    return;
                }
                rand = new Random(getSeedFromArg(args[0]));
        }
        Game aGame = new Game();
        aGame.add("Chet");
        aGame.add("Pat");
        aGame.add("Sue");

        do {
            aGame.roll(rand.nextInt(5) + 1);
            if (rand.nextInt(9) == 7) {
                aGame.wrongAnswer();
            } else {
                aGame.wasCorrectlyAnswered();
            }
            notAWinner = !aGame.won();
        } while (notAWinner);

    }

    private static long getSeedFromArg(String arg) {
        long seed;
        try {
            seed = Long.parseLong(arg);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("First arg, if passed, must be a long for random seed");
        }
        return seed;
    }
}
