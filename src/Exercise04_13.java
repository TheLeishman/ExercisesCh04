/*
Author: Paul Leishman
Class:  CS 113 Programming in Java
Date:   3/7/25
 */

import java.util.Scanner;

public class Exercise04_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Enter a letter: ");
        String input = scanner.nextLine().toLowerCase();

        // Check if the input is valid
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Invalid input!");
        } else {
            // Check if the letter is a vowel or consonant
            char letter = input.charAt(0);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' 
            		|| letter == 'u') {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        }
    }
}



/*
 * Run #1:
 * Enter a letter: B
 * b is a consonant.
 * 
 * Run #2:
 * Enter a letter: A
 * a is a vowel.
 * 
 * Run #3: 
 * Enter a letter: 1
 * Invalid input!
 * 
 * Run #4:
 * Enter a letter: Cc
 * Invalid input!
 */