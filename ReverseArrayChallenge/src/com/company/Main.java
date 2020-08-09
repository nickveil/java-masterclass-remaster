package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = {1,2,3,4,5};

        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed Array = " +Arrays.toString(array));
//	    reverse(array);

    }

    private static void reverse(int[] array){

        int maxIndex = array.length-1;
        int halfLength = array.length/2;

        for (int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i]= array[maxIndex-i];
            array[maxIndex-i]=temp;
        }

//        int[] arrayReverse = new int[array.length];
//        int arrayReverseIndex = 0;
//
//        for (int i = array.length-1; i>=0; i--){
//            arrayReverse[arrayReverseIndex] = array[i];
//            arrayReverseIndex++;
//        }
//
//        System.out.println("Array entered: " + Arrays.toString(array));
//        System.out.println("Array reversed: " + Arrays.toString(arrayReverse));
    }
}
