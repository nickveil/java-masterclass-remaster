package com.company;

public class Main {

    public static void main(String[] args) {
	    int value = 1;
	    if (value == 1){
            System.out.println("value equals 1");
        }else if (value==2){
            System.out.println("Value equals 2");
        }else {
            System.out.println("Value was not 1 or 2");
        }

	    int switchValue = 5;

	    switch (switchValue){
            case 1:
                System.out.println("Value equals 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3 or 4 or 5");
                break;
            default:
                System.out.println("was not 1 or 2");
        }

        char switchLetter = 'd';

	    switch (switchLetter){
            case 'A':
                System.out.println("You found A");
                break;
            case 'B':
                System.out.println("You found B");
                break;
            case 'C':
                System.out.println("You found C");
                break;
            case 'D':
                System.out.println("You found D");
                break;
            case 'E':
                System.out.println("You found E");
                break;
            default:
                System.out.println("Sorry we couldn't find that char");
                break;
        }

        String month = "FebruarY";

	    switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
