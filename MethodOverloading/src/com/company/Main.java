package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("The new score is " + newScore);
        calculateScore(75);
        calculateScore();
        int feet = 0;
        int inches = 13;
        System.out.println(feet + " feet " + inches + " inches converts to " + calcFeetAndInchesToCentimeters(feet, inches) + " cm!");
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " +playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore( int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name no score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet>=0 && (inches >= 0 && inches<=12)){
            double totalInches = (feet * 12) + inches;
            return calcFeetAndInchesToCentimeters(totalInches);
        }
        System.out.println("invalid input");
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            return inches*2.54;
        }
        System.out.println("invalid input");
        return -1;
    }
}
