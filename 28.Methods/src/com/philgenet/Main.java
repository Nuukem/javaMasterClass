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
}
