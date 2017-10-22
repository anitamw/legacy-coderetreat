package com.adaptionsoft.games.uglytrivia;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Unit tests for how I think it should work (might end up changing behaviour).
 */
public class GameTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void cannotRollIfNoPlayers() {
        Game g = new Game();
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Must add at least one player before rolling");
        g.roll(3);
    }

    @Test
    public void validRollsWithCorrectAnswersAreFine() {
        Game g = new Game();
        g.add("player");
        for (int i = 1; i <= 6; i++) {
            g.roll(i);
            g.wasCorrectlyAnswered();
        }
    }

    @Test
    public void cannotRollAZero() {
        Game g = new Game();
        g.add("player");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Roll must be between 1 and 6 (inclusive)");
        g.roll(0);
    }

    @Test
    public void cannotRollSeven() {
        Game g = new Game();
        g.add("player");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Roll must be between 1 and 6 (inclusive)");
        g.roll(7);
    }

    @Test
    public void asksQuestionOneOnFirstRoll() {
        Game g = new Game();
        g.add("player");
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        g.roll(1);
        assertThat(myOut.toString(), containsString("Question 1"));
    }

    @Test
    public void canAddTwoPlayers() {
        Game g = new Game();
        g.add("Anita");
        g.add("Cristi");
    }

    @Test
    public void mustAnswerBeforeRollingAgain() {
        Game g = new Game();
        g.add("Player 1");
        g.roll(5);
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Player 1 must answer before the next player can roll");
        g.roll(3);
    }
}