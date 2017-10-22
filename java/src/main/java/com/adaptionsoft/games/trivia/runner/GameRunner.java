
package com.adaptionsoft.games.trivia.runner;
import com.adaptionsoft.games.uglytrivia.Game;

import java.util.Random;


public class GameRunner {
	private static boolean notAWinner;

	public static void main(String[] args) {
		Game aGame = new Game();
		
		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");

		Random rand;
        rand = args.length > 0 ? new Random(getSeedFromArgs(args)) : new Random();
	
		do {
			aGame.roll(rand.nextInt(5) + 1);
			if (rand.nextInt(9) == 7) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}
		} while (notAWinner);
		
	}

	private static long getSeedFromArgs(String[] args) {
		long seed;
		try {
             seed = Long.parseLong(args[0]);
         } catch (NumberFormatException nfe) {
             throw new IllegalArgumentException("First arg, if passed, must be a long for random seed");
         }
		return seed;
	}
}
