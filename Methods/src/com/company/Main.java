package com.company;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Nick", 1500);
        displayHighScorePosition("John", 900);
        displayHighScorePosition("Tim", 400);
        displayHighScorePosition("Bill", 50);

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int highScore =calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        highScore =calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);



//        calculateScore(true, 800,5,100);
//        calculateScore(true, 10000, 8,200);
//        calculateScore(false, 10000, 8,200);


    }

//    public static int  calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//
//            return finalScore;
//        }else{
//            return -1;
//        }
//    }

    public static void displayHighScorePosition (String playerName, int playerScore){
        System.out.println(playerName + " managed to get into position "
                + calculateHighScorePosition(playerScore) + " on the high score table!");
    }

    public static int calculateHighScorePosition (int playerScore){
        int playerPosition = 4;
        if (playerScore >= 1000){
            playerPosition = 1;
        }else if (playerScore >= 500){
            playerPosition = 2;
        }else if (playerScore >= 100);{
            playerPosition = 3;
        }

        return playerPosition;
    }
}
