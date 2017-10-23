package com.adaptionsoft.games.uglytrivia;

import com.adaptionsoft.games.trivia.runner.GameRunner;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;


public class GoldenMasterTests {

    static class FakeInputStream extends InputStream {
        private int nReads = 0;

        @Override
        public int read() throws IOException {
            nReads++;
            return 0;
        }

        public int timesRead() {
            return nReads;
        }
    }

    // @Test
    // Disabled due to input scanning not working.
    // should use soln at https://stackoverflow.com/a/6416591
    public void testPlayableGameAwaitsInput() {
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        FakeInputStream fakeInput = new FakeInputStream();
        System.setIn(fakeInput);

        GameRunner runner = new GameRunner();
        runner.main(new String[]{"--play"});

        assertThat(myOut.toString(), containsString("How many players?"));
        assertThat("Number of times input was read", fakeInput.timesRead(), is(1));
        assertThat(myOut.toString(), containsString("Game created with 2 players"));
    }

    @Test
    public void testMain() throws Exception {
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        GameRunner.main(new String[]{"121"});
        GameRunner.main(new String[]{"12840271"});
        GameRunner.main(new String[]{"74"});
        checkStdOut(myOut);
    }

    private static void checkStdOut(ByteArrayOutputStream myOut) {
        final String standardOutput = myOut.toString();
        final String expectedOutput = "Chet was added\n" +
                "They are player number 1\n" +
                "Pat was added\n" +
                "They are player number 2\n" +
                "Sue was added\n" +
                "They are player number 3\n" +
                "Chet is the current player\n" +
                "They have rolled a 4\n" +
                "Chet's new location is 4\n" +
                "The category is Pop\n" +
                "Pop Question 1\n" +
                "Answer was correct!!!!\n" +
                "Chet now has 1 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 2\n" +
                "Pat's new location is 2\n" +
                "The category is Sports\n" +
                "Sports Question 1\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 1 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 2\n" +
                "Sue's new location is 2\n" +
                "The category is Sports\n" +
                "Sports Question 2\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 1 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 1\n" +
                "Chet's new location is 5\n" +
                "The category is Science\n" +
                "Science Question 1\n" +
                "Question was incorrectly answered\n" +
                "Chet was sent to the penalty box\n" +
                "Pat is the current player\n" +
                "They have rolled a 3\n" +
                "Pat's new location is 5\n" +
                "The category is Science\n" +
                "Science Question 2\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 2 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 4\n" +
                "Sue's new location is 6\n" +
                "The category is Sports\n" +
                "Sports Question 3\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 2 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 2\n" +
                "Chet is not getting out of the penalty box\n" +
                "Pat is the current player\n" +
                "They have rolled a 4\n" +
                "Pat's new location is 9\n" +
                "The category is Science\n" +
                "Science Question 3\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 3 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 2\n" +
                "Sue's new location is 8\n" +
                "The category is Pop\n" +
                "Pop Question 2\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 3 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 5\n" +
                "Chet is getting out of the penalty box\n" +
                "Chet's new location is 10\n" +
                "The category is Sports\n" +
                "Sports Question 4\n" +
                "Answer was correct!!!!\n" +
                "Chet got out of the penalty box!\n" +
                "Chet now has 2 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 1\n" +
                "Pat's new location is 10\n" +
                "The category is Sports\n" +
                "Sports Question 5\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 4 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 5\n" +
                "Sue's new location is 1\n" +
                "The category is Science\n" +
                "Science Question 4\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 4 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 5\n" +
                "Chet's new location is 3\n" +
                "The category is Rock\n" +
                "Rock Question 1\n" +
                "Answer was correct!!!!\n" +
                "Chet now has 3 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 5\n" +
                "Pat's new location is 3\n" +
                "The category is Rock\n" +
                "Rock Question 2\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 5 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 1\n" +
                "Sue's new location is 2\n" +
                "The category is Sports\n" +
                "Sports Question 6\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 5 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 3\n" +
                "Chet's new location is 6\n" +
                "The category is Sports\n" +
                "Sports Question 7\n" +
                "Answer was correct!!!!\n" +
                "Chet now has 4 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 5\n" +
                "Pat's new location is 8\n" +
                "The category is Pop\n" +
                "Pop Question 3\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 6 Gold Coins.\n" +
                "Pat won the game!\n" +
                "Chet was added\n" +
                "They are player number 1\n" +
                "Pat was added\n" +
                "They are player number 2\n" +
                "Sue was added\n" +
                "They are player number 3\n" +
                "Chet is the current player\n" +
                "They have rolled a 5\n" +
                "Chet's new location is 5\n" +
                "The category is Science\n" +
                "Science Question 1\n" +
                "Answer was correct!!!!\n" +
                "Chet now has 1 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 4\n" +
                "Pat's new location is 4\n" +
                "The category is Pop\n" +
                "Pop Question 1\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 1 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 3\n" +
                "Sue's new location is 3\n" +
                "The category is Rock\n" +
                "Rock Question 1\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 1 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 4\n" +
                "Chet's new location is 9\n" +
                "The category is Science\n" +
                "Science Question 2\n" +
                "Answer was correct!!!!\n" +
                "Chet now has 2 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 1\n" +
                "Pat's new location is 5\n" +
                "The category is Science\n" +
                "Science Question 3\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 2 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 3\n" +
                "Sue's new location is 6\n" +
                "The category is Sports\n" +
                "Sports Question 1\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 2 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 3\n" +
                "Chet's new location is 0\n" +
                "The category is Pop\n" +
                "Pop Question 2\n" +
                "Answer was correct!!!!\n" +
                "Chet now has 3 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 3\n" +
                "Pat's new location is 8\n" +
                "The category is Pop\n" +
                "Pop Question 3\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 3 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 5\n" +
                "Sue's new location is 11\n" +
                "The category is Rock\n" +
                "Rock Question 2\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 3 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 5\n" +
                "Chet's new location is 5\n" +
                "The category is Science\n" +
                "Science Question 4\n" +
                "Answer was correct!!!!\n" +
                "Chet now has 4 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 2\n" +
                "Pat's new location is 10\n" +
                "The category is Sports\n" +
                "Sports Question 2\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 4 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 5\n" +
                "Sue's new location is 4\n" +
                "The category is Pop\n" +
                "Pop Question 4\n" +
                "Question was incorrectly answered\n" +
                "Sue was sent to the penalty box\n" +
                "Chet is the current player\n" +
                "They have rolled a 2\n" +
                "Chet's new location is 7\n" +
                "The category is Rock\n" +
                "Rock Question 3\n" +
                "Answer was correct!!!!\n" +
                "Chet now has 5 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 3\n" +
                "Pat's new location is 1\n" +
                "The category is Science\n" +
                "Science Question 5\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 5 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 2\n" +
                "Sue is not getting out of the penalty box\n" +
                "Chet is the current player\n" +
                "They have rolled a 2\n" +
                "Chet's new location is 9\n" +
                "The category is Science\n" +
                "Science Question 6\n" +
                "Question was incorrectly answered\n" +
                "Chet was sent to the penalty box\n" +
                "Pat is the current player\n" +
                "They have rolled a 3\n" +
                "Pat's new location is 4\n" +
                "The category is Pop\n" +
                "Pop Question 5\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 6 Gold Coins.\n" +
                "Pat won the game!\n" +
                "Chet was added\n" +
                "They are player number 1\n" +
                "Pat was added\n" +
                "They are player number 2\n" +
                "Sue was added\n" +
                "They are player number 3\n" +
                "Chet is the current player\n" +
                "They have rolled a 4\n" +
                "Chet's new location is 4\n" +
                "The category is Pop\n" +
                "Pop Question 1\n" +
                "Answer was correct!!!!\n" +
                "Chet now has 1 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 2\n" +
                "Pat's new location is 2\n" +
                "The category is Sports\n" +
                "Sports Question 1\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 1 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 4\n" +
                "Sue's new location is 4\n" +
                "The category is Pop\n" +
                "Pop Question 2\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 1 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 4\n" +
                "Chet's new location is 8\n" +
                "The category is Pop\n" +
                "Pop Question 3\n" +
                "Question was incorrectly answered\n" +
                "Chet was sent to the penalty box\n" +
                "Pat is the current player\n" +
                "They have rolled a 3\n" +
                "Pat's new location is 5\n" +
                "The category is Science\n" +
                "Science Question 1\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 2 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 5\n" +
                "Sue's new location is 9\n" +
                "The category is Science\n" +
                "Science Question 2\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 2 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 1\n" +
                "Chet is getting out of the penalty box\n" +
                "Chet's new location is 9\n" +
                "The category is Science\n" +
                "Science Question 3\n" +
                "Answer was correct!!!!\n" +
                "Chet got out of the penalty box!\n" +
                "Chet now has 2 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 5\n" +
                "Pat's new location is 10\n" +
                "The category is Sports\n" +
                "Sports Question 2\n" +
                "Question was incorrectly answered\n" +
                "Pat was sent to the penalty box\n" +
                "Sue is the current player\n" +
                "They have rolled a 2\n" +
                "Sue's new location is 11\n" +
                "The category is Rock\n" +
                "Rock Question 1\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 3 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 4\n" +
                "Chet's new location is 1\n" +
                "The category is Science\n" +
                "Science Question 4\n" +
                "Answer was correct!!!!\n" +
                "Chet now has 3 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 5\n" +
                "Pat is getting out of the penalty box\n" +
                "Pat's new location is 3\n" +
                "The category is Rock\n" +
                "Rock Question 2\n" +
                "Answer was correct!!!!\n" +
                "Pat got out of the penalty box!\n" +
                "Pat now has 3 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 4\n" +
                "Sue's new location is 3\n" +
                "The category is Rock\n" +
                "Rock Question 3\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 4 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 4\n" +
                "Chet's new location is 5\n" +
                "The category is Science\n" +
                "Science Question 5\n" +
                "Answer was correct!!!!\n" +
                "Chet now has 4 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 5\n" +
                "Pat's new location is 8\n" +
                "The category is Pop\n" +
                "Pop Question 4\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 4 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 4\n" +
                "Sue's new location is 7\n" +
                "The category is Rock\n" +
                "Rock Question 4\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 5 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 2\n" +
                "Chet's new location is 7\n" +
                "The category is Rock\n" +
                "Rock Question 5\n" +
                "Answer was correct!!!!\n" +
                "Chet now has 5 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 2\n" +
                "Pat's new location is 10\n" +
                "The category is Sports\n" +
                "Sports Question 3\n" +
                "Answer was correct!!!!\n" +
                "Pat now has 5 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 2\n" +
                "Sue's new location is 9\n" +
                "The category is Science\n" +
                "Science Question 6\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 6 Gold Coins.\n" +
                "Sue won the game!\n";

        List<String> expectedLines = Arrays.asList(expectedOutput.split("\n"));
        List<String> actualLines = Arrays.asList(standardOutput.toString().split("\n"));
        for (int i = 0; i < Math.min(expectedLines.size(), actualLines.size()); i++) {
            assertThat("Mismatch on line " + i, actualLines.get(i), is(expectedLines.get(i)));
        }
        assertThat(actualLines, hasSize(expectedLines.size()));
    }
}
