package com.adaptionsoft.games.trivia.runner;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertArrayEquals;


public class GoldenMasterTests {

    @Test
    public void testMain() throws Exception {
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        GameRunner runner = new GameRunner();
        for (int i = 0; i < 3; i++) {
            runner.main(new String[]{"121"});
            runner.main(new String[]{"12840271"});
            runner.main(new String[]{"74"});
        }
        checkStdOut(myOut);
    }

    private static void checkStdOut(ByteArrayOutputStream myOut) {
        final String standardOutput = myOut.toString();
        final String expectedOutput =
                "Chet was added\n" +
                        "They are player number 1\n" +
                        "Pat was added\n" +
                        "They are player number 2\n" +
                        "Sue was added\n" +
                        "They are player number 3\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 0\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 1 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 2\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 1\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 1 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 2\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 1 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 1\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 3\n" +
                        "Question was incorrectly answered\n" +
                        "Chet was sent to the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 4\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 2 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 4\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 5\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 2 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 2\n" +
                        "Chet is not getting out of the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 4\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 6\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 3 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 7\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 3 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 5\n" +
                        "Chet is getting out of the penalty box\n" +
                        "Chet's new location is 5\n" +
                        "The category is Science\n" +
                        "Science Question 0\n" +
                        "Answer was correct!!!!\n" +
                        "Chet now has 2 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 1\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 8\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 4 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 5\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 9\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 4 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 5\n" +
                        "Chet is getting out of the penalty box\n" +
                        "Chet's new location is 10\n" +
                        "The category is Sports\n" +
                        "Sports Question 0\n" +
                        "Answer was correct!!!!\n" +
                        "Chet now has 3 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 10\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 5 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 1\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 11\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 5 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 3\n" +
                        "Chet is getting out of the penalty box\n" +
                        "Chet's new location is 1\n" +
                        "The category is Science\n" +
                        "Science Question 1\n" +
                        "Answer was correct!!!!\n" +
                        "Chet now has 4 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 12\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 6 Gold Coins.\n" +
                        "Chet was added\n" +
                        "They are player number 1\n" +
                        "Pat was added\n" +
                        "They are player number 2\n" +
                        "Sue was added\n" +
                        "They are player number 3\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 5\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 0\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 1 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 4\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 1\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 1 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 3\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 2\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 1 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 3\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 2 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 1\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 4\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 2 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 3\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 5\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 2 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 3\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 6\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 3 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 7\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 3 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 5\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 8\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 3 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 5\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 9\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 4 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 2\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 10\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 4 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 5\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 11\n" +
                        "Question was incorrectly answered\n" +
                        "Sue was sent to the penalty box\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 2\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 12\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 5 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 13\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 5 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue is not getting out of the penalty box\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 2\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 14\n" +
                        "Question was incorrectly answered\n" +
                        "Chet was sent to the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 15\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 6 Gold Coins.\n" +
                        "Chet was added\n" +
                        "They are player number 1\n" +
                        "Pat was added\n" +
                        "They are player number 2\n" +
                        "Sue was added\n" +
                        "They are player number 3\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 0\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 1 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 2\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 1\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 1 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 4\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 2\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 1 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 3\n" +
                        "Question was incorrectly answered\n" +
                        "Chet was sent to the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 4\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 2 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 5\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 5\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 2 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 1\n" +
                        "Chet is getting out of the penalty box\n" +
                        "Chet's new location is 1\n" +
                        "The category is Science\n" +
                        "Science Question 0\n" +
                        "Answer was correct!!!!\n" +
                        "Chet now has 2 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 6\n" +
                        "Question was incorrectly answered\n" +
                        "Pat was sent to the penalty box\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 7\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 3 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet is not getting out of the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat is getting out of the penalty box\n" +
                        "Pat's new location is 5\n" +
                        "The category is Science\n" +
                        "Science Question 1\n" +
                        "Answer was correct!!!!\n" +
                        "Pat now has 3 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 4\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 8\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 4 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet is not getting out of the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat is getting out of the penalty box\n" +
                        "Pat's new location is 10\n" +
                        "The category is Sports\n" +
                        "Sports Question 0\n" +
                        "Answer was correct!!!!\n" +
                        "Pat now has 4 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 4\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 9\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 5 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 2\n" +
                        "Chet is not getting out of the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 2\n" +
                        "Pat is not getting out of the penalty box\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 10\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 6 Gold Coins.\n" +
                        "Chet was added\n" +
                        "They are player number 1\n" +
                        "Pat was added\n" +
                        "They are player number 2\n" +
                        "Sue was added\n" +
                        "They are player number 3\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 0\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 1 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 2\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 1\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 1 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 2\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 1 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 1\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 3\n" +
                        "Question was incorrectly answered\n" +
                        "Chet was sent to the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 4\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 2 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 4\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 5\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 2 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 2\n" +
                        "Chet is not getting out of the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 4\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 6\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 3 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 7\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 3 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 5\n" +
                        "Chet is getting out of the penalty box\n" +
                        "Chet's new location is 5\n" +
                        "The category is Science\n" +
                        "Science Question 0\n" +
                        "Answer was correct!!!!\n" +
                        "Chet now has 2 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 1\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 8\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 4 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 5\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 9\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 4 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 5\n" +
                        "Chet is getting out of the penalty box\n" +
                        "Chet's new location is 10\n" +
                        "The category is Sports\n" +
                        "Sports Question 0\n" +
                        "Answer was correct!!!!\n" +
                        "Chet now has 3 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 10\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 5 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 1\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 11\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 5 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 3\n" +
                        "Chet is getting out of the penalty box\n" +
                        "Chet's new location is 1\n" +
                        "The category is Science\n" +
                        "Science Question 1\n" +
                        "Answer was correct!!!!\n" +
                        "Chet now has 4 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 12\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 6 Gold Coins.\n" +
                        "Chet was added\n" +
                        "They are player number 1\n" +
                        "Pat was added\n" +
                        "They are player number 2\n" +
                        "Sue was added\n" +
                        "They are player number 3\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 5\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 0\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 1 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 4\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 1\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 1 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 3\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 2\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 1 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 3\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 2 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 1\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 4\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 2 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 3\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 5\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 2 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 3\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 6\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 3 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 7\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 3 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 5\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 8\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 3 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 5\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 9\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 4 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 2\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 10\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 4 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 5\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 11\n" +
                        "Question was incorrectly answered\n" +
                        "Sue was sent to the penalty box\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 2\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 12\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 5 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 13\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 5 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue is not getting out of the penalty box\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 2\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 14\n" +
                        "Question was incorrectly answered\n" +
                        "Chet was sent to the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 15\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 6 Gold Coins.\n" +
                        "Chet was added\n" +
                        "They are player number 1\n" +
                        "Pat was added\n" +
                        "They are player number 2\n" +
                        "Sue was added\n" +
                        "They are player number 3\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 0\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 1 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 2\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 1\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 1 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 4\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 2\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 1 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 3\n" +
                        "Question was incorrectly answered\n" +
                        "Chet was sent to the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 4\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 2 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 5\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 5\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 2 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 1\n" +
                        "Chet is getting out of the penalty box\n" +
                        "Chet's new location is 1\n" +
                        "The category is Science\n" +
                        "Science Question 0\n" +
                        "Answer was correct!!!!\n" +
                        "Chet now has 2 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 6\n" +
                        "Question was incorrectly answered\n" +
                        "Pat was sent to the penalty box\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 7\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 3 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet is not getting out of the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat is getting out of the penalty box\n" +
                        "Pat's new location is 5\n" +
                        "The category is Science\n" +
                        "Science Question 1\n" +
                        "Answer was correct!!!!\n" +
                        "Pat now has 3 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 4\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 8\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 4 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet is not getting out of the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat is getting out of the penalty box\n" +
                        "Pat's new location is 10\n" +
                        "The category is Sports\n" +
                        "Sports Question 0\n" +
                        "Answer was correct!!!!\n" +
                        "Pat now has 4 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 4\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 9\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 5 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 2\n" +
                        "Chet is not getting out of the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 2\n" +
                        "Pat is not getting out of the penalty box\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 10\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 6 Gold Coins.\n" +
                        "Chet was added\n" +
                        "They are player number 1\n" +
                        "Pat was added\n" +
                        "They are player number 2\n" +
                        "Sue was added\n" +
                        "They are player number 3\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 0\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 1 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 2\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 1\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 1 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 2\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 1 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 1\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 3\n" +
                        "Question was incorrectly answered\n" +
                        "Chet was sent to the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 4\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 2 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 4\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 5\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 2 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 2\n" +
                        "Chet is not getting out of the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 4\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 6\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 3 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 7\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 3 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 5\n" +
                        "Chet is getting out of the penalty box\n" +
                        "Chet's new location is 5\n" +
                        "The category is Science\n" +
                        "Science Question 0\n" +
                        "Answer was correct!!!!\n" +
                        "Chet now has 2 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 1\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 8\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 4 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 5\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 9\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 4 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 5\n" +
                        "Chet is getting out of the penalty box\n" +
                        "Chet's new location is 10\n" +
                        "The category is Sports\n" +
                        "Sports Question 0\n" +
                        "Answer was correct!!!!\n" +
                        "Chet now has 3 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 10\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 5 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 1\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 11\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 5 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 3\n" +
                        "Chet is getting out of the penalty box\n" +
                        "Chet's new location is 1\n" +
                        "The category is Science\n" +
                        "Science Question 1\n" +
                        "Answer was correct!!!!\n" +
                        "Chet now has 4 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 12\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 6 Gold Coins.\n" +
                        "Chet was added\n" +
                        "They are player number 1\n" +
                        "Pat was added\n" +
                        "They are player number 2\n" +
                        "Sue was added\n" +
                        "They are player number 3\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 5\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 0\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 1 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 4\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 1\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 1 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 3\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 2\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 1 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 3\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 2 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 1\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 4\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 2 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 3\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 5\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 2 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 3\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 6\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 3 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 7\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 3 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 5\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 8\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 3 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 5\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 9\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 4 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 2\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 10\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 4 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 5\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 11\n" +
                        "Question was incorrectly answered\n" +
                        "Sue was sent to the penalty box\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 2\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 12\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 5 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 13\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 5 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue is not getting out of the penalty box\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 2\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 14\n" +
                        "Question was incorrectly answered\n" +
                        "Chet was sent to the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 15\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 6 Gold Coins.\n" +
                        "Chet was added\n" +
                        "They are player number 1\n" +
                        "Pat was added\n" +
                        "They are player number 2\n" +
                        "Sue was added\n" +
                        "They are player number 3\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 0\n" +
                        "Answer was corrent!!!!\n" +
                        "Chet now has 1 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 2\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 1\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 1 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 4\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 2\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 1 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 3\n" +
                        "Question was incorrectly answered\n" +
                        "Chet was sent to the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 3\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 4\n" +
                        "Answer was corrent!!!!\n" +
                        "Pat now has 2 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 5\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 5\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 2 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 1\n" +
                        "Chet is getting out of the penalty box\n" +
                        "Chet's new location is 1\n" +
                        "The category is Science\n" +
                        "Science Question 0\n" +
                        "Answer was correct!!!!\n" +
                        "Chet now has 2 Gold Coins.\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 6\n" +
                        "Question was incorrectly answered\n" +
                        "Pat was sent to the penalty box\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 7\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 3 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet is not getting out of the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat is getting out of the penalty box\n" +
                        "Pat's new location is 5\n" +
                        "The category is Science\n" +
                        "Science Question 1\n" +
                        "Answer was correct!!!!\n" +
                        "Pat now has 3 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 4\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 8\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 4 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 4\n" +
                        "Chet is not getting out of the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 5\n" +
                        "Pat is getting out of the penalty box\n" +
                        "Pat's new location is 10\n" +
                        "The category is Sports\n" +
                        "Sports Question 0\n" +
                        "Answer was correct!!!!\n" +
                        "Pat now has 4 Gold Coins.\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 4\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 9\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 5 Gold Coins.\n" +
                        "Chet is the current player\n" +
                        "They have rolled a 2\n" +
                        "Chet is not getting out of the penalty box\n" +
                        "Pat is the current player\n" +
                        "They have rolled a 2\n" +
                        "Pat is not getting out of the penalty box\n" +
                        "Sue is the current player\n" +
                        "They have rolled a 2\n" +
                        "Sue's new location is 0\n" +
                        "The category is Pop\n" +
                        "Pop Question 10\n" +
                        "Answer was corrent!!!!\n" +
                        "Sue now has 6 Gold Coins.\n";

        String[] expectedLines = expectedOutput.split("\n");
        String[] actualLines = standardOutput.toString().split("\n");
        assertArrayEquals(expectedLines, actualLines);
    }
}