package com.adaptionsoft.games.uglytrivia;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
    public void validRollsAreFine() {
        Game g = new Game();
        g.add("player");
        for (int i = 1; i <= 6; i++) {
            g.roll(i);
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


}