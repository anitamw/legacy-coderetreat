
package com.adaptionsoft.games.trivia.runner;

import com.adaptionsoft.games.uglytrivia.Game;

import java.util.Random;
import java.util.Scanner;


public class GameRunner {
    private static boolean notAWinner;
    private final PlayerInput mIn;
    private final GameOutput mOut;

    public GameRunner(PlayerInput in, GameOutput out) {
        mIn = in;
        mOut = out;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        GameRunner runner = new GameRunner(new PlayerInput() {
            @Override
            public String readLine() {
                return scanner.nextLine();
            }
        }, new GameOutput() {
            @Override
            public void printLine(String line) {
                System.out.println(line);
            }
        });
        runner.run(args);
    }

    public void run(String[] args) {
        Random rand;
        switch (args.length) {
            case 0:
                rand = new Random();
                break;
            default:
                if (args[0].equals("--play")) {
                    mOut.printLine("How many players?");
                    String answer = mIn.readLine();
                    int number = Integer.parseInt(answer);
                    mOut.printLine("Game created with " + number + " players");
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
