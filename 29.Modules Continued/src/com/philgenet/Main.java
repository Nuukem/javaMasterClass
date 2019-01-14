package com.philgenet;

public class Main {

    // void = don't return anything!
    // if you want to return data, change void to the datatype you want to return.

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 6000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus); // can either use pre-defined vars, or hard code the values in the method call, like below.
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true,10000, 8,200);
        System.out.println("Your final score was " + highScore);


        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50
        //

        // A VOID method is called a Procedure.  Procedure = Method returning type Void
        // A Method is also known as a Function.

        int playerOnePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Jon", playerOnePosition);

        int playerTwoPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", playerTwoPosition);

        int playerThreePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Manalle", playerThreePosition);

        int playerFourPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Naliece", playerFourPosition);

    }

    // new calculateScore method.
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = -1;

        if (gameOver) {  // stuff in this code block is called "scope"
            finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            // System.out.println("Your final score was " + finalScore);
        }

        return finalScore;

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName + " managed to get into position " + playerPosition);

    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >=500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}

