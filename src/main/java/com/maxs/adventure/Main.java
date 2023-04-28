package com.maxs.adventure;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;

public class Main {


    final static String myMakersName = "JAY";

    final static String HELLO_WORLD_MESSAGE = "Hello World";



    public static void main(String[] args) throws IOException {
        // This will be a main class that can be run in the terminal


        Number newNumber = new Number();


        final int number = newNumber.returnNumber();

//        // Simple Hello World will be first.
//
//        System.out.println(HELLO_WORLD_MESSAGE);

        // Then read from terminal input using System.In and Buffered reader
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("What is your name?");
//
//        String userInput = bufferedReader.readLine();
//
//        System.out.println("Hello " + userInput);
//
//        int number2 = 2;
//
//        if(number != 18 || number2 < 100){
//            setMessage("true");
//        } else {
//            // RUN ME !!!!
//        }
//
        if(true){
            // run
            if(false){
                // run
                if(true){

                } else {
                    if(true){

                    }
                }
            }
        }

        switch(number){
            case 1: {

                break;
            }
            case 2: {

                break;
            }
        }
//
//        if(number != 1){
//            setMessage("false");
//        }
//
//        System.out.println(HELLO_WORLD_MESSAGE);

        // Explain the different data types i.e string, int , double

        int integer = 1; // whole numbers

        double nm = 1.5;

        String string = "C HASH INIT";

        char[] charArray = string.toCharArray();

        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < 11; i++){
            System.out.println("Im adding a character, that character is " + charArray[i]);
            arrayList.add(String.valueOf(charArray[i]));

        }

        System.out.println(arrayList.size());

        System.out.print(arrayList);

        arrayList.add("!");

        System.out.println(arrayList.size());

        System.out.println(arrayList);

        var data = new Number();

        char character = 'C';

        // Show if/else, and switch

        // show classes methods and interfaces

        // Explain the first big-ish project

        // git advice

    }

    private static void setMessage(String message){
        System.out.println(HELLO_WORLD_MESSAGE);
        System.out.println(message);
    }


}
