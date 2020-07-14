package com.company;

public class Main {

    public static void main(String[] args) {
//        for(int i = 2; i < 9; i++ ){
//            System.out.println("10000 at " + i + "% interest = "+ String.format("%.2f",calculateInterest(10000.0, i)));
//        }
//        System.out.println("**********************");
//        for(int i = 8; i >=2; i-- ){
//            System.out.println("10000 at " + i + "% interest = "+ String.format("%.2f",calculateInterest(10000.0, i)));
//        }
        int primeCount=0;
        for( int i = 10; i < 50; i++){

            if(isPrime(i)){
                primeCount ++;
                System.out.println("Prime Number " + i + "   Prime Count = " + primeCount);
                if(primeCount == 10){
                    break;
                }

            }

        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n){

        if (n == 1 ){
            return false;
        }
        for (int i=2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
