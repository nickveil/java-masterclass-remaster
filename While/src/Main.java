public class Main {
    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//
//        while(true){
//            if (count == 6 ){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        count = 1;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//            if (count > 100){
//                break;
//            }
//        }while(count !=6);

        int number = 5;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            count++;
            if (count >= 5){
                break;
            }
        }
        System.out.println("Total number of even numbers = " + count);

// Challenge

        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false;

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
    }
    public static boolean isEvenNumber(int number){
        return ( number % 2 == 0);
    }
}
