package Morsecode;

import java.util.Scanner;

public class morseCode {
    public static void main(String[] args) {


        Converter converter = new Converter();

        Scanner scan = new Scanner(System.in);
        String letter = scan.nextLine();


        if (letter.contains("*") || letter.contains("-")) {
            String myLetter = converter.toLetter(letter);
            System.out.println("You wrote " + myLetter);

        } else if (letter.contains("@") || letter.contains("!")) { //detta är en felhantering
            System.out.println("Invalid characters");

        } else if (letter.contains("\t") || letter.contains("#")) { //detta är en felhantering
            System.out.println("You have entered a tab space or #, please use letters");

        } else {
            String ToMorse = converter.toMorse(letter);
            System.out.println("Your morse code " + ToMorse);
        }


    }


}

