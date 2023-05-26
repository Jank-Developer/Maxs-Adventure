package com.maxs.adventure;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initiate scanner and generate random number
        Scanner scanner = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());

        //Establish total guesses
        int guesses = 10;
        int attempt, guess;

        //User instructions
        System.out.println("A Number has been selected. ");
        System.out.println("It is between 1 and 100. ");
        System.out.println("You have " + guesses + " guesses. ");

        //Establish guessing loop (users interaction) attempts start at 0 and increment 1 each time a guess is made.
        for (attempt = 0; attempt < guesses; attempt++){

            System.out.println("Take your guess.");

            guess = scanner.nextInt();

            if (number == guess) {
                System.out.println("YOU ARE A WINNER!");
                break;
            }
            else if (number > guess){
                System.out.println("WRONG! " + guess +" is too LOW!");
            }
            else if (number < guess)
                System.out.println("WRONG! " + guess +" is too HIGH!");
        }

        /**
         * LOOK HERE !!!!! if you move this out of the loop you can get rid of the && conditions
         *
         * HOWEVER, there was nothing wrong with your thinking I could clearly see your logic!!
         * The mistakes with the logic worked and technically correct but were doing more than it needed
         * this is all very expected and every beginner would do! I put your solution under commented out so
         * you can take a look at what I mean.
         *
         * FIRST MISSION COMPLETE (o゜▽゜)o☆
         */

        if (attempt == guesses) {
            System.out.println("STRRRIKE!. Try again!");
            System.out.println("The answer was " + number );
        }


    }

//    import java.util.Scanner;
//
//    public class Main {
//        public static void main(String[] args) {
//// Initiate scanner and generate random number
//            Scanner scanner = new Scanner(System.in);
//            int number = 1 + (int) (100 * Math.random());
//
////Establish total guesses
//            int guesses = 5;
//            int attempt, guess;
//
////User instructions
//            System.out.println("A Number has been selected. ");
//            System.out.println("It is between 1 and 100. ");
//            System.out.println("You have " + guesses + " guesses. ");
//
////Establish guessing loop (users interaction) attempts start at 0 and increment 1 each time a guess is made.
//            for (attempt = 0; attempt < guesses; attempt++){
//
//                System.out.println("Take your guess.");
//
//                guess = scanner.nextInt();
//
//                if (number == guess) {
//                    System.out.println("YOU ARE A WINNER!");
//                    break;
//                }
//                else if (number > guess && attempt != guesses - 1){
//                    System.out.println("WRONG! " + guess +" is too LOW!");
//                }
//                else if (number < guess && attempt != guesses - 1)
//                    System.out.println("WRONG! " + guess +" is too HIGH!");
//
//            }
//            if (guesses == attempt) {
//
//                System.out.println("STRRRIKE!. Try again!");
//                System.out.println("The answer was " + number );
//            }
//
//        }
//    }
}