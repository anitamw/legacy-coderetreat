package com.adaptionsoft.games.uglytrivia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Game {
    List<String> players = new ArrayList<>();
    int[] places = new int[6];
    int[] purses = new int[6];
    boolean[] inPenaltyBox = new boolean[6];

    List<String> popQuestions = new LinkedList<>();
    List<String> scienceQuestions = new LinkedList<>();
    List<String> sportsQuestions = new LinkedList<>();
    List<String> rockQuestions = new LinkedList<>();

    int currentPlayer = 0;
    boolean isGettingOutOfPenaltyBox;
    private boolean waitingForAnswer;

    public Game() {
        for (int i = 1; i <= 50; i++) {
            popQuestions.add("Pop Question " + i);
            scienceQuestions.add(("Science Question " + i));
            sportsQuestions.add(("Sports Question " + i));
            rockQuestions.add("Rock Question " + i);
        }
    }

    public boolean add(String playerName) {
        players.add(playerName);
        int i = howManyPlayers();
        initStateForPlayer(i);
        printPlayerAdded(playerName, i);
        return true;
    }

    private void initStateForPlayer(int i) {
        places[i] = 0;
        purses[i] = 0;
        inPenaltyBox[i] = false;
    }

    public int howManyPlayers() {
        return players.size();
    }

    public void roll(int roll) {
        checkRollIsLegal(roll);
        printPlayersRoll(roll, players.get(currentPlayer));
        if (inPenaltyBox[currentPlayer]) {
            isGettingOutOfPenaltyBox = isLucky(roll);
            printPenaltyBoxStatus(players.get(currentPlayer), isGettingOutOfPenaltyBox);
        }
        if (inPenaltyBox[currentPlayer] && !isGettingOutOfPenaltyBox) {
            return;
        }
        places[currentPlayer] = updatePosition(roll, places[currentPlayer]);
        printPlayerLocation(currentPlayer);
        askQuestion();
        waitingForAnswer = true;
    }

    private void checkRollIsLegal(int roll) {
        if (players.size() < 1) {
            throw new IllegalStateException("Must add at least one player before rolling");
        }
        if (waitingForAnswer) {
            throw new IllegalStateException(players.get(currentPlayer) + " must answer before " +
                    "the next player can roll");
        }
        if (roll < 1 || roll > 6) {
            throw new IllegalArgumentException("Roll must be between 1 and 6 (inclusive)");
        }
    }

    private void printPlayerLocation(int playerIndex) {
        System.out.println(players.get(playerIndex) + "'s new location is " + places[playerIndex]);
        System.out.println("The category is " + currentCategory());
    }

    private void printPlayersRoll(int roll, String playerName) {
        System.out.println(playerName + " is the current player");
        System.out.println("They have rolled a " + roll);
    }

    private void askQuestion() {
        if (Objects.equals(currentCategory(), "Pop"))
            System.out.println(popQuestions.remove(0));
        if (Objects.equals(currentCategory(), "Science"))
            System.out.println(scienceQuestions.remove(0));
        if (Objects.equals(currentCategory(), "Sports"))
            System.out.println(sportsQuestions.remove(0));
        if (Objects.equals(currentCategory(), "Rock"))
            System.out.println(rockQuestions.remove(0));
    }

    private String currentCategory() {
        switch (places[currentPlayer] % 4) {
            case 0:
                return "Pop";
            case 1:
                return "Science";
            case 2:
                return "Sports";
            case 3:
                return "Rock";
        }
        return null; // should never happen
    }


    public void wasCorrectlyAnswered() {
        waitingForAnswer = false;
        if (inPenaltyBox[currentPlayer] && !isGettingOutOfPenaltyBox) {
            currentPlayer = getNextPlayerIndex(currentPlayer, players.size());
            return;
        }
        printAnswerWasCorrect();
        cancelAnyPenalty();
        purses[currentPlayer]++;
        printPlayerPurse(currentPlayer);
        if (won()) {
            printGameWon(players.get(currentPlayer));
            return;
        }
        currentPlayer = getNextPlayerIndex(currentPlayer, players.size());
    }

    private void cancelAnyPenalty() {
        if (inPenaltyBox[currentPlayer]) {
            inPenaltyBox[currentPlayer] = false;
            printPlayerEscapedPenaltyBox(players.get(currentPlayer));
        }
    }

    private void printGameWon(String winnerName) {
        System.out.println(winnerName + " won the game!");
    }

    private void printPlayerPurse(int playerIndex) {
        System.out.println(players.get(playerIndex)
                + " now has " + purses[currentPlayer] + " Gold Coins.");
    }

    public void wrongAnswer() {
        waitingForAnswer = false;
        printAnswerWasWrong(players.get(currentPlayer));
        inPenaltyBox[currentPlayer] = true;
        currentPlayer = getNextPlayerIndex(currentPlayer, players.size());
    }

    public boolean won() {
        return purses[currentPlayer] == 6;
    }

    private static int getNextPlayerIndex(int currentPlayer, int numberOfPlayers) {
        return currentPlayer + 1 == numberOfPlayers ? 0 : (currentPlayer + 1);
    }

    private static void printPlayerAdded(String playerName, int playerNumber) {
        System.out.println(playerName + " was added");
        System.out.println("They are player number " + playerNumber);
    }

    private static void printPenaltyBoxStatus(String playerName, boolean isGettingOut) {
        System.out.println(playerName + (isGettingOut ? " is " : " is not ") +
                "getting out of the penalty box");
    }

    private static void printPlayerEscapedPenaltyBox(String playerName) {
        System.out.println(playerName + " got out of the penalty box!");
    }

    private static void printAnswerWasCorrect() {
        System.out.println("Answer was correct!!!!");
    }

    private static void printAnswerWasWrong(String playerName) {
        System.out.println("Question was incorrectly answered");
        System.out.println(playerName + " was sent to the penalty box");
    }

    private static boolean isLucky(int roll) {
        return roll % 2 != 0;
    }

    private static int updatePosition(int roll, int currentPosition) {
        int newPosition = currentPosition + roll;
        if (newPosition > 11) {
            newPosition = newPosition - 12;
        }
        return newPosition;
    }
}
