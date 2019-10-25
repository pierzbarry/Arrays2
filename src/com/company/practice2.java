package com.company;

import javax.crypto.spec.PSource;
import java.util.Scanner;

// this is not actually what you're asked to do but I don't cause I do what I want

public class practice2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String word;

        System.out.println("Please type word to find its length.");
        word = key.nextLine();

        for(int i = 0; i < word.length(); i++) {
        }
        System.out.println("The length of " + word + " is " + word.length());
    }
}
