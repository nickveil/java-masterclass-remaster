package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByteNumber = 10;
        short myShortNumber = 20;
        int myIntNumber = 50;
        long myLongTotal = 50000L + 10L * (myByteNumber + myShortNumber + myIntNumber);
        System.out.println(myLongTotal);

        short shortTotal = (short) (1000 + 10 *
                (myByteNumber + myShortNumber + myIntNumber));
    }
}
