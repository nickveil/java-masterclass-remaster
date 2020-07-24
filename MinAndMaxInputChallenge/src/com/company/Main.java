package com.company;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while(true){
            System.out.println("Enter number:");
            boolean isNextInt = scanner.hasNextInt();

            if (scanner.hasNextInt()){
                int number = scanner.nextInt();

                if (first){
                    min = number;
                    max = number;
                    first = false;
                }else if (number > max){
                    max = number;
                }else if (number < min){
                    min = number;
                }

            }else{
                System.out.println("Minimum number = " + min + " AND Maximum number = " + max);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}

// Min Max Input Challenge

//-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//        -Before the user enters the number, print the message ÅgEnter number:Åh
//        -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//        Hint:
//        -Use an endless while loop.
//
//        Bonus:
//        -Create a project with the name MinAndMaxInputChallenge.
